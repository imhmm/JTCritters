import java.awt.*;
import java.util.Random;

public class Lion extends Critter {
   private int colorCounter = 1;
   private Color lionColor = Color.RED;


   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      }
      else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
         return Action.LEFT;
      }
      else if (info.getFront() == Neighbor.SAME) {
         return Action.RIGHT;
      }
      else {
         return Action.HOP;
      }
   }


   public Color getColor() {
      Random number = new Random();
      int maxNumber = 3;
      int randomNumber = number.nextInt(maxNumber) + 1;
      
      if (colorCounter % maxNumber == 0) {
         if (randomNumber == 1) {
            lionColor = Color.RED;
         } else if (randomNumber == 2) {
            lionColor = Color.GREEN;
         } else {
            lionColor = Color.BLUE;
         }
      } 
      colorCounter++;
      return lionColor; 
   }


   public String toString() {
      return "L";
   }
}