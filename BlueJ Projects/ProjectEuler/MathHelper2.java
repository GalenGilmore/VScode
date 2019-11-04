

public class MathHelper2
{
    public static int FibonacciNum(int limit){
        int sum = 0;
        int prev = 1;
        for(int num = 1; num <= limit; num += prev){
            prev = num - prev;
            if(num%2 == 0){
                sum += num;
            }
        }
        return sum;
    }
}
