import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2{


    public static void main(String[] args) throws FileNotFoundException{

        Scanner file = new Scanner(new File("2015/inputs/Day2.txt"));

        int paper_length = 0;
        int ribbon_length = 0;


        while(file.hasNextLine()){
            String line = file.nextLine();

            int x1 = line.indexOf("x");
            int x2 = line.lastIndexOf("x");

            int l = Integer.parseInt(line.substring(0, x1));
            int w = Integer.parseInt(line.substring(x1 + 1, x2));
            int h = Integer.parseInt(line.substring(x2 + 1));

            //2*l*w + 2*w*h + 2*h*l

            paper_length += ((2*l*w)+(2*w*h)+(2*h*l));

            if(l >= w && l >= h){
            paper_length += w * h;
            ribbon_length += 2 * w + 2 * h;
            }else if(w >= h && w >= l){
            paper_length += l * h;
            ribbon_length += 2 * l + 2 * h;
            }else if(h >= l && h >= w){
            paper_length += l * w;
            ribbon_length += 2 * w + 2 * l;
            }

            ribbon_length += l * w * h;

        }

        System.out.println(paper_length);
        System.out.println(ribbon_length);

        file.close();
    }
}