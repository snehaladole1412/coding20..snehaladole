import java.util.HashSet;
import java.util.Set;

public class EvenOddCount 
{
public static void main(String[] args) 
{
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
System.out.println("Original Array:");
printArray(array);
        
int[] counts = countEvenOdd(array);
        
System.out.println("\nEven Count: " + counts[0]);
System.out.println("Odd Count: " + counts[1]);
}
 
public static int[] countEvenOdd(int[] arr) 
{
int evenCount = 0;
int oddCount = 0;
        
for (int num : arr) 
{
if (num % 2 == 0) 
{
evenCount++;
} 
else 
{
oddCount++;
}
}
        
int[] counts = {evenCount, oddCount};
return counts;
}
    
public static void printArray(int[] arr) 
{
for (int num : arr) 
{
System.out.print(num + " ");
}
}
}
