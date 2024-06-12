package Interfaz;

import javax.swing.*;

public class Principal extends JDialog {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTable Victims;
    private JButton ADDButton;
    private JButton DELETEButton;

    public Principal() {
        setContentPane(panel);
        setModal(true);



    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
