
public class MathHelper1
{
    public static int sumOfThrees(int limit){
        int sum1 = 0;
        for(int num = 1; num < limit; num++){
            if(num%3 == 0){
                sum1 += num;
            }
        }
        return sum1;
    }

    public static int sumOfFives(int limit){
        int sum2 = 0;
        for(int num = 1; num < limit; num++){
            if(num%5 == 0){
                sum2 += num;
            }
        }
        return sum2;
    }

    public static int sumOf3and5(int limit){
        int sum3 = 0;
        for(int num = 1; num < limit; num++){
            if(num%3 == 0 && num%5 == 0){
                sum3 += num;
            }
        }
        return sum3;
    }

}
