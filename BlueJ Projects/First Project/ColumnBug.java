import info.gridworld.actor.Bug;

public class ColumnBug extends Bug
{
    private int steps;
    
    public ColumnBug(){
        steps = 0;
    }
    
    public void act(){
        if (canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            turn();
            turn();
            turn();
            steps = 0;
        }
    }
}
