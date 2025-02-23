package LAB4;
import javax.swing.*;
import java.awt.*;

public abstract class lab4Viewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // use this frame object to add 2D objects to
                    JFrame frame = new JFrame();

                    // configure your frame's size, title, and close operation
                    frame.setSize(1600, 900); 			// TODO CHANGE THE WINDOW SIZE
                    frame.setTitle("CS 203 Lab 4"); 	// TODO CHANGE THE WINDOW TITLE
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    // add objects into your frame
                    lab4Component s = new lab4Component();
                    frame.add(s);

                    // lastly, set your frame visibility to true
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
}
