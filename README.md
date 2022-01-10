# JavaFinalProject
《JAVA程序设计》期末课程设计

目录

[《JAVA程序设计》期末课程设计](#_Toc92668870)

[1. 利用循环与跳转语句显示1-100中所有能被5且能被7整除的数。](#github仓库地址)

[1.1. 概要设计](#概要设计)

[1.1.1. 设计内容](#设计内容)

[1.1.2. 思路](#思路)

[1.1.3. 流程图：](#流程图)

[1.2. 详细设计、调试与分析](#详细设计调试与分析)

[1.2.1. 方法一：for循环遍历1-100的整数](#程序一for循环遍历1-100的整数)

[1.2.2. 方法二：while循环遍历1-100的整数](#程序二while循环遍历1-100的整数)

[1.2.3. 方法三：do while循环遍历1-100的整数](#程序三do-while循环遍历1-100的整数)

[1.2.4. 方法四：do
while循环遍历1-100的整数,用switch语句选择](#程序四do-while循环遍历1-100的整数用switch语句选择)

[1.2.5. 分析讨论：](#分析讨论)

[2.
素数是只能被1和其本身整除的数，比如2、3、5、7等，设计一个程序，求出100以内素数的和，要求尽可能减少程序的运算次数。](#素数是只能被1和其本身整除的数比如2357等设计一个程序求出100以内素数的和要求尽可能减少程序的运算次数)

[2.1. 概要设计](#概要设计-1)

[2.1.1. 内容](#内容)

[2.1.2. 思路](#思路-1)

[2.2. 详细设计、调试与分析：](#详细设计调试与分析-1)

[2.2.1.
方法一：在main方法中，遍历100以内所有整数，用条件语句判断是否能被所有比它的平方根小的数整除，并输出所有素数。](#程序一在main方法中遍历100以内所有整数用条件语句判断是否能被所有比它的平方根小的数整除并输出所有素数)

[2.2.2.
方法二：用一个list储存已经找到的素数，并在列表中做求和运算](#程序二用一个list储存已经找到的素数并在列表中做求和运算)

[2.2.3. 方法三：把遍历列表改为[2,3,5,7]](#程序三把遍历列表改为2357)

[3.
电费计收的具体方案是，月用电量低于50千瓦时部分，电价仍为0.538元/千瓦时;51～200千瓦时部分，单价为0.568元/千瓦时;超过200千瓦时部分，电价为0.638元/千瓦时。编写程序完成电费的计算，要求任意输入一个电量数字能够算出电费。](#电费计收的具体方案是月用电量低于50千瓦时部分电价仍为0538元千瓦时51200千瓦时部分单价为0568元千瓦时超过200千瓦时部分电价为0638元千瓦时编写程序完成电费的计算要求任意输入一个电量数字能够算出电费)

[3.1. 概要设计](#概要设计-2)

[3.1.1. 设计内容](#设计内容-1)

[3.1.2. 思路](#思路-2)

[3.2. 详细设计、调试与分析：](#详细设计调试与分析-2)

[3.2.1.
程序一：用if语句，在test3的main方法中实现功能。](#程序一用if语句在test3的main方法中实现功能)

[3.2.2.
程序二：用if语句，在test3_1的main方法中调用函数实现功能。](#程序二用if语句在test3_1的main方法中调用函数实现功能)

[3.2.3. 程序三：用IDEA Swing
Designer设计一个GUI实现输入用电量并输出电费。在Power类中实现电费的计算，在test3_GUI2类中actionPerformed(ActionEvent
e)函数进行输出。](#程序三用idea-swing-designer设计一个gui实现输入用电量并输出电费在power类中实现电费的计算在test3_gui2类中actionperformedactionevent-e函数进行输出)

[4.
一张卡片上面写着一个五位数的数字，但是小王不小心把墨水弄到卡片上去了，导致百位和千位上的数字看不清楚，只能看到2\*\*10，小王的爸爸告诉小王这个数能被35和37整除。请设计一个程序帮助小王快速判断这个数具体是多少。](#一张卡片上面写着一个五位数的数字但是小王不小心把墨水弄到卡片上去了导致百位和千位上的数字看不清楚只能看到210小王的爸爸告诉小王这个数能被35和37整除请设计一个程序帮助小王快速判断这个数具体是多少)

[4.1. 概要设计：](#概要设计-3)

[4.1.1. 设计内容：](#设计内容-2)

[4.1.2. 思路](#思路-3)

[4.1.3. 流程图：](#流程图-1)

[4.2. 详细设计、调试与分析：](#详细设计调试与分析-3)

[4.2.1.
程序一：在test4类中，实现对目标五位数的查找。](#程序一在test4类中实现对目标五位数的查找)

[4.2.2.
程序二：test4_1类中，遍历35\*37的倍数，并选择符合条件的五位数进行输出。](#程序二test4_1类中遍历3537的倍数并选择符合条件的五位数进行输出)

[5. 编写日期类Date，要求成员变量：year，month，day。方法：Date(int y,int m, int
d)，构造方法,y、m、d分别表示年月日。void
showDate()以“\*\*\*\*年\*\*月\*\*日”形式显示日期。另编写一个类useDate，在其中调用Date类，创建一个Date对象，并输出日期。](#编写日期类date要求成员变量yearmonthday方法dateint-yint-m-int-d构造方法ymd分别表示年月日void-showdate以年月日形式显示日期另编写一个类usedate在其中调用date类创建一个date对象并输出日期)

[5.1. 概要设计](#概要设计-4)

[5.1.1. 内容](#内容-1)

[5.1.2. 思路](#思路-4)

[5.1.3. 流程图](#流程图-2)

[5.1.4. **UML**类图](#uml类图)

[5.2. 详细设计、调试与分析](#详细设计调试与分析-4)

[5.2.1. 程序一：useDate和Date类](#程序一usedate和date类)

[5.2.2.
程序二：设计GUI，实现日期的输入与输出](#程序二设计gui实现日期的输入与输出)

[6. 编写学生类Student，要求有成员变量：name 代表姓名，String型；sn
代表学号，int型。方法：Student（Sting s1, int
n）,构造方法，参数s1表示姓名，n表示学号。void
showStu()方法用来显示姓名及学号。另编写一个类useStu，在其中创建一个Student对象，输出其成员变量。](#编写学生类student要求有成员变量name-代表姓名string型sn-代表学号int型方法studentsting-s1-int-n构造方法参数s1表示姓名n表示学号void-showstu方法用来显示姓名及学号另编写一个类usestu在其中创建一个student对象输出其成员变量)

[6.1. 概要设计](#概要设计-5)

[6.1.1. 内容](#内容-2)

[6.1.2. 思路](#思路-5)

[6.1.3. 流程图](#流程图-3)

[6.1.4. **UML**类图](#uml类图-1)

[6.2. 详细设计、调试与分析](#详细设计调试与分析-5)

[6.2.1. 程序代码](#程序代码)

[7.
编写一个描述圆形的类，运行时任意输入半径可以求的圆的面积。](#编写一个描述圆形的类运行时任意输入半径可以求的圆的面积)

[7.1. 概要设计](#概要设计-6)

[7.1.1. 设计内容](#设计内容-3)

[7.1.2. 设计思路](#设计思路)

[7.1.3. 流程图](#流程图-4)

[7.2. 详细设计、调试与分析](#详细设计调试与分析-6)

[7.2.1. 程序一](#程序一)

[7.2.2. 程序二](#程序二)

[8.
创建银行账户类SavingAccount，用类变量存储年利率，用私有实例变量存储存款额。提供计算年利息的方法和计算月利息（年利息/12）的方法。编写一个测试程序测试该类，建立SavingAccount的对象saver，存款额是3000，设置年利率是3%，计算并显示saver的存款额、年利息和月利息。](#创建银行账户类savingaccount用类变量存储年利率用私有实例变量存储存款额提供计算年利息的方法和计算月利息年利息12的方法编写一个测试程序测试该类建立savingaccount的对象saver存款额是3000设置年利率是3计算并显示saver的存款额年利息和月利息)

[8.1. 概要设计](#概要设计-7)

[8.1.1. 设计内容](#设计内容-4)

[8.1.2. 设计思路](#设计思路-1)

[8.1.3. 流程图](#流程图-5)

[8.2. 详细设计、调试与分析](#详细设计调试与分析-7)

[8.2.1. 程序一](#程序一-1)

[8.2.2. 程序二：用IDEA Swing
Designer设计一个GUI实现存款金额的输入与利息计算。](#程序二用idea-swing-designer设计一个gui实现存款金额的输入与利息计算)

# Github仓库地址

<https://github.com/Dongdong001122/JavaFinalProject.git>

# 利用循环与跳转语句显示1-100中所有能被5且能被7整除的数。

## 概要设计

### 设计内容

输出100以内能被5和7整除的数

### 思路

遍历100以内的整数，并用条件语句判断是否能被5和7整除，并输出这些数。

### 流程图：

![](media/0cad143ca369ba4818a553f3b562a862.png)

## 详细设计、调试与分析

### 程序一：for循环遍历1-100的整数

设计test1类，在主方法中for循环遍历100以内的整数，并用条件语句判断是否能被5和7整除，并输出这些数。

#### UML类图

![](media/b5dd023a20ea7c981200bd1381682ca6.png)

#### 程序代码：

public class test1 {

public static void main(String[] args) {

for(int i=1;i\<=100;i++){

if(i%5+i%7!=0 ) //It is divisible by 5 and 7 at the same time, which means the
remainder with 7 and 5 sums to 0

continue;//The jump statement

else System.out.println(i);//Print the i divisible by 5 and 7.

}

}

}

![](media/5bccb10056bbdabf9901edca3e3dbcc1.png)

### 程序二：while循环遍历1-100的整数

设计test1_1类，在主方法中while循环遍历100以内的整数，并用条件语句判断是否能被5和7整除，并输出这些数。

UML类图：

![](media/b5dd023a20ea7c981200bd1381682ca6.png)

#### 程序代码：

public class test1_1 {

public static void main(String[] args) {

int i=1;//The initial value is 1

while (true){//Infinite loop

if(i%5+i%7==0)//It is divisible by 5 and 7 at the same time, which means the
remainder with 7 and 5 sums to 0

System.out.println(i);//Print the i divisible by 5 and 7.

if(++i\>100) break;//Determine whether i is greater than 100 and add 1 and jump
out of the loop when i is greater than 100.

}

}

}

![](media/5bccb10056bbdabf9901edca3e3dbcc1.png)

### 程序三：do while循环遍历1-100的整数

设计test1_2类，在主方法中do
while循环遍历100以内的整数，并用条件语句判断是否能被5和7整除，并输出这些数

#### UML类图：

![](media/71da4e717769d8d9cb053c75f3bac858.png)

#### 程序代码：

public class test1_2 {

public static void main(String[] args) {

int i=1;//The initial value is 1

do{//infinite loop

if(i%5+i%7==0)//It is divisible by 5 and 7 at the same time, which means the
remainder with 7 and 5 sums to 0

System.out.println(i);//Print the i divisible by 5 and 7.

}while (++i\<=100);//Terminate the loop when i is greater than 100

}

}

![](media/df856c373c7c7f235a1cab89aaf0d484.png)

### 程序四：do while循环遍历1-100的整数,用switch语句选择

设计test1_3类，在主方法中do
while循环遍历100以内的整数，并用switch条件语句判断是否能被5和7整除，并输出这些数。

#### UML类图：

![](media/76c7ecb02274223bb99dd892015c529a.png)

#### 程序代码：

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

}while (++i \<= 100);//If i is less than 100, an auto-increment operation is
performed.

}

}

![](media/df856c373c7c7f235a1cab89aaf0d484.png)

### 分析讨论：

用不同的循环语句效果等价，如果把100以内的数推广到小于n的数，其时间复杂度都是，但是其逻辑不一定完全相同。

# 素数是只能被1和其本身整除的数，比如2、3、5、7等，设计一个程序，求出100以内素数的和，要求尽可能减少程序的运算次数。

## 概要设计

### 内容

遍历100以内所有整数，用条件语句查找并输出所有素数。

### 思路

遍历100以内所有整数，用条件语句判断是否能被所有比它的平方根小的数整除，并输出所有素数。

## 详细设计、调试与分析：

### 程序一：在main方法中，遍历100以内所有整数，用条件语句判断是否能被所有比它的平方根小的数整除，并输出所有素数。

#### 流程图

![](media/1056ca77fe891b97dbcf9cd14ef4f548.png)

#### UML类图：

![](media/10c54a9f9808a1ba3f20049f47345819.png)

#### 程序代码

public class test2 {

public static void main(String[] args) {

long startTime=System.nanoTime(); //Obtain the starting time

boolean is_prime;

int sum=2;//set initial value

System.out.print(2+ " ");//Considering the particularity of 2, loop from 3

for (int i = 3; i \< 100; i+=2) {

is_prime = true;//Suppose i is a prime number

for (int j = 3; j \<= Math.sqrt(i); j++) {//The number divisible by i must be
less than its square root

if (i % j == 0) {

is_prime = false;//If it is divisible, i isn't a prime number, the loop is
jumped out and is_prime=false.

break;

}

}

if (is_prime) {

System.out.print(i + " ");//If none are not divisible, output i

sum += i;

}

}

System.out.println("\\nThe sum of the prime less than 100 is "+sum);

long endTime=System.nanoTime(); //Obtain the ending time.

System.out.println("Running time: "+(endTime-startTime)+" ns");//Print runnint
time.

}

}

Out：

![](media/b7dfd722c07d42b44e3c1f4d71da72fd.png)

#### 程序评价

由于每次都需要遍历小于自身平方根的所有整数，时间复杂度比较大。

#### 改进思路

用一个list储存已经找到的素数，并在列表中做求和运算。

### 程序二：用一个list储存已经找到的素数，并在列表中做求和运算

#### 流程图

![](media/7da11ef8ddecdcfe9090f51777c7ae4f.png)

#### UML类图：

![](media/26f5e052c50de7750af047e759bbc4e9.png)

#### 程序代码：

import java.util.ArrayList;

import java.util.List;

public class test2_3 {

public static void main(String[] args) {

long StartTime =System.nanoTime(); //Obtain the starting time

List\<Integer\> PrimeList = new ArrayList\<\>();//The list storages the primes.

boolean IsPrime;int Prime;

PrimeList.add(2);//add 2 to the list

System.out.print(2+ " ");//Considering the particularity of 2, loop from 3

for (int i = 3; i \< 100; i+=2) {

IsPrime = true;//Suppose i is a prime number

for (Integer j : PrimeList ) {//Traverse the list PrimeList

if (i % j == 0) {

IsPrime = false;//If it is divisible, i isn't a prime number, the loop is jumped
out and IsPrime=false.

break;

}

}

if (IsPrime) {

PrimeList.add(i);//The prime is added in the list.

}

}

System.out.println("\\nThe sum of the prime less than 100 is "

\+PrimeList.stream().reduce(Integer::sum).orElse(0));//Print the sum of prime
numbers.

System.out.println(PrimeList.toString());//Print the list of prime.

long EndTime=System.nanoTime(); //Obtain the ending time.

System.out.println("Running time: "+(EndTime- StartTime)+" ns");//Print runnint
time.

}

}

#### Out：

![](media/c8bc82976d0e0b65eba2f462acfbe877.png)

#### 程序评价

运行时间减少为5618770ns，运行时间大大减少。但是这个程序还是遍历了一些不需要遍历的数。

#### 改进思路

由于合数都可以分解为若干个素数的和，且最大的质因数一定小于它的算术平方根。注意到，不妨只遍历小于10的素数2，3，5，7，这样可以进一步减小空间复杂度。

### 程序三：把遍历列表改为[2,3,5,7]

流程图：

![](media/0a09ddb599538192720bc9f760b44d6d.png)

#### UML类图：

![](media/a0eccfdbba2624f7d129fbcecd72d9f8.png)

#### 程序代码：

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;

public class test2_4 {

public static void main(String[] args) {

long StartTime =System.nanoTime(); //Obtain the starting time

List\<Integer\> PrimeList = new ArrayList\<\>();//Initial the list storages the
primes.

List\<Integer\> PrimeLessThan10= new ArrayList\<\>();//Initial the list for
primes less than 10.

PrimeLessThan10.add (2);PrimeLessThan10.add (3);PrimeLessThan10.add
(5);PrimeLessThan10.add (7);//Add elems

boolean IsPrime;int Prime;

PrimeList.add(2);//add 2 to the list

System.out.print(2+ " ");//Considering the particularity of 2, loop from 3

for (int i = 3; i \< 100; i+=2) {

IsPrime = true;//Suppose i is a prime number

for (Integer j : PrimeLessThan10 ) {//Traverse the list PrimeList

if (i % j == 0) {

IsPrime = false;//If it is divisible, i isn't a prime number, the loop is jumped
out and IsPrime=false.

break;

}

}

if (IsPrime) {

PrimeList.add(i);//The prime is added in the list.

}

}

System.out.println("\\nThe sum of the prime less than 100 is "

\+PrimeList.stream().reduce(Integer::sum).orElse(0));//Print the sum of prime
numbers.

System.out.println(PrimeList);//Print the list of prime.

long EndTime=System.nanoTime(); //Obtain the ending time.

System.out.println("Running time: "+(EndTime- StartTime)+" ns");//Print runnint
time.

}

}

#### Out：

![](media/a7acd962d6380346cf22b7603f1e54af.png)

#### 程序评价

减少遍历次数，运行时间进一步缩短。

# 电费计收的具体方案是，月用电量低于50千瓦时部分，电价仍为0.538元/千瓦时;51～200千瓦时部分，单价为0.568元/千瓦时;超过200千瓦时部分，电价为0.638元/千瓦时。编写程序完成电费的计算，要求任意输入一个电量数字能够算出电费。

## 概要设计

### 设计内容

设计一个程序，并用IDEA Swing
Designer设计一个GUI，实现电费的阶梯计价模式下的计算。

### 思路

用if语句或switch语句选择区间，用不同公式计算。

流程图：

![](media/f1050eab62ae25de524c070a292fea5e.png)

## 详细设计、调试与分析：

### 程序一：用if语句，在test3的main方法中实现功能。

#### 程序代码：

import java.util.Scanner;  

public class test3 {  
public static void main(String[] args) {  
double volume,fee;  
Scanner input=new Scanner(System.in);  
System.out.println("Please input the volume:");  
volume=input.nextDouble();//Input the power usage  
if(volume\<=50)fee=volume\*0.538; //When the power volume is less than 50  
else if(volume\<=200)//When the power volume is less than 200  
fee=50\*0.538+(volume-50)\*0.568;  
else fee=50\*0.538+150\*0.568+(volume-200)\*0.638;//When the power volume is
more than 200  
System.out.printf("The fee for %f is %f",volume,fee);//Print the fee and the
volume  
}  
}

#### Out：

![](media/054357632bdf42f7676acf19100bd24a.png)

### 程序二：用if语句，在test3_1的main方法中调用函数实现功能。

#### 程序代码：

import java.util.Scanner;

public class test3_1 {

public static void main(String[] args) {

Scanner input=new Scanner(System.in);

System.out.println("Please input the volume:");

System.out.println(Fee(input.nextDouble()));//Input the volume and print the fee

}

public static double Fee(double volume){

double fee;//Initial the variable fee.

if(volume\<=50)fee=volume\*0.538; //When the power volume is less than 50

else if(volume\<=200)//When the power volume is less than 200

fee=50\*0.538+(volume-50)\*0.568;

else fee=50\*0.538+150\*0.568+(volume-200)\*0.638;//When the power volume is
more than 200

return fee;

}

}

#### Out：

![](media/716509ac388a7c176ae4dff46e4c6361.png)

### 程序三：用IDEA Swing Designer设计一个GUI实现输入用电量并输出电费。在Power类中实现电费的计算，在test3_GUI2类中actionPerformed(ActionEvent e)函数进行输出。

#### 程序代码：

import javax.swing.\*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class test3_GUI2 {

private JTextArea PowerTextField;

private JButton OK;

private JLabel FeeLabel;

private JPanel testJPanel;

private JTextPane pleaseUnputTheVolumeTextPane;

public static void main(String[] args) {

JFrame frame = new JFrame("Power Fee Calculator");//Title for the frame

frame.setContentPane(new test3_GUI2().testJPanel);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.pack();

frame.setVisible(true);

}

public test3_GUI2() {

OK.addActionListener(new ActionListener() {

@Override

public void actionPerformed(ActionEvent e) {

//Parse volume of power as a double and calculate by the function.

double power = Double.parseDouble(PowerTextField.getText());

FeeLabel.setText("The fee is "+Power.Fee(power) + " dollars");

}

});

}

}

class Power{//Class for calculating the fee of power

public static double Fee(double volume){

double fee;//Initial the variable fee.

if(volume\<=50)fee=volume\*0.538; //When the power volume is less than 50

else if(volume\<=200)//When the power volume is less than 200

fee=50\*0.538+(volume-50)\*0.568;

else fee=50\*0.538+150\*0.568+(volume-200)\*0.638;//When the power volume is
more than 200

return fee;

}

}

#### GUI运行实例

![](media/7c12cc29950c7fda731948d6d56ae4ae.png)

![](media/a6a2efa68e3b4d6a67821b5340713df5.png)

# 一张卡片上面写着一个五位数的数字，但是小王不小心把墨水弄到卡片上去了，导致百位和千位上的数字看不清楚，只能看到2\*\*10，小王的爸爸告诉小王这个数能被35和37整除。请设计一个程序帮助小王快速判断这个数具体是多少。

## 概要设计：

### 设计内容：

查找能被35和37整除的五位数2\*\*10。

### 思路

遍历20010-19910间的所有整数，判断是否能被35和37整除，输出可以被整除的数。

### 流程图：

![](media/00b475c4f53f4e7630b2eb7719f6a61e.png)

## 详细设计、调试与分析：

### 程序一：在test4类中，实现对目标五位数的查找。

遍历20010-19910间的所有整数，判断是否能被35和37整除，输出可以被整除的数。

#### 程序代码

public class test4 {

public static void main(String[] args) {

int number = 0;

for(int i=0;i\<100;i++) {//Traverse all integers between 20010 and 29910

number = 20_000 + i\*100 + 10;//Contract the number.

if (number % 35 + number % 37 == 0) {//If the number can be divided by 35 and 37

System.out.println("The number is " + number);//Print the number.

break;//End up the loop.

}

}

}

}

#### Out：

![](media/ea116d0f45fb90f8a5af36fd5de99534.png)

#### 程序评价

循环次数为33次，循环次数可以进一步缩短。

#### 改进思路

只遍历35\*37的倍数，并选择符合条件的五位数进行输出。

### 程序二：test4_1类中，遍历35\*37的倍数，并选择符合条件的五位数进行输出。

#### 程序代码：

public class test4_1 {

public static void main(String[] args) {

int number = 0;

for(;number\<=29910;number+=35\*37) {

//Traverse all integers which can be divided by 37 and 25 between 0 and 29910

if (20010 \<= number && number%100==10) {

//If the number can be divided by 35 and 37

System.out.println("The number is " + number);//Print the number.

break;//End up the loop.

}

}

}

}

#### 程序评价

循环次数减少为18次，循环次数明显减少。

#### Out：

![](media/655fc5d8dd19886327577f4a0f5c067d.png)

# 编写日期类Date，要求成员变量：year，month，day。方法：Date(int y,int m, int d)，构造方法,y、m、d分别表示年月日。void showDate()以“\*\*\*\*年\*\*月\*\*日”形式显示日期。另编写一个类useDate，在其中调用Date类，创建一个Date对象，并输出日期。

## 概要设计

### 内容

编写useDate类，在其中调用Date类，实例化Date对象输出日期。

### 思路

构建Date类，并用一个构造函数Date(int y, int m, int
d)，形参列表为三个int型变量，和一个无参的函数void
showDate()，在main方法中输入日期并调用Date类中的函数。

### 流程图

![](media/b7db6c608d82f29722bf466077b5c0e0.png)

### UML类图

![](media/2b55e46ff8ca2c6cdce1a2d50630aa39.png)

## 详细设计、调试与分析

### 程序一：useDate和Date类

#### UML类图：

![](media/700e1f4b5e7c3f6fa83593ff33b33d14.png)

##### 程序代码：

import java.util.Scanner;

public class useDate {

public static void main(String[] args) {

Scanner input=new Scanner(System.in);

System.out.println("Please in put the year");

int year=input.nextInt();

System.out.println("Please in put the month");

int month=input.nextInt();

System.out.println("Please in put the day");

int day=input.nextInt();

Date date=new Date(year,month,day);

date.showDate();//调用showDate方法显示日期

}

}

class Date{

int y, m, d;

public Date(int y,int m, int d){

this.y=y;

this.m=m;

this.d=d;

}

void showDate(){

System.out.print(y+"年"+m+"月"+d+"日");

}

}

### 程序二：设计GUI，实现日期的输入与输出

#### UML类图：

![](media/2b55e46ff8ca2c6cdce1a2d50630aa39.png)

#### 程序代码：

import javax.swing.\*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class useDateGUI {

private JTextArea textYear;

private JTextArea textMonth;

private JTextArea textDay;

private JPanel Date;

private JPanel useDateJPanel;

private JButton dateButton;

private JLabel DateLabel;

public static void main(String[] args) {

JFrame frame = new JFrame("useDateGUI");

frame.setContentPane(new useDateGUI().useDateJPanel);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.pack();

frame.setVisible(true);

}

public useDateGUI() {

dateButton.addActionListener(new ActionListener() {

@Override

public void actionPerformed(ActionEvent e) {

int year=Integer.parseInt(textYear.getText());//Get the string in the text area
and convert into integer.

int month=Integer.parseInt(textMonth.getText());

int day=Integer.parseInt(textDay.getText());

DateLabel.setText(year+"年"+month+"月"+day+"日");//Output the date in label.

}

});

}

}

class Date\_ {

int y, m, d;

public Date_(int y, int m, int d){

this.y=y;

this.m=m;

this.d=d;

}

void showDate(){

System.out.print(y+"年"+m+"月"+d+"日");

}

String show_Date(){

return y+"年"+m+"月"+d+"日";

}

}

#### 分析与讨论

用IDEA Swing
Designer可以提高GUI设计的效率，可以直接进行可视化设计，设计内容不需要编程实现。

对于多个返回值，适当使用集合的Map方法可以提高函数的效率。

# 编写学生类Student，要求有成员变量：name 代表姓名，String型；sn 代表学号，int型。方法：Student（Sting s1, int n）,构造方法，参数s1表示姓名，n表示学号。void showStu()方法用来显示姓名及学号。另编写一个类useStu，在其中创建一个Student对象，输出其成员变量。

## 概要设计

### 内容

编写学生类Student和useStu类，在其中创建一个Student对象，输出其成员变量。

### 思路

在Student类的构造方法Student(String s1, int
n)中，设置成员变量并用showStu()输出成员变量。在useStu中调用这个类中的方法。

### 流程图

![](media/5d263c1cea30190abb5f170ca5ab6e1c.png)

详细设计、调试与分析：

### UML类图

![](media/24480f0ae56b36ce04affdda5da8355d.png)

## 详细设计、调试与分析

### 程序代码

import java.util.Scanner;

public class useStu {

public static void main(String[] args) {

Scanner input=new Scanner(System.in);

System.out.println("Please in put the name");

String name=input.nextLine();

System.out.println("Please in put the ID");

int ID=input.nextInt();

Student s1=new Student(name,ID);//instantiated object

s1.showStu();//call member method

}

}

class Student{

String student1;//Create the variable of student

int number;

public Student(String s1, int n){

this.student1=s1;

this.number=n;

}

void showStu(){

System.out.println("Name: "+student1+"\\nID: "+number);//print the ID and the
name

}

}

### 分析评价

应选择合适的数据类型，以提高运行速率。

# 编写一个描述圆形的类，运行时任意输入半径可以求的圆的面积。

## 概要设计

### 设计内容

设计一个程序，并在此基础上设计GUI，实现圆的面积的计算。

### 设计思路

接受键盘输入的半径值，用Math包中的Pi和pow方法计算面积值并输出打印。在此基础上用IDEA
Swing Designer设计一个GUI，在test7_GUI()类中实现圆的面积的计算与输出。

### 流程图

![](media/329942188e3bbe0f6d8a220d12e409e7.png)

## 详细设计、调试与分析

### 程序一

#### 程序代码

import java.util.Scanner;

public class test7 {

public static void main(String[] args) {

System.out.println("Please type in the radius of the circle.\\n");

Scanner sc = new Scanner(System.in);//Create Scanner object sc

double r = sc.nextDouble();//Input the radius as double float type.

double Area=Math.PI\*Math.pow(r,2);//S=πr\^2

System.out.println("The area of the circle is: "+Area);

}

}

#### 分析评价

用Math包可以提高运算的准确性。Math包里面有很多数学工具，提高运算的效率。

### 程序二

#### 程序代码

import javax.swing.\*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class test7_GUI {

private JPanel panel1;

private JTextArea textRadius;

private JButton OKButton;

private JLabel Label1;

private JTextArea textArea;

public static void main(String[] args) {

JFrame frame = new JFrame("test7_GUI");

frame.setContentPane(new test7_GUI().panel1);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.pack();

frame.setVisible(true);

}

public test7_GUI() {

OKButton.addActionListener(new ActionListener() {

@Override

public void actionPerformed(ActionEvent e) {

double r=Double.parseDouble(textRadius.getText());

//Get the text and turn into double float.

double Area=Math.PI\*Math.pow(r,2);//S=πr\^2

textArea.setText(String.valueOf(Area));

//Turning double into string and output.

}

});

}

}

#### GUI布局设计

![](media/1f07fe364f22621c270405b00100e961.png)

#### 运行实例

![](media/90c6b233fd1abd7ac05674fc5b474afe.png)

![](media/0eb2dc1e6df9bacf33243e312a0f4121.png)

#### 分析评价

为追求GUI的美观，应该合理布局，并且对数据的显示用合适的文本框或者Label。

# 创建银行账户类SavingAccount，用类变量存储年利率，用私有实例变量存储存款额。提供计算年利息的方法和计算月利息（年利息/12）的方法。编写一个测试程序测试该类，建立SavingAccount的对象saver，存款额是3000，设置年利率是3%，计算并显示saver的存款额、年利息和月利息。

## 概要设计

### 设计内容

编写程序，并设计GUI，计算年利率和月利率。

### 设计思路

编写SavingAccount类，在该类中实现存款金额的输入与利息计算和输出，并在main方法中调用该类。

### 流程图

![](media/9687b7f40be3488d65689c7f758fee27.png)

## 详细设计、调试与分析

### 程序一

#### 程序代码

import java.util.Scanner;

public class test8 {

public static void main(String[] args) {

SavingAccount saver=new SavingAccount();

saver.SavingAccount();

}

}

class SavingAccount {

private double rate=0.03; //Annual interest is 3%

private Double Deposits;//Initial the deposit

public void SavingAccount(){

Scanner input=new Scanner(System.in);

System.out.println("Please input the volume:");

Deposits=input.nextDouble();//Input the deposits.

double interest_year=rate\*Deposits;

double interest_month=rate\*Deposits/12;//calculate the interest

System.out.println("Annual interest is "+interest_year+"\\nMonthly interest is
"+interest_month);

}

}

#### UML类图

![](media/b36bd39ae9eaeeeb0285a189b25e1f64.png)

#### 分析与评价

用集合的接口存储年利息和月利息，提供key（键）到value（值）的映射

### 程序二：用IDEA Swing Designer设计一个GUI实现存款金额的输入与利息计算。

#### 程序代码：

import javax.swing.\*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.HashMap;

import java.util.Map;

public class test8_GUI {

private JTextField DepositArea;

private JButton button1;

private JTextArea AnnualArea;

private JLabel AnnualLabel;

private JLabel MonthlyLabel;

private JTextArea MonthlyArea;

private JPanel sad;

public static void main(String[] args) {

JFrame frame = new JFrame("test8_GUI");

frame.setContentPane(new test8_GUI().sad);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.pack();

frame.setVisible(true);

}

public test8_GUI() {

button1.addActionListener(new ActionListener() {

@Override

public void actionPerformed(ActionEvent e) {

double deposit=Double.parseDouble(DepositArea.getText());

SavingAccount\_ NewCount=new SavingAccount_();//new object

Map\<String, Double\> InterestMap=NewCount.SavingAccount_(deposit);//Call the
method and calculate the interest

AnnualArea.setText(String.valueOf(InterestMap.get("Annual Inerest")));//Out put
the interest

MonthlyArea.setText(String.valueOf(InterestMap.get("Monthly Inerest")));

}

});

}

private void createUIComponents() {

// TODO: place custom component creation code here

}

}

class SavingAccount\_ {

Map\<String, Double\> InterestMap = new HashMap\<String, Double\>();//HashMap
for interest.

private double rate=0.03,deposits; //Annual interest is 3% and initial deposits

public Map\<String, Double\> SavingAccount_(double deposits){

double interest_year=rate\*deposits;

double interest_month=rate\*deposits/12;//calculate the interest

System.out.println("Annual interest is "+interest_year+"\\nMonthly interest is
"+interest_month);

InterestMap.put("Annual Inerest",interest_year);

InterestMap.put("Monthly Inerest",interest_month);

return InterestMap;

}

}

#### GUI设计布局

![](media/af81a8848a9f78eba1dd0591e2a6095f.png)

#### GUI运行实例

![](media/21f37907da76730e075a7d2716dc73b0.png)

![](media/3c2128cce890fcc45f07c95ed8004443.png)

