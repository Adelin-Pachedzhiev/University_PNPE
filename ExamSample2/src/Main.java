public class Main {
    public static void main(String[] args) {
//        int n = 40;
//        for(int i =1 ; i<= n;i++){
//            System.err.println(fib(i));
//
//        }
        System.err.println(fib(50));

        int maxSubSum4 ( const vector <int> &a)
        {int maxSum = 0; thisSum = 0;
            for( int j = 0; j < a.size(); j++)
            { thisSum += a[j];
                if( thisSum > maxSum)
                    maxSum = thisSum;
                else  if( thisSum < 0)
                    thisSum = 0; }
            return maxSum; }


    }
    public static int fib(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}