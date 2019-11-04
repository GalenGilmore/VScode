import java.util.Scanner;

public class test1{

    public static void main(String[] args) {

    int total = 0;
    int denominator = 0;

        do{
    
            Scanner kboard = new Scanner(System.in);

            System.out.println("Enter a positive number (enter a negative to cancel):");

            int num = kboard.nextInt();

            total += num;
            denominator++;

        }while(num > 0);

        System.out.println(total/denominator);

    }
    
}