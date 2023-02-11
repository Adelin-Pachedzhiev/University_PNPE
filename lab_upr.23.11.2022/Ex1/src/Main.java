import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        try(BufferedReader br = new BufferedReader(new FileReader("name"))){
//            System.out.println(br.readLine());
//        }catch (IOException e ){
//            e.printStackTrace();
//        } finally {
//            br.close();
//        }
        String str = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter numbers separated by comma ");
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("firstFile.txt"))) {
            if (str != null) {
                bw.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader("firstFile.txt"))){
            String line = br.readLine();
            String[] numsAsString = line.split(",");
            int[] numsAsInt = new int[numsAsString.length];
            for (int i=0; i< numsAsInt.length; i++){
                numsAsInt[i] = Integer.parseInt(numsAsString[i]);
            }
            System.out.println(Arrays.toString(numsAsInt));
        }catch (IOException e ){
            e.printStackTrace();
        }

    }
}