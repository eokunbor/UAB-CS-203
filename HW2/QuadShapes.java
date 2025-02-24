package HW2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class QuadShapes extends JPanel {
    // Window size
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    
    // Size of each quadrant
    static final int QUAD_WIDTH = WIDTH / 2;
    static final int QUAD_HEIGHT = HEIGHT / 2;
    
    // Margin to keep shapes away from borders
    static final int MARGIN = 50;
    
    // Random number generator
    Random random = new Random();

    // Constructor
    public QuadShapes() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    // This method draws everything
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the lines to split screen into 4 parts
        g2d.setColor(Color.BLACK);
        g2d.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);     // vertical line
        g2d.drawLine(0, HEIGHT/2, WIDTH, HEIGHT/2);    // horizontal line

        // Draw one shape in each quadrant
        drawRandomShape(g2d, 0, 0);           // top-left
        drawRandomShape(g2d, QUAD_WIDTH, 0);     // top-right
        drawRandomShape(g2d, 0, QUAD_HEIGHT);    // bottom-left
        drawRandomShape(g2d, QUAD_WIDTH, QUAD_HEIGHT); // bottom-right
    }

    // Draw a random shape at the given position
    void drawRandomShape(Graphics2D g2d, int startX, int startY) {
        // Random color
        g2d.setColor(new Color(
            random.nextInt(256),  // red
            random.nextInt(256),  // green
            random.nextInt(256)   // blue
        ));

        // Calculate maximum allowed size to fit in quadrant
        int maxSize = Math.min(QUAD_WIDTH, QUAD_HEIGHT) - (2 * MARGIN);
        // Random size between 30 and maxSize
        int size = random.nextInt(maxSize - 30) + 30;

        // Calculate safe position range within the quadrant
        int safeWidth = QUAD_WIDTH - size - MARGIN;
        int safeHeight = QUAD_HEIGHT - size - MARGIN;
        
        // Random position that ensures shape stays within quadrant
        int x = startX + MARGIN + random.nextInt(Math.max(1, safeWidth));
        int y = startY + MARGIN + random.nextInt(Math.max(1, safeHeight));

        // Pick a random shape (0-3)
        int shapeType = random.nextInt(4);

        // Draw the chosen shape
        switch(shapeType) {
            case 0: // Rectangle
                int rectWidth = size;
                int rectHeight = size/2;
                // Make sure rectangle doesn't cross border
                if (x + rectWidth > startX + QUAD_WIDTH - MARGIN) {
                    x = startX + QUAD_WIDTH - MARGIN - rectWidth;
                }
                if (y + rectHeight > startY + QUAD_HEIGHT - MARGIN) {
                    y = startY + QUAD_HEIGHT - MARGIN - rectHeight;
                }
                g2d.fillRect(x, y, rectWidth, rectHeight);
                break;
                
            case 1: // Circle
                g2d.fillOval(x, y, size, size);
                break;
                
            case 2: // Triangle
                // Calculate triangle points that stay within bounds
                int[] xPoints = {
                    x,
                    x + size/2,
                    x + size
                };
                int[] yPoints = {
                    y + size,
                    y,
                    y + size
                };
                g2d.fillPolygon(xPoints, yPoints, 3);
                break;
                
            case 3: // Square
                g2d.fillRect(x, y, size, size);
                break;
        }
    }

    // Main method to start the program
    public static void main(String[] args) {
        // Create window
        JFrame frame = new JFrame("Shapes in Quadrants");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add our drawing
        frame.add(new QuadShapes());
        
        // Set up window
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}