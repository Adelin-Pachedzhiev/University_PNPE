import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("ne1", "name2", "name3", "vegan", "tu"));
        names.stream().filter(n -> !n.contains("name")).forEach(System.out::println);
        System.out.println();
        names.removeIf(n -> n.contains("name"));
        names.forEach(System.out::println);


//        names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
    }
}