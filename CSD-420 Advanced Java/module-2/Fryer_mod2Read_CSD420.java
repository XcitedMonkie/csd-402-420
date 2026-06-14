/*
    Daniel Fryer
    Mod 2 read program 
    6/12/2026
*/
import java.io.File;
import java.util.Scanner;

public class Fryer_mod2Read_CSD420 
{
    public static void main(String[] args) 
    {
        // try and open the file and print out the data.
        try
        {
            File reader = new File("FryerDataFile.dat");
            Scanner fileData = new Scanner(reader);

            while(fileData.hasNextLine())
            {
                System.out.println(fileData.nextLine());
            }

            fileData.close();
        }
        catch (Exception e) 
        {
            System.err.println("Couldn't read from file.");
        }
    }
}
