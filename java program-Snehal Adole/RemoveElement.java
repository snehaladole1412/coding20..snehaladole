import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates 
{
public static void main(String[] args) 
{
int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 3};
        
System.out.println("Original Array:");
printArray(array);
        
int[] uniqueArray = removeDuplicates(array);
        
System.out.println("\nArray after removing duplicates:");
printArray(uniqueArray);
}
 
public static int[] removeDuplicates(int[] arr) 
{
Set<Integer> set = new HashSet<>();
for (int num : arr) 
{
set.add(num);
}
        
int[] uniqueArray = new int[set.size()];
int index = 0;
for (int num : set) 
{
uniqueArray[index++] = num;
}
return uniqueArray;
}
    
public static void printArray(int[] arr) 
{
for (int num : arr) 
{
System.out.print(num + " ");
}
}
}
