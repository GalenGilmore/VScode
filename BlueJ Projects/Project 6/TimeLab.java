import java.util.Scanner;

public class TimeLab
{
    
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String stuff = kb.nextLine();
        
        int num = Integer.parseInt(stuff);
        int hours = num / 3600;
        int sec = num % 3600;
        int min = sec / 60;
        int sec2 = sec % 60;
        
        System.out.println("There are " + hours + " hours, " + min + " minutes, and " + sec2 + " seconds in " + num + " seconds");
    }
}
