import java.util.Scanner;

public class test3_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please input the volume:");
        System.out.println(Fee(input.nextDouble()));//Input the volume and print the fee
    }

    public static double Fee(double volume){
        double fee;//Initial the variable fee.
        if(volume<=50)fee=volume*0.538; //When the power volume is less than 50
        else if(volume<=200)//When the power volume is less than 200
            fee=50*0.538+(volume-50)*0.568;
        else fee=50*0.538+150*0.568+(volume-200)*0.638;//When the power volume is more than 200
        return fee;
    }
}
