import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class SpinnyBug extends Bug
{
    public SpinnyBug(){
        setColor(Color.GREEN);
    }
    
    public void act(){
        setDirection(getDirection() + Location.HALF_LEFT);
    }

}
