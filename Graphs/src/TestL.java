//Scott Shuffler
//2-18-15
//TestL.java
//Worked with Devin Sink

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class TestL
{
    //Main for TestL
    //Opens a file and parses the ints contained within and prints
    public static void main(String args[]) throws FileNotFoundException
    {
        File f = new File(args[0]);
        Scanner scanner = new Scanner(f);
        int numVerticies = scanner.nextInt();
        GraphL gl = new GraphL(numVerticies);
        int a;
        while((a = scanner.nextInt()) != -1)
        {
            gl.addEdge(a,scanner.nextInt());
        }
        for (int i = 0; i < numVerticies;i++)
        {
            System.out.print(i + " | ");
            Iterator<Integer> itr = gl.neighbors(i);
            while(itr.hasNext()) {
                System.out.print(itr.next() + " ");
            }
            System.out.println();
        }
    }
}
