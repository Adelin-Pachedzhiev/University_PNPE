import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(3001);
            while (true) {
                Socket socket = server.accept();
                new ClientThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
