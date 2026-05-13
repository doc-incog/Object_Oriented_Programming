import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private int currentCard = 0;
    private static final String[] CARD_NAMES = {"Card 1", "Card 2", "Card 3"};

    public CardLayoutDemo() {
        setTitle("CardLayout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
        for (int i = 0; i < CARD_NAMES.length; i++) {
            JPanel panel = new JPanel();
            panel.setBackground(colors[i]);
            panel.add(new JLabel(CARD_NAMES[i]));
            cardPanel.add(panel, CARD_NAMES[i]);
        }

        JPanel buttonPanel = new JPanel();
        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentCard--;
                if (currentCard < 0) {
                    currentCard = CARD_NAMES.length - 1;
                }
                cardLayout.show(cardPanel, CARD_NAMES[currentCard]);
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentCard++;
                if (currentCard >= CARD_NAMES.length) {
                    currentCard = 0;
                }
                cardLayout.show(cardPanel, CARD_NAMES[currentCard]);
            }
        });

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        add(cardPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CardLayoutDemo().setVisible(true);
            }
        });
    }
}
