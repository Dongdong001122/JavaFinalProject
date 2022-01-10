public class test1_1 {
    public static void main(String[] args) {
        int i=1;//The initial value is 1
        while (true){//Infinite loop
            if(i%5+i%7==0)//It is divisible by 5 and 7 at the same time, which means the remainder with 7 and 5 sums to 0
                System.out.println(i);//Print the i divisible by 5 and 7.
            if(++i>100) break;//Determine whether i is greater than 100 and add 1 and jump out of the loop when i is greater than 100.
        }
    }
}


