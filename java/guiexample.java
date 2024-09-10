
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class guiexample {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300,400));
        frame.setTitle("WOW!");
        // BUTTON
        JButton btn1=new JButton();
        btn1.setText("click me!");
        btn1.setBackground(Color.RED);
        frame.add(btn1);

        JButton btn2=new JButton();
        btn2.setText("Its me!");
        btn2.setBackground(Color.BLACK);
        frame.add(btn2);

        frame.setVisible(true);


    }
}
