import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
    private String[] whiteKeyCode = {
       "a","s","d","f","g","h","j","k","l",";"
    };
    private String[] whiteKeySound = {
        "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e"
    };
    private String[] blackKeyCode = {
       "q","w","e","r","t","y","u","i","o","p"
    };
    private String[] blackKeySound = {
        "3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", ""
    };
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 600, 1);
        int i;
        for ( i = 0; i < whiteKeyCode.length; i++)
        {
            addObject(new Key(whiteKeyCode[i], whiteKeySound[i], "white-key"), 863 / 2 + 63 * (i - whiteKeyCode.length/2),100);
        }
        for ( i = 0; i < blackKeyCode.length; i++)
        {
            if (blackKeySound[i] != "") {
                addObject(new Key(blackKeyCode[i], blackKeySound[i], "black-key"), 926 / 2 + 63 * (i - whiteKeyCode.length/2),75);
            }
        }
    }
}