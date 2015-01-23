import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    Counter counter = new Counter();
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1);
        addObject(counter, 100, 20);
        addObject(new Crab(), 200,  200);
        addObject(new Lobster(), 450, 450);
        addObject(new Lobster(), 40, 400);
        addObject(new Lobster(), 400, 40);
        addObject(new Worm(), 40, 450);
        addObject(new Worm(), 276, 100);
        addObject(new Worm(), 300, 300);
    }
    
    public Counter getCounter()
    {
        return counter;
    }
}
