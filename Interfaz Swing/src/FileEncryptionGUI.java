import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.*;

public class FileEncryptionGUI extends JFrame implements ActionListener {
    private JTextField inputFileField, keyField;
    private JButton browseButton, encryptButton;
    private JTextArea logArea;

    public FileEncryptionGUI() {
        super("File Encryption");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel inputFileLabel = new JLabel("Input File:");
        inputFileField = new JTextField(20);
        browseButton = new JButton("Browse");
        browseButton.addActionListener(this);
        inputPanel.add(inputFileLabel);
        inputPanel.add(inputFileField);
        inputPanel.add(browseButton);

        JPanel keyPanel = new JPanel(new FlowLayout());
        JLabel keyLabel = new JLabel("Key:");
        keyField = new JTextField(20);
        keyPanel.add(keyLabel);
        keyPanel.add(keyField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        encryptButton = new JButton("Encrypt");
        encryptButton.addActionListener(this);
        buttonPanel.add(encryptButton);

        logArea = new JTextArea(10, 30);
        logArea.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(logArea);

        add(inputPanel, BorderLayout.NORTH);
        add(keyPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(logScrollPane, BorderLayout.EAST);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == browseButton) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                inputFileField.setText(selectedFile.getAbsolutePath());
            }
        } else if (e.getSource() == encryptButton) {
            String inputFile = inputFileField.getText();
            String key = keyField.getText();
            try {
                encryptFile(inputFile, key);
                log("Encryption successful!");
            } catch (Exception ex) {
                log("Error: " + ex.getMessage());
            }
        }
    }

    private void encryptFile(String inputFile, String key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[(int) new File(inputFile).length()];
        inputStream.read(inputBytes);
        byte[] outputBytes = cipher.doFinal(inputBytes);

        FileOutputStream outputStream = new FileOutputStream(inputFile + ".encrypted");
        outputStream.write(outputBytes);

        inputStream.close();
        outputStream.close();
    }

    private void log(String message) {
        logArea.append(message + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FileEncryptionGUI().setVisible(true);
        });
    }
}
