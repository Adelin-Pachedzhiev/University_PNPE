import java.io.*;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServerThread extends Thread {
    private Socket socket;


    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        PrintWriter writer;
        BufferedReader reader;
        try {
            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String password;
            String username;

            writer.println("enter username");
            writer.flush();
            username = reader.readLine();

            writer.println("enter password");
            writer.flush();
            password = reader.readLine();
            User user = null;
            for (User currUser : FileManager.readFromFile()) {
                if (currUser.getUsername().equals(username) && currUser.getPassword().equals(password)) {
                    user = currUser;
                    break;
                }
            }
            if (user == null) {
                writer.println("user not found");
                writer.flush();
                return;
            }
            switch (user.getUserRole()) {
                case ADMIN -> manageAdmin(reader, writer, (Admin) user);
                case STUDENT -> manageStudent(reader, writer, (Student) user);
                case TEACHER -> manageTeacher(reader, writer, (Teacher) user);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void manageAdmin(BufferedReader reader, PrintWriter writer, Admin admin) {
        try {
            writer.println("enter new user role");
            writer.flush();

            UserRole role = UserRole.valueOf(reader.readLine());

            writer.println("enter username");
            writer.flush();
            String username = reader.readLine();

            writer.println("enter password");
            writer.flush();
            String password = reader.readLine();

            switch (role) {
                case STUDENT -> {
                    if (!Student.isValidPassword(password) || !Student.isValidUsername(username)) {
                        writer.println("Invalid input");
                        return;
                    }
                }
                case TEACHER -> {
                    if (!Teacher.isValidPassword(password) || !Teacher.isValidUsername(username)) {
                        writer.println("Invalid input");
                        return;
                    }
                }
            }
            admin.createUser(username, password, role);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void manageStudent(BufferedReader reader, PrintWriter writer, Student student) {
        writer.println(student.printGrades());
    }

    private void manageTeacher(BufferedReader reader, PrintWriter writer, Teacher teacher) {
        try {
            writer.println("enter faculty num");
            writer.flush();
            String facNum = reader.readLine();

            writer.println("enter subject");
            writer.flush();
            String subject = reader.readLine();

            writer.println("enter grade");
            writer.flush();
            double grade = Double.parseDouble(reader.readLine());

            writer.println("enter semester num");
            writer.flush();
            int semNum = Integer.parseInt(reader.readLine());
            teacher.addGrade(facNum, subject, semNum, grade);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
