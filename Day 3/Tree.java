
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Tree
{
   protected Leaves leaves;
   protected Trunk trunk;
   public Tree(int x1, int y1) {
       leaves = new Leaves(x1, y1, 100, 100);
       trunk = new Trunk(x1 + 38, y1 + 100, 25, 100);
   }
   public void draw(Graphics g) {
       leaves.draw(g);
       trunk.draw(g);
   }
}
