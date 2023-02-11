import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;

public class FileManager {
    private static final String fileName = "users.bin";

    public synchronized static void writeOnFile(List<User> list) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public synchronized static List<User> readFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));) {
            Object obj =in.readObject();
            if (obj instanceof List<?>){
                return Collections.synchronizedList((List<User>) obj);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
