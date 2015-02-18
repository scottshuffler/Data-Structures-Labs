import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class GraphL {
	public int order;

	public GraphL(int numVertices)
	{
		order = numVertices;
		
		for (int i = 0; i < numVertices; i++)
		{
			String name = ("" + i);
			LinkedList jj = new LinkedList();
		}
		
		//Creates a graph with numVertices vertices and no edges
		//(Create n empty linked lists)
	}
	
	public int order()
	{
		//returns the number of vertices in the graph
		return order;
	}
	
	public int size()
	{
		//Returns the number of edges in the graph
		return 0;
	}
	
	public Iterator<Integer> neighbors(int i)
	{
		return null;
		//Returns an Iterator to the linked list of neighbors of vertex i
	}
	
	public void addEdge(int i, int j)
	{
		//adds an edge between i and j (and j and i)
	}
	
}
