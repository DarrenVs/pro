import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        move(4);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(-3);
        }
        
        Actor worm;
        worm = getOneObjectAtOffset(0, 0, Worm.class);
        World world;
        world = getWorld();
        CrabWorld crabWorld = (CrabWorld) world;
        Counter counter = crabWorld.getCounter();
        if (worm != null)
        {
            counter.addScore( 100 );
            world.removeObject(worm);
            Greenfoot.playSound("eating.wav");
        }
        
        Actor enemy;
        enemy = getOneObjectAtOffset(0, 0, Lobster.class);
        if (enemy != null)
        {
            counter.addScore( -25 );
            turn(90);
        }
    }
}
