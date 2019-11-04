import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class YellowBug extends Bug
{
    //constructer -- set of instructions that run when the object is created.
    //Normally used for instantiating fields

    public YellowBug(){
        setColor(Color.YELLOW);
    }

    public void turn(){
        setDirection(getDirection() + Location.HALF_LEFT);
    }
}