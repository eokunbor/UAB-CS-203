package HW2;

import javax.swing.JFrame;

public class QuadDrawingViewer {
        public static void main(String[] args) {
        JFrame window = new JFrame("Random Shape Drawing");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(new RandomQuadDrawings());
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
