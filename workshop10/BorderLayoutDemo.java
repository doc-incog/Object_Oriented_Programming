import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo() {
        setTitle("BorderLayout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.RED);
        northPanel.add(new JLabel("North"));
        add(northPanel, BorderLayout.NORTH);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.BLUE);
        southPanel.add(new JLabel("South"));
        add(southPanel, BorderLayout.SOUTH);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.GREEN);
        eastPanel.add(new JLabel("East"));
        add(eastPanel, BorderLayout.EAST);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.YELLOW);
        westPanel.add(new JLabel("West"));
        add(westPanel, BorderLayout.WEST);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.GRAY);
        centerPanel.add(new JLabel("Center"));
        add(centerPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BorderLayoutDemo().setVisible(true);
            }
        });
    }
}
