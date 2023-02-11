import java.io.*;
import java.net.Socket;

public class ClientThread extends Thread {
    private Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()))) {
            System.out.println("someone conected !!");
            String roleStr = reader.readLine();
            if (roleStr == null) {
                return;
            }
            Roles role = Roles.valueOf(roleStr);

            switch (role) {
                case SUPPORT -> manageSupport(socket, reader, writer);
                case CUSTOMER -> manageCustomer(socket, reader, writer);
                default -> System.out.println("invalid");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void manageSupport(Socket socket, BufferedReader reader, PrintWriter writer) {
        try {
            writer.println("enter username");
            writer.flush();
            System.out.println("before support creation");
            Support sup = new Support(reader.readLine());
            System.out.println("support created");
            writer.println(TicketLists.waitingList.size());
            writer.flush();
            if (TicketLists.waitingList.size() > 0) {


                TicketLists.printList(TicketLists.waitingList, writer);
                writer.flush();
                writer.println("enter index of ticket to process");
                writer.flush();
                int index = Integer.parseInt(reader.readLine());
                sup.resolveTicket(index);
            }
            System.out.println("\nResolved list:");
            for(Ticket ticket: TicketLists.resolvedList){
                System.out.println(ticket.toString());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void manageCustomer(Socket socket, BufferedReader reader, PrintWriter writer) {
        try {
            writer.println("enter customer id");
            writer.flush();
            Customer customer = new Customer(reader.readLine());
            String message = reader.readLine();
            String id = reader.readLine();
            customer.createTicket(message, id);
            writer.write("successful !\n");
            writer.flush();
            TicketLists.printList(TicketLists.waitingList, writer);
            writer.flush();

            System.out.println("leaving customer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
