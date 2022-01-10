import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class useDateGUI {
    private JTextArea textYear;
    private JTextArea textMonth;
    private JTextArea textDay;
    private JPanel Date;
    private JPanel useDateJPanel;
    private JButton dateButton;
    private JLabel DateLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("useDateGUI");
        frame.setContentPane(new useDateGUI().useDateJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public useDateGUI() {
        dateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year=Integer.parseInt(textYear.getText());//Get the string in the text area and convert into integer.
                int month=Integer.parseInt(textMonth.getText());
                int day=Integer.parseInt(textDay.getText());
                DateLabel.setText(year+"年"+month+"月"+day+"日");//Output the date in label.
            }
        });
    }
}


class Date_ {
    int y, m,  d;
    public Date_(int y, int m, int d){
        this.y=y;
        this.m=m;
        this.d=d;
    }
    void showDate(){
        System.out.print(y+"年"+m+"月"+d+"日");
    }

    String show_Date(){
        return y+"年"+m+"月"+d+"日";
    }
}