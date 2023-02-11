import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class Lists {
    public static  Queue<Document> waiting= new SynchronousQueue<>();
    public static Queue<Document> correct = new SynchronousQueue<>();
    public static Queue<Document> incorrect = new SynchronousQueue<>();

}
