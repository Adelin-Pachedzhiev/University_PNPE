import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server {
    private static int LISTENING_PORT = 3331;

    public Server() throws IOException {

        ServerSocket serverSocket = new ServerSocket(LISTENING_PORT);
        while (true) {
            Socket socket = serverSocket.accept();
            new ServerThread(socket).start();

        }


    }

//    private void resolve(int ticketNum) {
//        Ticket ticket = waitingList.get(ticketNum);
//        waitingList.remove(ticketNum);
//        resolvedList.add(ticket);
//    }
//
//    private void addTicket(Ticket ticket) {
//        waitingList.add(ticket);
//    }
}
