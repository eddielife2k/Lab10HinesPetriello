import java.awt.*;
import java.applet.*;
import java.util.*;
public class AppletRunner extends Applet
{
    public void paint(Graphics g) {
        this.setSize(1600, 900);
        Tree tree = new Tree(100, 100);
        tree.draw(g);
        PineTree tree2 = new PineTree(500, 150); 
        tree2.draw(g);
    }
}
