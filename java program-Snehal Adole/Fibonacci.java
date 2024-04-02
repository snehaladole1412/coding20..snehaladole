import java.util.Scanner;
class Fibonacci
{
int n;
void getdata()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number ");
 n = sc.nextInt();
}

int fibonacci(int n)
{
if (n==0)
return 0;
else if(n==1)
return 1;
else
return fibonacci(n-1)+fibonacci(n-2);
}

}


class Example
{
public static void main(String args[])
{
Fibonacci F =new Fibonacci();
F.getdata();
System.out.println("fibonacci series upto the " +F.n+ " will be: ");
for(int i=0;i<F.n; i++)
{
System.out.println(F.fibonacci(i)+" ");

}
}



}