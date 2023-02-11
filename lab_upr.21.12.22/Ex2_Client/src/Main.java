import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        boolean end = false;
        while (!end) {

            System.out.println("enter end to stop: ");
            String command = sc.nextLine();
            try (Socket socket = new Socket("localhost", 3001);
                 BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()))) {
                switch (command.toLowerCase()) {
                    case "user" -> manageUser(socket, reader, writer);
                    case "support" -> manageSupport(socket, reader, writer);
                    case "end" -> end = true;

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private static void manageUser(Socket socket, BufferedReader reader, PrintWriter writer) {
        try {
            writer.println("CUSTOMER");
            writer.flush();
            System.out.println(reader.readLine());
            writer.println(sc.nextLine());
            writer.flush();
            System.out.println("problem ?");
            writer.println(sc.nextLine());
            writer.flush();
            System.out.println("id ?");
            writer.println(sc.nextLine());
            writer.flush();
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println(message);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void manageSupport(Socket socket, BufferedReader reader, PrintWriter writer) {
        try {
            writer.println("SUPPORT");
            writer.flush();
            String message;

            message = reader.readLine();
            System.out.println(message);

            writer.println(sc.nextLine());
            writer.flush();

            int count = Integer.parseInt(reader.readLine());

            if (count > 0) {
                for (int i = 0; i < count ; i++){
                    message = reader.readLine();
                    System.out.println(message);
                }
                System.out.println(reader.readLine());
                writer.println(sc.nextLine());
                writer.flush();
            }

        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}