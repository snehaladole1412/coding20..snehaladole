import java.util.Scanner;
class ReverseNum
{
int reverseNum;
void getdata()
{
reverseNum=0;
Scanner sc=new Scanner (System.in);
System.out.println("Enter any Number ,which you want in a reverse form ");
int n= sc.nextInt();
while(n!=0)
{
	int digit=n%10;
	reverseNum= reverseNum*10+digit;
	n=n/10;

	
}

}
void display()
{
System.out.println("Reverse of a given number is= "+ reverseNum);


}

}
class Example
{
public static void main (String args[])
{
ReverseNum r = new ReverseNum();
r.getdata();
r.display();



}




}
