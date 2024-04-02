import java.util.HashSet;
import java.util.Set;

public class CommonElements 
{
public static void main(String[] args) 
{
int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {4, 5, 6, 7, 8};
        
System.out.println("Array 1:");
printArray(array1);
        
System.out.println("\nArray 2:");
printArray(array2);
        
System.out.println("\nCommon Elements:");
findCommonElements(array1, array2);
}
 
public static void findCommonElements(int[] arr1, int[] arr2) 
{
Set<Integer> set1 = new HashSet<>();
 for (int num : arr1) 
{
 set1.add(num);
}
        
 Set<Integer> commonSet = new HashSet<>();
for (int num : arr2) 
{
if (set1.contains(num)) 
{
commonSet.add(num);
}
}
        
for (int commonNum : commonSet) 
{
System.out.print(commonNum + " ");
}
}
    
public static void printArray(int[] arr) 
{
for (int num : arr) 
{
System.out.print(num + " ");
}
}
}
