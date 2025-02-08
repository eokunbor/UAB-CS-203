package LAB4;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;

public class lab4Component extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Fixes white screen issue

        Graphics2D g2 = (Graphics2D) g;

        // Background
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, 1600, 900); // Sky
        g2.setColor(Color.GREEN);
        g2.fillRect(0, 648, 1600, 252); // Grass

        // Main House
        g2.setColor(new Color(162, 0, 0));
        g2.fill(new Rectangle2D.Double(692, 380, 630, 324));

        // Roof Rectangle Extension
        g2.setColor(new Color(118, 150, 193));
        g2.fill(new Rectangle2D.Double(534, 250, 570, 140));

        // Left Roof Triangle
        int[] xPoints1 = {534, 377, 692};
        int[] yPoints1 = {190, 290, 290};
        g2.setColor(Color.RED);
        g2.fillPolygon(xPoints1, yPoints1, 3);

        // Roof Rectangle
        g2.setColor(new Color(118, 150, 193));
        g2.fill(new Rectangle2D.Double(692, 250, 570, 140));

        // Side House
        g2.setColor(Color.RED);
        g2.fill(new Rectangle2D.Double(377, 290, 315, 414));

        // ✅ Right Roof Triangle (Fixed Variable Name)
        int[] xPoints2 = {1262, 1262, 1390};
        int[] yPoints2 = {250, 390, 390};
        g2.setColor(new Color(118, 150, 193));
        g2.fillPolygon(xPoints2, yPoints2, 3);

        // ✅ Quadrilateral Roof Part (Renamed Variables)
        int[] xPoints3 = {534, 720, 720, 534};
        int[] yPoints3 = {150, 280, 320, 190};
        g2.setColor(new Color(159, 192, 224));
        g2.fillPolygon(xPoints3, yPoints3, 4);

        int[] xPoints4 = {348, 534, 534, 348};
        int[] yPoints4 = {280, 150, 190, 320};
        g2.setColor(new Color(159, 192, 224));
        g2.fillPolygon(xPoints4, yPoints4, 4);

        //long banner (patio)
        g2.setColor(new Color(124, 199, 182));
        g2.fill(new Rectangle2D.Double(377, 390, 945, 50));
        
        // base balcony 
        g2.setColor(new Color(124, 199, 182));
        g2.fill(new Rectangle2D.Double(977, 650, 345, 54));

        // pillars
        g2.setColor(new Color(124, 199, 182));
        g2.fill(new Rectangle2D.Double(977, 410, 75, 240));

        g2.setColor(new Color(124, 199, 182));
        g2.fill(new Rectangle2D.Double(1247, 410, 75, 240));

        // arm rail
        g2.setColor(new Color(124, 199, 182));
        g2.fill(new Rectangle2D.Double(1052, 565, 195, 20));

        //stairs
        g2.setColor(new Color(90, 31, 25));
        g2.fill(new Rectangle2D.Double(692, 650, 285, 54));

        //door
        g2.setColor(new Color(76, 103, 141));
        g2.fill(new Rectangle2D.Double(768, 460, 133, 190));

        //window 1
        g2.setColor(Color.YELLOW);
        g2.fill(new Rectangle2D.Double(455, 480, 159, 190));

        //window 2
        g2.setColor(Color.YELLOW);
        g2.fill(new Rectangle2D.Double(455, 280, 159, 90));

        //window 3
        g2.setColor(new Color(218, 196, 0));
        g2.fill(new Rectangle2D.Double(1101, 460, 97, 90));

        // START OF BLACK LINES
        //Patio outer side
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1322, 393, 1322, 700);

        //entire length of house
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(377, 700, 1322, 700);

        //side house outside
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(377, 700, 377, 305);

        //side house inside
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(692, 700, 692, 440);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(692, 305, 692, 390);

        //mini roof
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(534, 190, 720, 320);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(720, 280, 720, 320);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(720, 280, 534, 150);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(348, 280, 534, 150);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(348, 280, 348, 320);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(534, 190, 348, 320);    

        //pation banner
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(377,390 , 1390, 390);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(377,440 , 977, 440);

        //main roof
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1262,250 , 1390, 390);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1262,250 , 680, 250);

        //patio pillars (all)
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(977,440 , 977, 700);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(692,650 , 977, 650);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1055,650 , 1244, 650);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1055,588 , 1244, 588);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1055,565 , 1244, 565);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1055,440 , 1244, 440);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1050,440 , 1050, 565);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1245,440 , 1245, 565);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1245,588 , 1245, 650);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1050,588 , 1050, 650);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(12));
        g2.drawLine(1080,590 , 1080, 645);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(12));
        g2.drawLine(1125,590 , 1125, 645);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(12));
        g2.drawLine(1170,590 , 1170, 645);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(12));
        g2.drawLine(1215,590 , 1215, 645);

        //door 
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(770,460 , 897, 460);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(897,650 , 897, 460);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(770,460 , 770, 650);

        //windows 1 
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(455,480 , 455, 670);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(614,480 , 614, 670);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(455,480 , 614, 480);
        
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(455,670 , 614, 670);


        //windows 2
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(455,280 , 455, 370);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(614,280 , 614, 370);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(455,280 , 614, 280);
        
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(455,370 , 614, 370);


        //windows 3
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1101,460 , 1101, 550);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1198,550 ,1198, 460);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1101,460 , 1198, 460);
        
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1101,550 , 1198, 550);

        //window crosses (all)
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(534,480 , 534, 670);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(455,575 , 614, 575);


        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(534,280 , 534, 370);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(455,325 , 614, 325);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1149,460 , 1149, 550);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(1101,500 , 1198, 500);

        //door handle
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(790,555 , 790, 580);











        //Stairs Runs
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(692,687 , 977, 687);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(692,665, 977, 665);



    }

    private static final long serialVersionUID = 1L;
}
