
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

/*
    Daniel Fryer
    Mod 2 write program 
    6/12/2026
*/

public class Fryer_mod2Write_CSD420 
{

    // get the 5 random ints
    public static int[] RandomInt()
    {
        Random rand = new Random();

        int[] setArray = new int[5];

        for(int i = 0; i < 5; i++)
        {
            setArray[i] = rand.nextInt(100);
        }

        return setArray;
    }

    // get the 5 random doubles
    public static double[] RandomDouble()
    {
        Random rand = new Random();

        double[] setArray = new double[5];

        for(int i = 0; i < 5; i++)
        {
            setArray[i] = rand.nextDouble() * 100;
        }

        return setArray;
    }
    public static void main(String[] args) 
    {       
        // create the arrays can call the methods to set them
        int [] intArray = RandomInt();
        double[] doubleArray = RandomDouble();

        // try and write the file and store the ints and doubles
        try {
            FileWriter writers = new FileWriter("FryerDataFile.dat", true);
            PrintWriter outputs = new PrintWriter(writers);

            outputs.println("Integers:");

            for (int e : intArray)
            {
                outputs.println(e);
            }
            outputs.println();
            outputs.println("Doubles:");

            for (double d : doubleArray) 
            {
                outputs.println(d);
            }
            
            // Keep forgetting to do this couldn't figure out for a while why my data file wasn't saved. 
            outputs.close();

        } 
        catch (Exception e) 
        {
            System.err.println("There was an error writing file");
        }
    }
}

