import java.awt.*;
import javax.swing.plaf.synth.SynthTextPaneUI;

public class Giant extends Critter {
   private int nameCounter = 0;
   private int changeCounter = 1;
   private String giantName = "fee";


   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      }
      else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      }
      else {
         return Action.RIGHT;
      }
   }


   public Color getColor() {
      return Color.GRAY;
   }


   public String toString() {
      if(changeCounter % 6 == 0) {
         nameCounter++;
         if (nameCounter == 4) {
            nameCounter = 0;
         }
         switch (nameCounter) {
            case 0:
               giantName = "fee";
               break;
            case 1:
               giantName = "fie";
               break;
            case 3:
               giantName = "foe";
               break;
            case 4:
               giantName = "fum";
               break;
         }
      }
   changeCounter++; 
   return giantName;
   }
}
