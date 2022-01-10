import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        System.out.println("Please type in the radius of the circle.\n");
        Scanner sc = new Scanner(System.in);//Create Scanner object sc
        double r = sc.nextDouble();//Input the radius as double float type.

        double Area=Math.PI*Math.pow(r,2);//S=πr^2
        System.out.println("The area of the circle is: "+Area);

    }
}

