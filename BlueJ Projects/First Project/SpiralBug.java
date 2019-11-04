import info.gridworld.actor.Bug;

public class SpiralBug extends Bug
{
    //Fields -- Attribute data
    //access type variableName
    //private int sideLength, segment, steps;
    private int sideLength;
    private int segment;
    private int steps;
    
    
    //Constructor -- same name as class
    //Used to initialize fields
    
    public SpiralBug(){
        sideLength = 1;
        segment = 0;
        steps = 0;
    }
    
    
    public void act(){
        
        if(steps < sideLength){
            move();
            steps++;
        }else{
            turn();
            turn();
            segment++;
            steps = 0;
            if(segment == 2){
                sideLength++;
                segment = 0;
            }
            
        }
        
        
    }
    
    
    
    
    
    
    
}