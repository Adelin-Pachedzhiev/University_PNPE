import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TicketLists {
    public static List<Ticket> waitingList = new ArrayList<>();
    public static List<Ticket> resolvedList = new ArrayList<>();

    public static void printList(List<Ticket> list, PrintWriter writer){
        for(Ticket ticket: list){
            writer.println(list.indexOf(ticket) + ": " + ticket.toString());
        }
    }
}
