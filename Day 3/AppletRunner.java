import java.awt.*;
import java.applet.*;
import java.util.*;
public class AppletRunner extends Applet
{
    public void paint(Graphics g) {
        this.setSize(1600, 900);
        g.fillRect(0, 0, 1600, 900);
        Tree tree = new Tree(100, 100);
        tree.draw(g);
        PineTree tree2 = new PineTree(500, 150); 
        tree2.draw(g);
        ChristmasTree tree3 = new ChristmasTree(500, 500, 500, 550);
        tree3.draw(g);
        ChristmasTree tree4 = new ChristmasTree(300, 300, 300, 350);
        tree4.draw(g);
        Box box = new Box(1000, 250, 50, 50);
        box.draw(g);
        Man man = new Man(1500, 800, 25, 25);
        man.draw(g);
    }
}
