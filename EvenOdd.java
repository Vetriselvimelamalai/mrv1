import java.util.*;
class EvenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any integer no:");
int num=sc.nextInt();
if(num%2 == 0)
{
System.out.println(num+"is even no");
}
else
{
System.out.println(num+"is odd no");
}
}
}
