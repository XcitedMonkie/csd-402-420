
/*
    Daniel Fryer
    Mod 4 assignment
    6/20/2026

    So what I learned from running this code is that even having a decent pc the get(index) on a large dataset is really slow. 
    This shows that using an Iterator on a LinkedList is going to be a much faster way to find the data than using a get(index). 
    I originally thought my pc wasn’t doing anything during the 500,000 parts of the code and ended up adding a print out of each iteration just to make sure it was running.
*/

import java.util.Iterator;
import java.util.LinkedList;

public class Fryer_mod4 
{
    // test the Iterator
    public static long testIterator(LinkedList<Integer> list) 
    {

        long sum = 0;
        // set the system nano time 
        long start = System.nanoTime();

        Iterator<Integer> iterator = list.iterator();

        // iteratate over the Linklist
        while (iterator.hasNext()) 
        {
            sum += iterator.next();
        }

        // get the end time to find out how long it took
        long end = System.nanoTime();

        return end - start;
    }

    // Test the get index
    public static long testGetIndex(LinkedList<Integer> list) 
    {

        long sum = 0;
        long start = System.nanoTime();

        for (int i = 0; i < list.size(); i++) 
        {
            sum += list.get(i);

            // uncomment the code below to watch it run
            //System.out.println("Currently on iteration of: " + i);
        }

        long end = System.nanoTime();

        return end - start;
    }

    // Run the test
    public static void runTest(int size) 
    {

        LinkedList<Integer> intNumbers = new LinkedList<>();

        // Fill LinkedList
        for (int i = 0; i < size; i++) 
        {
            intNumbers.add(i);
        }


        // Test list creation
        if (intNumbers.size() == size) 
        {
            System.out.println(size + " integers added successfully");
        }
        else 
        {
            System.out.println("List size test failed");
        }


        // Printouts of the data
        System.out.println("\nStarting the Test of " + size);

        long iteratorTime = testIterator(intNumbers);

        System.out.println("Iterator time in nanoseconds: "
                + iteratorTime);

        long getTime = testGetIndex(intNumbers);

        System.out.println("get(index) time in nanoseconds: "
                + getTime);

        System.out.println("Difference in nanoseconds: "
                + (getTime - iteratorTime));
    }

    public static void main(String[] args) 
    {
        runTest(50000);

        System.err.println("");
        
        runTest(500000);
    }
}
