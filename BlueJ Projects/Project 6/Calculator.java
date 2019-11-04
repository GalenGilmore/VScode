import java.util.Scanner;

public class Calculator
{

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
        char decision;

        do{

            System.out.print("Enter a number: ");
            String num1 = kb.nextLine();

            System.out.print("Enter an operator (+,-,*,/,%): ");
            char op = kb.nextLine().charAt(0);

            System.out.print("Enter a number: ");
            String num2 = kb.nextLine();

            int firstNum = Integer.parseInt(num1);
            int secondNum = Integer.parseInt(num2);
            int ans = 0;
            if (op == '+'){
                ans = firstNum + secondNum;
            }else if (op == '-'){
                ans = firstNum - secondNum;
            }else if (op == '*'){
                ans = firstNum * secondNum;
            }else if (op == '/'){
                ans = firstNum / secondNum;
            }else if (op == '%'){
                ans = firstNum % secondNum;
            }else{
                System.out.println("Operation Error");
            }
            
            System.out.println(firstNum + " " + op + " " + secondNum + " = " + ans);
            System.out.print("Would You Like to do another calculation? (y/n)");
            decision = kb.nextLine().charAt(0);
        }while(decision == 'y');
        
    }
}
