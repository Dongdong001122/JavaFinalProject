public class test2 {
    public static void main(String[] args) {
        long startTime=System.nanoTime();   //Obtain the starting time

        boolean is_prime;
        int sum=2;//set initial value
        System.out.print(2+ " ");//Considering the particularity of 2, loop from 3
        for (int i = 3; i < 100; i+=2) {
            is_prime = true;//Suppose i is a prime number
            for (int j = 3; j <= Math.sqrt(i); j++) {//The number divisible by i must be less than its square root
                if (i % j == 0) {
                    is_prime = false;//If it is divisible, i isn't a prime number, the loop is jumped out and is_prime=false.
                    break;
                }
            }
            if (is_prime) {
                System.out.print(i + " ");//If none are not divisible, output i
                sum += i;
            }
        }
        System.out.println("\nThe sum of the prime less than 100 is "+sum);

        long endTime=System.nanoTime(); //Obtain the ending time.
        System.out.println("Running time: "+(endTime-startTime)+" ns");//Print runnint time.
    }
}
