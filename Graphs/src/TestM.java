//Scott Shuffler
//2-18-15
//TestM.java
//Worked with Devin Sink

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestM
{
    //Main for TestM
    //Opens a file and parses the ints contained within and prints
    public static void main(String args[]) throws FileNotFoundException
    {
        File f = new File(args[0]);
        Scanner scanner = new Scanner(f);
        int numVertices = scanner.nextInt();
        GraphM gm = new GraphM(numVertices);
        int a;
        while((a = scanner.nextInt()) != -1)
        {
            gm.addEdge(a,scanner.nextInt());
        }
        //Prints the square matrix out
        //Prints * if there is an edge
        //Otherwise just space
        for (int i = 0; i < numVertices; i++)
        {
            for (int j = 0; j < numVertices; j++)
            {
                if (gm.isEdge(i,j) == true)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
