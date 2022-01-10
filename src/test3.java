import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        double volume,fee;
        Scanner input=new Scanner(System.in);
        System.out.println("Please input the volume:");
        volume=input.nextDouble();//Input the power usage
        if(volume<=50)fee=volume*0.538; //When the power volume is less than 50
        else if(volume<=200)//When the power volume is less than 200
            fee=50*0.538+(volume-50)*0.568;
        else fee=50*0.538+150*0.568+(volume-200)*0.638;//When the power volume is more than 200
        System.out.printf("The fee for %f is %f",volume,fee);//Print the fee and the volume
    }
}
