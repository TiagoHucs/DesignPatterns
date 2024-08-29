import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        // Configurações da janela principal
        setTitle("Customer Management");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Labels e campos de texto
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 20, 80, 25);
        add(idLabel);

        JTextField idField = new JTextField();
        idField.setBounds(100, 20, 200, 25);
        add(idField);

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(20, 60, 80, 25);
        add(firstNameLabel);

        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(100, 60, 200, 25);
        add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(20, 100, 80, 25);
        add(lastNameLabel);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(100, 100, 200, 25);
        add(lastNameField);

        JLabel telLabel = new JLabel("Tel:");
        telLabel.setBounds(20, 140, 80, 25);
        add(telLabel);

        JTextField telField = new JTextField();
        telField.setBounds(100, 140, 200, 25);
        add(telField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 180, 80, 25);
        add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(100, 180, 200, 25);
        add(emailField);

        // Botão Clear
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(100, 220, 200, 30);
        add(clearButton);

        // Tabela
        String[] columnNames = {"Id", "First Name", "Last Name", "Tel", "Email"};
        Object[][] data = {
                {"1", "AA", "BB", "11111199", "test@gmail.com"},
                {"2", "CC", "DD", "112334", "ccdd@mail.com"},
                {"3", "LLLL", "MMMM", "864567811", "LMLM@mail.com"},
                {"4", "BBZA", "NRDA", "98756789", "BBN@gmail.com"},
                {"6", "NFC", "NLC", "863456789", "11test@gmail.com"},
                {"7", "QQ", "QQ", "5678967", "QQ@gmail.com"},
                {"8", "HHH", "RT", "440999", "HK12@mail.com"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(320, 20, 450, 200);
        add(scrollPane);

        // Botões de Insert, Edit e Remove
        JButton insertButton = new JButton("Insert");
        insertButton.setBounds(320, 230, 130, 30);
        add(insertButton);

        JButton editButton = new JButton("Edit");
        editButton.setBounds(460, 230, 130, 30);
        add(editButton);

        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(600, 230, 130, 30);
        add(removeButton);

        // Painéis para exibir a quantidade de pedidos, o total de pedidos e a data do último pedido
        JPanel ordersCountPanel = new JPanel();
        ordersCountPanel.setBounds(20, 270, 200, 100);
        ordersCountPanel.setBackground(new Color(255, 204, 0));
        ordersCountPanel.setLayout(new BorderLayout());
        JLabel ordersCountLabel = new JLabel("Orders Count:");
        ordersCountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel ordersCountValue = new JLabel("###");
        ordersCountValue.setHorizontalAlignment(SwingConstants.CENTER);
        ordersCountPanel.add(ordersCountLabel, BorderLayout.NORTH);
        ordersCountPanel.add(ordersCountValue, BorderLayout.CENTER);
        add(ordersCountPanel);

        JPanel totalAmountPanel = new JPanel();
        totalAmountPanel.setBounds(240, 270, 200, 100);
        totalAmountPanel.setBackground(new Color(153, 51, 204));
        totalAmountPanel.setLayout(new BorderLayout());
        JLabel totalAmountLabel = new JLabel("Total Orders Amount:");
        totalAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel totalAmountValue = new JLabel("###");
        totalAmountValue.setHorizontalAlignment(SwingConstants.CENTER);
        totalAmountPanel.add(totalAmountLabel, BorderLayout.NORTH);
        totalAmountPanel.add(totalAmountValue, BorderLayout.CENTER);
        add(totalAmountPanel);

        JPanel lastOrderPanel = new JPanel();
        lastOrderPanel.setBounds(460, 270, 200, 100);
        lastOrderPanel.setBackground(new Color(255, 102, 0));
        lastOrderPanel.setLayout(new BorderLayout());
        JLabel lastOrderLabel = new JLabel("Last Order Date:");
        lastOrderLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel lastOrderValue = new JLabel("###");
        lastOrderValue.setHorizontalAlignment(SwingConstants.CENTER);
        lastOrderPanel.add(lastOrderLabel, BorderLayout.NORTH);
        lastOrderPanel.add(lastOrderValue, BorderLayout.CENTER);
        add(lastOrderPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
