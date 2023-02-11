import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Scanner sc = new Scanner(socket.getInputStream());){
            String role = sc.nextLine();
            if (role.equals("Support")) {
                String username = sc.nextLine();
                Support support = new Support(username);


            } else if (role.equals("User")) {
                String id = sc.nextLine();
                String message = sc.nextLine();
                TicketsWaiting.waitingList.add(new Ticket(message, new Customer(id)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
