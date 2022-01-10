import java.util.Scanner;

public class useDate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please in put the year");
        int year=input.nextInt();
        System.out.println("Please in put the month");
        int month=input.nextInt();
        System.out.println("Please in put the day");
        int day=input.nextInt();
        Date date=new Date(year,month,day);
        date.showDate();//调用showDate方法显示日期
    }
}


class Date{
    int y, m,  d;
    public Date(int y,int m, int d){
        this.y=y;
        this.m=m;
        this.d=d;
        }
    void showDate(){
        System.out.print(y+"年"+m+"月"+d+"日");
    }
}