public class test4 {
    public static void main(String[] args) {
        int number = 0;
        for(int i=0;i<100;i++) {//Traverse all integers between 20010 and 29910
            number = 20_000 + i*100 + 10;//Contract the number.
            if (number % 35 + number % 37 == 0) {//If the number can be divided by 35 and 37
                System.out.println("The number is " + number);//Print the number.
                break;//End up the loop.
            }
        }
    }
}
