import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = generateArray(5);
//        printArray(array);
        System.out.println(getRepeatingNum(new int[]{1,1,5,2,2,2,5,5,2,5}));
    }

    public static int[] generateArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int elem: array){
            System.out.println(elem);
        }
    }

    public static int getRepeatingNum(int[] array){
        Arrays.sort(array);
        int mostRepeating = array[0];
        int mostRepCount = 0;
        int currEl = array[0];
        int currElCount = 0;
        for( int elem: array){
            if(elem == currEl){
                currElCount++;
            } else {
                currEl = elem;
            }
            if (currElCount > mostRepCount){
                mostRepeating = currEl;
            }
        }
        return mostRepeating;

    }

}