import java.util.Scanner;

class NumberPalindrom {
int n;
int reverseNum;

void getdata() 
{
reverseNum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any Number: ");
n = sc.nextInt();
int temp = n;
while (temp != 0) {
int digit = temp % 10;
reverseNum = reverseNum * 10 + digit;
temp = temp / 10;
}

}

void PalindromNum()
{
if (n == reverseNum) 
{
System.out.println("Given number " + n + " is a palindrome.");
}
else 
{
System.out.println("Given number " + n + " is not a palindrome.");
}
}
}

class Example 
{
    public static void main(String args[]) 
{
        NumberPalindrom r = new NumberPalindrom();
        r.getdata();
        r.PalindromNum();
}
}
