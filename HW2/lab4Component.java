package HW2; 

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;

public class lab4Component extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Fixes white screen issue

        Graphics2D g2 = (Graphics2D) g;

        // sky and grass
        g2.setColor(new Color(64, 146, 246));
        g2.fillRect(0, 0, 1600, 900); // Sky
        g2.setColor(new Color(99, 235, 53));
        g2.fillRect(0, 648, 1600, 252); // Grass

        // main house
        g2.setColor(new Color(151, 151, 151));
        g2.fill(new Rectangle2D.Double(692, 380, 630, 324));

        // roof rectangle mini extension
        g2.setColor(new Color(107, 118, 146));
        g2.fill(new Rectangle2D.Double(534, 250, 570, 140));

        // left tri wall
        int[] xPoints1 = {534, 377, 692};
        int[] yPoints1 = {190, 290, 290};
        g2.setColor(new Color(255, 255, 255));
        g2.fillPolygon(xPoints1, yPoints1, 3);

        // roof rectangle
        g2.setColor(new Color(107, 118, 146));
        g2.fill(new Rectangle2D.Double(692, 250, 570, 140));

        // side house
        g2.setColor(new Color(255, 255, 255));
        g2.fill(new Rectangle2D.Double(377, 290, 315, 414));

        // right roof triangle 
        int[] xPoints2 = {1262, 1262, 1390};
        int[] yPoints2 = {250, 390, 390};
        g2.setColor(new Color(107, 118, 146));
        g2.fillPolygon(xPoints2, yPoints2, 3);

        // quad roof part 
        int[] xPoints3 = {534, 720, 720, 534};
        int[] yPoints3 = {150, 280, 320, 190};
        g2.setColor(new Color(149, 160, 188));
        g2.fillPolygon(xPoints3, yPoints3, 4);

        int[] xPoints4 = {348, 534, 534, 348};
        int[] yPoints4 = {280, 150, 190, 320};
        g2.setColor(new Color(149, 160, 188));
        g2.fillPolygon(xPoints4, yPoints4, 4);
        
        // base balcony 
        g2.setColor(new Color(221, 221, 221));
        g2.fill(new Rectangle2D.Double(977, 650, 345, 54));

        // pillars
        g2.setColor(new Color(221, 221, 221));
        g2.fill(new Rectangle2D.Double(977, 410, 75, 240));

        g2.setColor(new Color(221, 221, 221));
        g2.fill(new Rectangle2D.Double(1247, 410, 75, 240));

        // arm rail
        g2.setColor(new Color(221, 221, 221));
        g2.fill(new Rectangle2D.Double(1052, 565, 195, 20));

         //long banner (patio)
        g2.setColor(new Color(221, 221, 221));
        g2.fill(new Rectangle2D.Double(377, 390, 945, 50));


        //stairs
        g2.setColor(new Color(90, 31, 25));
        g2.fill(new Rectangle2D.Double(692, 650, 285, 54));

        //door
        g2.setColor(new Color(104, 61, 51));
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

        //walkway
        int[] xPoints8 = {692, 977, 1052, 480};
        int[] yPoints8 = {700, 700, 900, 900};
        g2.setColor(new Color(134, 121, 104));
        g2.fillPolygon(xPoints8, yPoints8, 4);


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

        //tree 
        g2.setColor(new Color(149, 79, 26));
        g2.fill(new Rectangle2D.Double(225, 480, 60, 300));

        g2.setColor(new Color(149, 79, 26));
        g2.setStroke(new BasicStroke(12));
        g2.drawLine(283, 600, 325, 500);

        g2.setColor(new Color(0, 177, 23)); 
        g2.fill(new Ellipse2D.Double(150, 300, 200, 200));  

        g2.setColor(Color.BLACK); 
        g2.setStroke(new BasicStroke(5));
        g2.draw(new Ellipse2D.Double(150, 300, 200, 200)); 

        g2.setColor(Color.green); 
        g2.fill(new Ellipse2D.Double(290, 430, 100, 100));

        g2.setColor(Color.black); 
        g2.setStroke(new BasicStroke(5));
        g2.draw(new Ellipse2D.Double(290, 430, 100, 100)); 

        //my name
        g2.setColor(Color.white);
        g2.setFont(new Font("Arial", Font.BOLD, 24));
        g2.drawString("Elizabeth Okunbor", 1290, 810);



    }

    private static final long serialVersionUID = 1L;
}
