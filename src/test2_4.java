import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test2_4 {
    public static void main(String[] args) {
        long StartTime =System.nanoTime();   //Obtain the starting time
        List<Integer> PrimeList = new ArrayList<>();//Initial the list storages the primes.
        List<Integer> PrimeLessThan10= new ArrayList<>();//Initial the list for primes less than 10.
        PrimeLessThan10.add (2);PrimeLessThan10.add (3);PrimeLessThan10.add (5);PrimeLessThan10.add (7);//Add elems

        boolean IsPrime;int Prime;
        PrimeList.add(2);//add 2 to the list
        System.out.print(2+ " ");//Considering the particularity of 2, loop from 3
        for (int i = 3; i < 100; i+=2) {
            IsPrime = true;//Suppose i is a prime number
            for (Integer j : PrimeLessThan10 ) {//Traverse the list PrimeList
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
        System.out.println(PrimeList);//Print the list of prime.

        long EndTime=System.nanoTime(); //Obtain the ending time.
        System.out.println("Running time: "+(EndTime- StartTime)+" ns");//Print runnint time.
    }
}
