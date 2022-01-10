public class test1 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%5+i%7!=0 ) //It is divisible by 5 and 7 at the same time, which means the remainder with 7 and 5 sums to 0
                continue;//The jump statement
            else System.out.println(i);//Print the i divisible by 5 and 7.
        }
    }
}
