public class test1_3 {
    public static void main(String[] args) {
        int i = 1;//初始值为1
        int remainder_sum;//Define the sum of the remainder.
        do{
            remainder_sum=i % 5 + i % 7;
            switch (remainder_sum){
                case 0:
                    System.out.println(i);//When the sum of remainder is 0 print the number.
                default:
                    continue;//When the sum of remainder is more than 0 the loop continues.
            }
        }while (++i <= 100);//If i is less than 100, an auto-increment operation is performed.
    }
}
