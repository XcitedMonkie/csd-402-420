
/*
    Daniel Fryer
    Assignment 5.2
    6/26/2026
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


public class Fryer_Assignment5
{
    public static void main(String[] args) 
    {
        // Trying out the TreeSet to remove the duplicates. Also creating an Array list to show the original list with all the words.
        TreeSet<String> ts = new TreeSet<>();
        ArrayList<String> al = new ArrayList();
        
        // Trying to open the file and save the words in the txt file
        try
        {
            // Originally was looking for the file in my main directory. You may need to adjust this to the path your putting the collection.
            File wordFile = new File("CSD-420 Advanced Java/module-5/collection_of_words.txt");
            System.out.println(wordFile.getAbsolutePath());
            Scanner scan = new Scanner(wordFile);
            System.out.println("Reading from: " + wordFile.getAbsolutePath());

            while(scan.hasNext())
            {
                String nextWord = scan.next();

                ts.add(nextWord);
                al.add(nextWord);
            }

            scan.close();
        }
        // Catch if the file isn't found and where to save the file to get it to run
        catch(FileNotFoundException ex)
        {
            System.err.println("ERROR: Couldn't find the file collection_of_words.txt. You may need to edit the code to match the path of the file or match the path of CSD-420 Advanced Java/module-5/collection_of_words.txt.");
        }
        catch(Exception ex)
        {
            System.err.println("ERROR: An unexpected error happened.");
        }

        // Print the original list
        System.out.println("Original list without removing any items:");
        for(String word : al)
        {
            System.out.println(word);
        }

        // Print the List that has all duplicates removed.
        System.out.println("");
        System.out.println("List in ascending Order and duplicates not included: ");

        for(String word : ts)
        {
            System.out.println(word);
        }

        // now in decending order
        System.out.println("");
        System.out.println("List in descending Order and duplicates not included: ");

        for(String word : ts.descendingSet())
        {
            System.out.println(word);
        }

        System.out.println("");
        System.out.println("");

        // Call the method to play with some of the TreeSet methods
        Tests(ts);
    }

    public static void Tests(TreeSet<String> words)
    {
        System.out.println("Trying out the TreeSet methods");

        String floor = words.floor("pen");
        String last = words.last();
        Integer size = words.size();

        if(floor != null)
        {
            System.out.println("Testing Floor searching on pen: " + floor);
        }

        if(last != null)
        {
            System.out.println("Testing Last: " + last);
        }

        System.out.println("Testing Size: " + size);


        System.out.println("Using subset from Desk to Mouse");
        for(String word : words.subSet("desk", "mouse"))
        {
            System.out.println(word);
        }
    }
}