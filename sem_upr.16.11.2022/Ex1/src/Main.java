import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer(123,new String[]{"mouse"}, "apple", true);
        Computer.serializeComputer(comp);
        System.out.println(comp.isCanPlayGames());
        System.out.println(comp.getBrand());
        System.out.println(comp.getSize());
        System.out.println();
        Computer computer1 = Computer.deserializeComputer();
        System.out.println(computer1.isCanPlayGames());
        System.out.println(computer1.getBrand());
        System.out.println(computer1.getSize());

    }
    public void writeToAFile(String fileName){
//        try{
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
//            String fileContent = "some content";
//            bufferedWriter.write(fileContent);
//        } catch(IOException e){
//
//        }
    }
}