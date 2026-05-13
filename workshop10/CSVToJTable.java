import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToJTable extends JFrame {
    public CSVToJTable() {
        setTitle("CSV to JTable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);

        String[] columns;
        String[][] data;

        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String headerLine = reader.readLine();
            if (headerLine == null) {
                JOptionPane.showMessageDialog(this, "CSV file is empty!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                columns = new String[0];
                data = new String[0][0];
            } else {
                columns = headerLine.split(",");
                for (int i = 0; i < columns.length; i++) {
                    columns[i] = columns[i].trim();
                }

                List<String[]> rows = new ArrayList<>();
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;
                    String[] values = line.split(",");
                    rows.add(values);
                }
                data = rows.toArray(new String[0][]);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Error reading CSV: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
            columns = new String[0];
            data = new String[0][0];
        }

        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        table.setFillsViewportHeight(true);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CSVToJTable().setVisible(true);
            }
        });
    }
}
