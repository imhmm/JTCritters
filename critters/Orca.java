import java.awt.*;
import java.util.Random;

public class Orca extends Critter {
   private boolean crawl;
   
   public Orca() {
      crawl = true;
   }

   public Action getMove(CritterInfo info) {
      crawl = !crawl;
       if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      }
      else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      }
      else if (info.getLeft() == Neighbor.WALL) {
         return Action.RIGHT;
      }
      else if (info.getRight() == Neighbor.WALL){
         return Action.LEFT;
      }
      else {
         Random number = new Random();
         int maxNum = 2;
         int randomNum = number.nextInt(maxNum) + 1;
         
         if (randomNum == 1) {
            return Action.LEFT;
         }
         else {
            return Action.RIGHT;
         }
      }
   }

   public Color getColor() {
       return Color.BLACK;
   }

 public String toString() {
       if (crawl) {
         return "--";
       }
       else {
         return "^^";
       }
   }
}