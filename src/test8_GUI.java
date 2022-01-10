import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class test8_GUI {
    private JTextField DepositArea;
    private JButton button1;
    private JTextArea AnnualArea;
    private JLabel AnnualLabel;
    private JLabel MonthlyLabel;
    private JTextArea MonthlyArea;
    private JPanel sad;

    public static void main(String[] args) {
        JFrame frame = new JFrame("test8_GUI");
        frame.setContentPane(new test8_GUI().sad);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public test8_GUI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double deposit=Double.parseDouble(DepositArea.getText());
                SavingAccount_ NewCount=new SavingAccount_();//new object
                Map<String, Double> InterestMap=NewCount.SavingAccount_(deposit);//Call the method and calculate the interest
                AnnualArea.setText(String.valueOf(InterestMap.get("Annual Inerest")));//Out put the interest
                MonthlyArea.setText(String.valueOf(InterestMap.get("Monthly Inerest")));
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


class SavingAccount_ {
    Map<String, Double> InterestMap = new HashMap<String, Double>();//HashMap for interest.
    private double rate=0.03,deposits; //Annual interest is 3% and initial deposits
    public Map<String, Double> SavingAccount_(double deposits){
        double interest_year=rate*deposits;
        double interest_month=rate*deposits/12;//calculate the interest
        System.out.println("Annual interest is "+interest_year+"\nMonthly interest is "+interest_month);

        InterestMap.put("Annual Inerest",interest_year);
        InterestMap.put("Monthly Inerest",interest_month);

        return InterestMap;
    }
}