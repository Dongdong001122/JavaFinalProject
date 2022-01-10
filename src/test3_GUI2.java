import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test3_GUI2 {
    private JTextArea PowerTextField;
    private JButton OK;
    private JLabel FeeLabel;
    private JPanel testJPanel;
    private JTextPane pleaseInputTheVolumeTextPane;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Power Fee Calculator");//Title for the frame
        frame.setContentPane(new test3_GUI2().testJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public test3_GUI2() {
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Parse volume of power as a double and calculate by the function.
                double power = Double.parseDouble(PowerTextField.getText());
                FeeLabel.setText("The fee is "+Power.Fee(power) + " dollars");
            }
        });
    }
}


class Power{//Class for calculating the fee of power
    public static double Fee(double volume){
        double fee;//Initial the variable fee.
        if(volume<=50)fee=volume*0.538; //When the power volume is less than 50
        else if(volume<=200)//When the power volume is less than 200
            fee=50*0.538+(volume-50)*0.568;
        else fee=50*0.538+150*0.568+(volume-200)*0.638;//When the power volume is more than 200
        return fee;
    }
}