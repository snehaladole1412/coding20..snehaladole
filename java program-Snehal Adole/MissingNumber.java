import java.util.HashSet;
import java.util.Set;

public class MissingNumber 
{
public static void main(String[] args) 
{
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        
System.out.println("Original Array:");
printArray(array);
        
int missingNumber = findMissingNumber(array);
        
System.out.println("\nMissing Number: " + missingNumber);
}
 
public static int findMissingNumber(int[] arr) 
{
Set<Integer> set = new HashSet<>();
for (int num : arr) 
{
set.add(num);
}
        
int n = arr.length + 1; 
for (int i = 1; i <= n; i++) 
{
if (!set.contains(i)) 
{
return i;
}
}
        
return -1;
}
    
public static void printArray(int[] arr) 
{
for (int num : arr) 
{
System.out.print(num + " ");
 }
 }
 }
