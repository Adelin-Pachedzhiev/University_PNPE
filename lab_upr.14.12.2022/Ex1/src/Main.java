import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message;

        try {
            ServerSocket server = new ServerSocket(1211);
            while(true) {
                Socket socket = server.accept();
                Scanner scan = new Scanner(socket.getInputStream());
                message = scan.next();
                PrintStream printout = new PrintStream(socket.getOutputStream());

                printout.println("hi, your message was: " + message);
                System.out.println("message: "+message);
                scan.close();

            }
//            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}