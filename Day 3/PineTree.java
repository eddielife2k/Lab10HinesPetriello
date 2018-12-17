


import java.awt.*;
import java.applet.*;
import java.util.*;
public class PineTree extends Tree
{
   private Trunk trunk;
   private PineLeaves leaves;
   public PineTree(int x1, int y1) {
       super(x1, y1);
       leaves = new PineLeaves(x1, y1, 100, 100);
       trunk = new Trunk(x1 - 13, y1 + 50, 25, 100);
   }
   public void draw(Graphics g) {
        leaves.draw(g);
        trunk.draw(g);
    }
}
