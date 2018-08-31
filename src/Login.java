import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel mainpanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton submitButton;
    private JButton clearButton;

    public Login() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, textField1.getText()+ " " + new String (passwordField1.getPassword()));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                passwordField1.setText("");
            }
        });
    }

    public JPanel getMainPanel () {
        return mainpanel;
    }
}
