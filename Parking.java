import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Parking {
    JFrame frame;
    SpringLayout layout;
    Container container;
    JLabel l1, l2, l3, l4, l5, l6;
    JComboBox<String> comboBox;
    JButton b1, b2, b3, b4, b5, b6;
    JTextField t1, t2, t3, t4;
    JTable table;
    DefaultTableModel tableModel;
    double exitedVehicleIncome = 0;

    public void project() {
        frame = new JFrame("Parking Management");
        layout = new SpringLayout();
        frame.setSize(800, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container = frame.getContentPane();
        container.setBackground(Color.white);
        container.setLayout(layout);

        l1 = new JLabel("Name of Owner");
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Serif", Font.BOLD, 15));
        layout.putConstraint(SpringLayout.WEST, l1, 30, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, l1, 80, SpringLayout.NORTH, container);

        l2 = new JLabel("Contact Number");
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Serif", Font.BOLD, 15));
        layout.putConstraint(SpringLayout.WEST, l2, 30, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, l2, 130, SpringLayout.NORTH, container);

        l3 = new JLabel("Registration Number");
        l3.setFont(new Font("Serif", Font.BOLD, 15));
        l3.setForeground(Color.RED);
        layout.putConstraint(SpringLayout.WEST, l3, 30, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, l3, 180, SpringLayout.NORTH, container);

        l4 = new JLabel("Vehicle");
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Serif", Font.BOLD, 15));
        layout.putConstraint(SpringLayout.WEST, l4, 350, SpringLayout.WEST, l2);
        layout.putConstraint(SpringLayout.NORTH, l4, 80, SpringLayout.NORTH, container);

        l5 = new JLabel("Amount");
        l5.setForeground(Color.RED);
        l5.setFont(new Font("Serif", Font.BOLD, 15));
        layout.putConstraint(SpringLayout.WEST, l5, 350, SpringLayout.WEST, l3);
        layout.putConstraint(SpringLayout.NORTH, l5, 130, SpringLayout.NORTH, container);

        l6 = new JLabel("Detail of Parking");
        layout.putConstraint(SpringLayout.WEST, l6, 250, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, l6, 15, SpringLayout.NORTH, container);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Serif", Font.BOLD, 30));

        b1 = createButton("Add", 85, 30);
        layout.putConstraint(SpringLayout.WEST, b1, 60, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, b1, 240, SpringLayout.NORTH, container);
        b1.setForeground(Color.RED);
        b1.setBackground(Color.white);
        b1.setBorderPainted(false);
        b1.setFont(new Font("Serif", Font.BOLD, 18));
        b2 = createButton("Edit", 85, 30);

        layout.putConstraint(SpringLayout.WEST, b2, 180, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, b2, 240, SpringLayout.NORTH, container);
        b2.setForeground(Color.RED);
        b2.setBackground(Color.white);
        b2.setBorderPainted(false);
        b2.setFont(new Font("Serif", Font.BOLD, 18));

        b3 = createButton("Delete", 85, 30);
        layout.putConstraint(SpringLayout.WEST, b3, 300, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, b3, 240, SpringLayout.NORTH, container);
        b3.setForeground(Color.RED);
        b3.setBackground(Color.white);
        b3.setBorderPainted(false);
        b3.setFont(new Font("Serif", Font.BOLD, 18));

        b4 = createButton("Income", 95, 30);
        b4.setForeground(Color.RED);
        b4.setBackground(Color.white);
        b4.setBorderPainted(false);
        b4.setFont(new Font("Serif", Font.BOLD, 18));
        layout.putConstraint(SpringLayout.WEST, b4, 420, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, b4, 240, SpringLayout.NORTH, container);

        b5 = createButton("Exit", 85, 30);
        layout.putConstraint(SpringLayout.WEST, b5, 540, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, b5, 240, SpringLayout.NORTH, container);
        b5.setForeground(Color.RED);
        b5.setBackground(Color.white);
        b5.setBorderPainted(false);
        b5.setFont(new Font("Serif", Font.BOLD, 18));


        t1 = new JTextField(15);
        t1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        layout.putConstraint(SpringLayout.WEST, t1, 190, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, t1, 0, SpringLayout.NORTH, l1);

        t2 = new JTextField(15);
        t2.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        layout.putConstraint(SpringLayout.WEST, t2, 190, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, t2, 0, SpringLayout.NORTH, l2);

        t3 = new JTextField(15);
        t3.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        layout.putConstraint(SpringLayout.WEST, t3, 190, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, t3, 0, SpringLayout.NORTH, l3);

        t4 = new JTextField(15);
        layout.putConstraint(SpringLayout.WEST, t4, 80, SpringLayout.WEST, l5);
        layout.putConstraint(SpringLayout.NORTH, t4, 0, SpringLayout.NORTH, l5);

        String[] vehicleTypes = {"Car", "Bike", "Rikshaw", "Others"};
        comboBox = new JComboBox(vehicleTypes);
        layout.putConstraint(SpringLayout.WEST, comboBox, 80, SpringLayout.WEST, l4);
        layout.putConstraint(SpringLayout.NORTH, comboBox, 0, SpringLayout.NORTH, l4);
        comboBox.setPreferredSize(new Dimension(100, 20));
        comboBox.setBackground(Color.white);

        String[] columnNames = {"Owner", "Contact", "Registration", "Vehicle", "Amount"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.getViewport().setBackground(Color.WHITE);
        layout.putConstraint(SpringLayout.WEST, scrollPane, 30, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, scrollPane, 300, SpringLayout.NORTH, container);
        layout.putConstraint(SpringLayout.EAST, scrollPane, -30, SpringLayout.EAST, container);
        layout.putConstraint(SpringLayout.SOUTH, scrollPane, -30, SpringLayout.SOUTH, container);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String owner = t1.getText();
                String contact = t2.getText();
                String registration = t3.getText();
                String vehicle = (String) comboBox.getSelectedItem();
                String amount = t4.getText();

                if (owner.isEmpty() || contact.isEmpty() || registration.isEmpty()  || amount.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    tableModel.addRow(new Object[]{owner, contact, registration, vehicle, amount});
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    comboBox.setSelectedIndex(0);
                }
            }
        });

        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    if (t1.getText().isEmpty() && t2.getText().isEmpty() && t3.getText().isEmpty() && t4.getText().isEmpty()) {
                        t1.setText((String) tableModel.getValueAt(selectedRow, 0));
                        t2.setText((String) tableModel.getValueAt(selectedRow, 1));
                        t3.setText((String) tableModel.getValueAt(selectedRow, 2));
                        t4.setText((String) tableModel.getValueAt(selectedRow, 4));
                        comboBox.setSelectedItem(tableModel.getValueAt(selectedRow, 3));
                    } else {
                        // Update the selected row with the new data from the fields
                        String owner = t1.getText();
                        String contact = t2.getText();
                        String registration = t3.getText();
                        String vehicle = (String) comboBox.getSelectedItem();
                        String amount = t4.getText();

                        if (owner.isEmpty() || contact.isEmpty() || registration.isEmpty() || vehicle.isEmpty() || amount.isEmpty()) {
                            JOptionPane.showMessageDialog(frame, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            tableModel.setValueAt(owner, selectedRow, 0);
                            tableModel.setValueAt(contact, selectedRow, 1);
                            tableModel.setValueAt(registration, selectedRow, 2);
                            tableModel.setValueAt(vehicle, selectedRow, 3);
                            tableModel.setValueAt(amount, selectedRow, 4);
                            clearFields();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to edit", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            private void clearFields() {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                comboBox.setSelectedIndex(0);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double totalIncome = 0;
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    String amountStr = (String) tableModel.getValueAt(i, 4);
                    try {
                        double amount = Double.parseDouble(amountStr);
                        totalIncome += amount;
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid amount at row " + (i + 1), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                totalIncome += exitedVehicleIncome;
                frame.setTitle("Parking Management - Total Income : " + totalIncome);
                JOptionPane.showMessageDialog(frame, "Total Income: " + totalIncome, "Income", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String regNo = JOptionPane.showInputDialog(frame, "Enter Registration Number:");
                if (regNo != null && !regNo.isEmpty()) {
                    boolean found = false;
                    for (int i = 0; i < tableModel.getRowCount(); i++) {
                        String tableRegNo = (String) tableModel.getValueAt(i, 2);
                        if (regNo.equals(tableRegNo)) {
                            found = true;
                            int option = JOptionPane.showConfirmDialog(frame, "Vehicle with registration number '" + regNo + "' found. Do you want to exit it?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                            if (option == JOptionPane.YES_OPTION) {
                                String amountStr = (String) tableModel.getValueAt(i, 4);
                                try {
                                    double amount = Double.parseDouble(amountStr);
                                    exitedVehicleIncome += amount; // Store the income from the exiting vehicle
                                    tableModel.removeRow(i);
                                    JOptionPane.showMessageDialog(frame, "Vehicle exited. " );
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(frame, "Invalid amount at row " + (i + 1), "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            break;
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(frame, "Vehicle with registration number '" + regNo + "' not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid registration number.");
                }
            }
        });

        container.add(l1);
        container.add(l2);
        container.add(l3);
        container.add(l4);
        container.add(l5);
        container.add(b1);
        container.add(b2);
        container.add(b3);
        container.add(b4);
        container.add(b5);
        container.add(t1);
        container.add(t2);
        container.add(t3);
        container.add(t4);
        container.add(comboBox);
        container.add(l6);
        container.add(scrollPane);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setVisible(true);
    }

    private JButton createButton(String text, int width, int height) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(width, height));
        return button;
    }

    Parking() {
        project();
    }

    public static void main(String[] args) {
        new Parking();
    }
}