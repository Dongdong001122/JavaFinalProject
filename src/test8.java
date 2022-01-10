import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        SavingAccount saver=new SavingAccount();
        saver.SavingAccount();
    }
}
class SavingAccount {
    private double rate=0.03; //Annual interest is 3%
    private Double Deposits;//Initial the deposit


    public void SavingAccount(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please input the volume:");
        Deposits=input.nextDouble();//Input the deposits.

        double interest_year=rate*Deposits;
        double interest_month=rate*Deposits/12;//calculate the interest

        System.out.println("Annual interest is "+interest_year+"\nMonthly interest is "+interest_month);
    }
}