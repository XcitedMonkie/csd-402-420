import java.util.ArrayList;
import java.util.Random;

public class Fryer_mod3 
{
    // Overload so If user doesn't pass a number it will default to 50 as I couldn't set the int size 
    public static ArrayList<Integer> setArray()
    {
        return setArray(50);
    }

    // Method to set the array values
    public static ArrayList<Integer> setArray(int size)
    {
        ArrayList<Integer> returnable = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < size; i++)
        {
            returnable.add(rand.nextInt(20) + 1);
        }  

        return returnable;
    }

    // Method to remove duplicate values from the original list
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> newList = new ArrayList<>();

        for(E item : list)
        {
            if(!newList.contains(item))
            {
                newList.add(item);
            }
        }

        return newList;
    }

    public static void main(String[] args) 
    {
        // Set the array this one is passed with no value so it will be set to the default 50
        ArrayList<Integer> originalArray = setArray();
    
        // Print out of the original list
        System.out.println("Original List");
        System.out.print(originalArray);
    
        // Pass the original array and remove duplicate values
        ArrayList<Integer> removedDupes = removeDuplicates(originalArray);

        // Print out the array with duplicates removed
        System.out.println("Array with duplicates removed");
        System.out.println(removedDupes);
    }
}
