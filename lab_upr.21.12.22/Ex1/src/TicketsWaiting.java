import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketsWaiting {
    public static List<Ticket> waitingList = Collections.synchronizedList(new ArrayList<Ticket>());
    public static List<Ticket> resolvedList = Collections.synchronizedList(new ArrayList<Ticket>());

}
