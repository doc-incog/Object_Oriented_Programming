import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserInputForm extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField addressField;
    private JTextField contactNumberField;
    private JTextField semesterField;

    public UserInputForm() {
        setTitle("User Input Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        String[] labels = {"First Name:", "Last Name:", "Address:", "Contact Number:", "Semester:"};
        JTextField[] fields = new JTextField[5];

        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            panel.add(new JLabel(labels[i]), gbc);

            gbc.gridx = 1;
            fields[i] = new JTextField(15);
            panel.add(fields[i], gbc);
        }

        firstNameField = fields[0];
        lastNameField = fields[1];
        addressField = fields[2];
        contactNumberField = fields[3];
        semesterField = fields[4];

        gbc.gridx = 0;
        gbc.gridy = labels.length;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText().trim();
                String lastName = lastNameField.getText().trim();
                String address = addressField.getText().trim();
                String contactNumber = contactNumberField.getText().trim();
                String semester = semesterField.getText().trim();

                if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty()
                        || contactNumber.isEmpty() || semester.isEmpty()) {
                    JOptionPane.showMessageDialog(UserInputForm.this,
                            "All fields must be filled!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.csv", true))) {
                    writer.write(firstName + "," + lastName + "," + address + ","
                            + contactNumber + "," + semester);
                    writer.newLine();
                    JOptionPane.showMessageDialog(UserInputForm.this,
                            "Data saved successfully!", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    for (JTextField field : fields) {
                        field.setText("");
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(UserInputForm.this,
                            "Error writing to file: " + ex.getMessage(), "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(saveButton, gbc);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserInputForm().setVisible(true);
            }
        });
    }
}
