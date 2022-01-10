import java.util.ArrayList;
import java.util.List;

public class test2_3 {
    public static void main(String[] args) {
        long StartTime =System.nanoTime();   //Obtain the starting time
        List<Integer> PrimeList = new ArrayList<>();//The list storages the primes.

        boolean IsPrime;int Prime;
        PrimeList.add(2);//add 2 to the list
        System.out.print(2+ " ");//Considering the particularity of 2, loop from 3
        for (int i = 3; i < 100; i+=2) {
            IsPrime = true;//Suppose i is a prime number
            for (Integer j : PrimeList ) {//Traverse the list PrimeList
                if (i % j == 0) {
                    IsPrime = false;//If it is divisible, i isn't a prime number, the loop is jumped out and IsPrime=false.
                    break;
                }
            }
            if (IsPrime) {
                PrimeList.add(i);//The prime is added in the list.
            }
        }
        System.out.println("\nThe sum of the prime less than 100 is "
                +PrimeList.stream().reduce(Integer::sum).orElse(0));//Print the sum of prime numbers.
        System.out.println(PrimeList.toString());//Print the list of prime.

        long EndTime=System.nanoTime(); //Obtain the ending time.
        System.out.println("Running time: "+(EndTime- StartTime)+" ns");//Print runnint time.
    }
}
