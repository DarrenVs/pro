import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean keyDown;
    private String key;
    private String sound;
    private String image;
    public Key(String keyCode, String soundFile, String imageName)
    {
        key = keyCode;
        sound = soundFile;
        image = imageName;
        setImage (image + ".png");
        act();
    }
    public void act()
    {
        if ( !keyDown && Greenfoot.isKeyDown(key) )
        {
            keyDown = true;
            
            setImage (image + "-down.png");
            Greenfoot.playSound(sound + ".wav");
        }
        if ( keyDown && !Greenfoot.isKeyDown(key) )
        {
            keyDown = false;
            
            setImage (image + ".png");
        }
    }
}