

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BoxBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        BoxBug alice = new BoxBug(6);
        alice.setColor(Color.ORANGE);
        OctoBug bob = new OctoBug(3);
        SpiralBug Joe = new SpiralBug();
        ColumnBug Alex = new ColumnBug();
        world.add(new Location(2, 2), Alex);
        world.add(new Location(9, 9), Joe);
        world.add(new Location(5, 5), alice);
        world.add(new Location(9, 7), bob);
        world.show();
    }
}