import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ServerThread extends Thread {

    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()))) {
            writer.println("enter role: student or secretary");
            UserRole role = UserRole.valueOf(reader.readLine().toUpperCase());
            switch (role) {
                case STUDENT -> manageStudent(reader, writer);
                case SECRETARY -> manageSecretary(reader, writer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void manageStudent(BufferedReader reader, PrintWriter writer) {
        try {
            writer.println("enter name, grade, income, faculty and scholarship type(regular/special) on separate lines");
            writer.flush();
            String name = reader.readLine();
            double grade = Double.parseDouble(reader.readLine());
            double income = Double.parseDouble(reader.readLine());
            String faculty = reader.readLine();
            ScholarshipType type = ScholarshipType.valueOf(reader.readLine().toUpperCase());
            Document doc = new Document(name, grade, income, faculty, type);
            Lists.waiting.offer(doc);
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    private void manageSecretary(BufferedReader reader, PrintWriter writer) {
        try {
            Document doc = Lists.waiting.poll();
            if (doc == null) {
                writer.println("no more document");
                return;
            }
            writer.println(doc.toString());
            boolean isValid = true;
            int count = 0;
            for (Document document: Lists.correct){
                if(document.equals(doc)){
                    count++;
                }
            }
            switch (doc.getType()) {
                case REGULAR -> {
                    if (doc.getGrade() < 5.5 || doc.getIncome() > 500 || count >5 ) {
                        isValid = false;
                    }
                }
                case SPECIAL -> {
                    if (doc.getGrade() < 5.3 || doc.getIncome() > 300 || count > 5) {
                        isValid = false;

                    }
                }

            }


            if(!isValid){
                writer.println("doesnt match");
                writer.flush();
                Lists.incorrect.offer(doc);
                return;
            }
            writer.println("matches criteria");
            writer.println("enter true to accept of false ot refuse");
            boolean answer = Boolean.parseBoolean(reader.readLine().toLowerCase());
            if(answer){
                Lists.correct.offer(doc);
            } else {
                Lists.incorrect.offer(doc);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
