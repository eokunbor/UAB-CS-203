package LAB4;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;

public class lab4Component extends JComponent {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, 1600, 900);
        g2.setColor(Color.BLUE);
        g2.fill(sky);
        g2.draw(sky);

        Rectangle2D.Double grass = new Rectangle2D.Double(0, 648, 1600, 900);
        g2.setColor(Color.GREEN);
        g2.fill(grass);
        g2.draw(grass);


        Rectangle2D.Double mainhouse = new Rectangle2D.Double(692, 380, 630, 324);
        g2.setColor(new Color(162, 0, 0));
        g2.fill(mainhouse);
        g2.draw(mainhouse);


        Rectangle2D.Double roofrecext = new Rectangle2D.Double(534, 250, 570, 140);
        g2.setColor(new Color(118, 150, 193));
        g2.fill(roofrecext);
        g2.draw(roofrecext);


        int[] xPoints1 = {534, 377, 692};
        int[] yPoints1 = {190, 290, 290};
        Polygon housetri = new Polygon(xPoints1, yPoints1, 3);
        g2.setColor(Color.RED);
        g2.fillPolygon(housetri);
        g2.drawPolygon(housetri);


        Rectangle2D.Double roofrec = new Rectangle2D.Double(692, 250, 570, 140);
        g2.setColor(new Color(118, 150, 193));
        g2.fill(roofrec);
        g2.draw(roofrec);


        Rectangle2D.Double sidehouse = new Rectangle2D.Double(377, 290, 315, 414);
        g2.setColor(Color.RED);
        g2.fill(sidehouse);
        g2.draw(sidehouse);

        int[] xPoints2 = {1262, 1262, 1390};
        int[] yPoints2 = {250, 390, 390};
        Polygon rooftri = new Polygon(xPoints2, yPoints2, 3);
        g2.setColor(new Color(118, 150, 193)); 
        g2.fillPolygon(rooftri);
        g2.drawPolygon(rooftri);
    }

    private static final long serialVersionUID = 1L;
}
