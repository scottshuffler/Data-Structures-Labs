import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class GraphL {
	public int order;
	ArrayList<LinkedList<Integer>> list;

	public GraphL(int numVertices)
	{
		order = numVertices;
		list = new ArrayList<LinkedList<Integer>>();
		for (int i = 0; i < numVertices; i++){
		    
		    list.add(new LinkedList<Integer>());
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
		int count = 0;
		
		for (int i = 0; i < order;i++)
		{
		    count += list.get(i).size();
		}
	    count = count / 2;
	    return count;
	}
	
	public Iterator<Integer> neighbors(int i)
	{
	    return list.get(i).iterator();
		//Returns an Iterator to the linked list of neighbors of vertex 
	}
	
	public void addEdge(int i, int j)
	{
		list.get(i).add(j);
		list.get(j).add(i);
	}
	
}
