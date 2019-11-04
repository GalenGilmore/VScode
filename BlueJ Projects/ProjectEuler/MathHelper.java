   
public class MathHelper
{
    public static int sumOfSquares(int limit){
        int sum = 0;
        for(int num = 1; num <= limit; num++){
            sum += num * num;
        }
        return sum;
    }
    
    public static int sumUpTo(int limit){
        int sum = 0;
        for(int num = 1; num <= limit; num++){
            sum += num;
        }
        return sum;
    }
}
