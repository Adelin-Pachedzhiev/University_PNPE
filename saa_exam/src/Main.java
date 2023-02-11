import java.util.Scanner;

public class Main {
    static int size = 5;
    public static void main(String[] args) {
//        int[] arr = new int[size];
//        int k = 1;
//        boolean[] used = new boolean[size];
//        Scanner sc= new Scanner(System.in);
//        for(int i = 0; i< size; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i = 0; i < size; i++){
//            for(int j = i; j<size; j++){
//                if(arr[i]+arr[j]<120){
//                    if (!used[i]){
//                        used[i] = true;
//                        k*=arr[i];
//                    }
//                    if(!used[j]){
//                        used[j] = true;
//                        k*=arr[j];
//                    }
//                }
//            }
//        }
//        System.out.println(k);
        int xn = 2;
        int sum = 0;
        while(true){
            xn = 2*xn + 3;
            if(xn > 100 && xn % 2 == 1){
                System.out.println(xn);
                sum += xn;
            }
            if (xn > 10000){
                break;
            }
        }
        System.out.println("sum" + sum);
    }
    int findSum(){
        int xn = 2;
        int sum = 0;
        while(true){
            xn = 2*xn + 3;
            if(xn > 100 && xn % 2 == 1){

                sum += xn;
            }
            if (xn > 10000){
                break;
            }
        }
        return sum;
    }
}