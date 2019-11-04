import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day1{

    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new File("inputs/Day1.txt"));
        String line = file.nextLine();

        int floor = 0;
        int total = 0;

        for(int i = 0; i < line.length(); i++){
            char current = line.charAt(i);
            if(current == '('){
                floor += 1;
            }else{
                floor -= 1;
            }
            
        }

        System.out.println(floor);

        floor = 0;

        for(int i = 0; i < line.length(); i++){
            char current = line.charAt(i);
            if(floor == -1){
                break;
            }
            if(current == '('){
                floor += 1;
            }else{
                floor -= 1;
            }
            total ++;
        }

        System.out.println(total);
        
        file.close();
    }
    
}