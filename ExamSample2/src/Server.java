import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000);){
            while (true){
                Socket socket = serverSocket.accept();
                (new ServerThread(socket)).start();
            }
        } catch(Exception e ){
            e.printStackTrace();
        }
    }
}
