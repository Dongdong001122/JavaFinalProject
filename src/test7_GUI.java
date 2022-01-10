import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test7_GUI {
    private JPanel panel1;
    private JTextArea textRadius;
    private JButton OKButton;
    private JLabel Label1;
    private JTextArea textArea;

    public static void main(String[] args) {
        JFrame frame = new JFrame("test7_GUI");
        frame.setContentPane(new test7_GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public test7_GUI() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double r=Double.parseDouble(textRadius.getText());
                //Get the text and turn into double float.
                double Area=Math.PI*Math.pow(r,2);//S=πr^2
                textArea.setText(String.valueOf(Area));
                //Turning double into string and output.
            }
        });
    }
}
