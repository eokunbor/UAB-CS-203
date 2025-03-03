package HW2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomQuadDrawings extends JPanel {
    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 800;

    private final Random randomGenerator = new Random();
    private final DrawableShape[] shapesToDraw = new DrawableShape[4];

    public RandomQuadDrawings() {
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        createRandomShapes();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (DrawableShape shape : shapesToDraw) {
            shape.draw(graphics);
        }

        graphics.setColor(Color.BLACK);
        graphics.drawLine(WINDOW_WIDTH/2, 0, WINDOW_WIDTH/2, WINDOW_HEIGHT);   
        graphics.drawLine(0, WINDOW_HEIGHT/2, WINDOW_WIDTH, WINDOW_HEIGHT/2);  
    }

    private void createRandomShapes() {
        for (int quarterNumber = 0; quarterNumber < 4; quarterNumber++) {
            int shapeType = randomGenerator.nextInt(4);
            
            int shapeSize = randomGenerator.nextInt(76) + 25;
            
            Color shapeColor = new Color(
                randomGenerator.nextInt(256), 
                randomGenerator.nextInt(256),  
                randomGenerator.nextInt(256));

            int quarterWidth = WINDOW_WIDTH / 2;
            int quarterHeight = WINDOW_HEIGHT / 2;
            int quarterStartX = (quarterNumber % 2) * quarterWidth;   
            int quarterStartY = (quarterNumber / 2) * quarterHeight;  

            int maxShapeExtent;
            if (shapeType == 2) {
                int rectangleWidth = shapeSize * 2;
                int rectangleHeight = shapeSize;    
                maxShapeExtent = Math.max(rectangleWidth/2, rectangleHeight/2);
            } else {
                maxShapeExtent = shapeSize;
            }

            int safeDistance = maxShapeExtent + 10; 

            int availableWidth = quarterWidth - (2 * safeDistance);
            int availableHeight = quarterHeight - (2 * safeDistance);
            
            if (availableWidth <= 0) availableWidth = 1;
            if (availableHeight <= 0) availableHeight = 1;
        
            int shapeX = quarterStartX + safeDistance + randomGenerator.nextInt(availableWidth);
            int shapeY = quarterStartY + safeDistance + randomGenerator.nextInt(availableHeight);

            shapesToDraw[quarterNumber] = new DrawableShape(shapeType, shapeSize, shapeColor, shapeX, shapeY);
        }
    }

    private static class DrawableShape {
        private final int shapeType;   
        private final Color shapeColor;         
        private final int size;                   
        private final int centerX;            
        private final int centerY;            

        public DrawableShape(int shapeType, int size, Color shapeColor, int centerX, int centerY) {
            this.shapeType = shapeType;
            this.size = size;
            this.shapeColor = shapeColor;
            this.centerX = centerX;
            this.centerY = centerY;
        }

        private void drawCircle(Graphics2D graphics) {
            graphics.fillOval(centerX - size, centerY - size, 2 * size, 2 * size);
        }

        private void drawRectangle(Graphics2D graphics) {
            graphics.fillRect(centerX - size, centerY - size/2, 2 * size, size);
        }

        private void drawPentagon(Graphics2D graphics) {
            int[] xPoints = new int[5];
            int[] yPoints = new int[5];
            
            for (int corner = 0; corner < 5; corner++) {
                double angle = 2 * Math.PI * corner / 5 - Math.PI / 2;
                xPoints[corner] = centerX + (int)(size * Math.cos(angle));
                yPoints[corner] = centerY + (int)(size * Math.sin(angle));
            }
            
            graphics.fillPolygon(xPoints, yPoints, 5);
        }

        private void drawHexagon(Graphics2D graphics) {
            int[] xPoints = new int[6];
            int[] yPoints = new int[6];
            
            for (int corner = 0; corner < 6; corner++) {
                double angle = 2 * Math.PI * corner / 6;
                xPoints[corner] = centerX + (int)(size * Math.cos(angle));
                yPoints[corner] = centerY + (int)(size * Math.sin(angle));
            }
            
            graphics.fillPolygon(xPoints, yPoints, 6);
        } 

        public void draw(Graphics2D graphics) {
            graphics.setColor(shapeColor);

            switch (shapeType) {
                case 0: 
                    drawPentagon(graphics);
                    break;
                case 1:
                    drawCircle(graphics);
                    break;
                case 2: 
                    drawRectangle(graphics);
                    break;
                case 3: 
                    drawHexagon(graphics);
                    break;
            }
        }
    }
}