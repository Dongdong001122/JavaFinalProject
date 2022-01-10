import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class test3_GUI {
    public static double Fee(double volume){
        double fee;//Initial the variable fee.
        if(volume<=50)fee=volume*0.538; //When the power volume is less than 50
        else if(volume<=200)//When the power volume is less than 200
            fee=50*0.538+(volume-50)*0.568;
        else fee=50*0.538+150*0.568+(volume-200)*0.638;//When the power volume is more than 200
        return fee;
    }

    public static void main(String[] args) {
        int gap = 10;
        JFrame f = new JFrame("Power Fee Calculator");
        f.setSize(410, 400);
        f.setLocation(200, 200);
        f.setLayout(null);

        JPanel pInput = new JPanel();
        pInput.setBounds(gap, gap, 375, 120);
        pInput.setLayout(new GridLayout(4,3,gap,gap));

        JLabel volume= new JLabel("Power:");
        JTextField locationText = new JTextField();
        JButton b = new JButton("Calculate");

        pInput.add( volume);
        pInput.add(locationText);

        //Text Field
        JTextArea ta = new JTextArea();
        ta.setLineWrap(true);
        b.setBounds(150, 120 + 30, 100, 30);
        ta.setBounds(gap, 150 + 60, 375, 120);



        f.add(pInput);
        f.add(b);
        f.add(ta);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        f.setVisible(true);
        //Mouse Listener
        b.addActionListener(new ActionListener(){
            boolean checkedpass = true;
            public void actionPerformed(ActionEvent e){
                checkedpass = true;
                checkEmpty(locationText,"Power");
                String volume =  locationText.getText();

                if(checkedpass){

                    String result=(Fee(Float.parseFloat( volume)))+"";
                    ta.setText("");
                    ta.append(result);
                }

            }

            //Check empty
            private void checkEmpty(JTextField tf, String msg){
                if(!checkedpass)
                    return;
                String value = tf.getText();
                if(value.length()==0){
                    JOptionPane.showMessageDialog(f, msg + " is not empty");
                    tf.grabFocus();
                    checkedpass = false;
                }
            }
        });
    }
}
 
 