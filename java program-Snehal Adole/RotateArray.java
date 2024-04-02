public class RotateArray 
{
public static void main(String[] args) 
{
int[] array = {1, 2, 3, 4, 5};
        
System.out.println("Original Array:");
printArray(array);
        
rotateLeft(array);
        
System.out.println("\nArray after rotating left by 1 position:");
printArray(array);
}
 
public static void rotateLeft(int[] arr) 
{
int firstElement = arr[0];
for (int i = 0; i < arr.length - 1; i++) 
{
arr[i] = arr[i + 1];
}
arr[arr.length - 1] = firstElement;
}
public static void printArray(int[] arr) 
{
for (int num : arr) 
{
System.out.print(num + " ");
 }
 }
}
