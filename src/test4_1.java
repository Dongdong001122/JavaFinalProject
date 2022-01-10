public class test4_1 {
    public static void main(String[] args) {
        int number = 0;
        for(;number<=29910;number+=35*37) {
            //Traverse all integers which can be divided by 37 and 25 between 0 and 29910
            if (20010 <= number && number%100==10) {
                //If the number can be divided by 35 and 37
                System.out.println("The number is " + number);//Print the number.
                break;//End up the loop.
            }
        }
    }
}
