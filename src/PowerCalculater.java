import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class PowerCalculater {
    private JTextField Input;
    private JButton Calculate;
    private JTextField Output;
    private JPanel mainroot;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PowerCalculater");
        frame.setContentPane(new PowerCalculater().mainroot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //设置按钮事件和输出，根据《从入门到精通》

    }

    public PowerCalculater() {
        Output.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World!");

            }
        });
    }
}
