

public class Problem1
{
    public static void main(String[] args){
        int sumOfThrees = MathHelper1.sumOfThrees(1000);
        int sumOfFives = MathHelper1.sumOfFives(1000);
        int sumOf3and5 = MathHelper1.sumOf3and5(1000);
        System.out.println((sumOfThrees + sumOfFives) - sumOf3and5);
    }
}
