import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class TestL
{
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
