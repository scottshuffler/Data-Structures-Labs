//Scott Shuffler
//2-18-15
//GraphL.java
//Worked with Devin Sink

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class GraphL {
	public int order;
	ArrayList<LinkedList<Integer>> list;

	//Creates a graph with numVertices vertices and no edges
	public GraphL(int numVertices)
	{
		order = numVertices;
		list = new ArrayList<LinkedList<Integer>>();
		for (int i = 0; i < numVertices; i++){
		    
		    list.add(new LinkedList<Integer>());
		}
	}
	
	//returns the number of vertices in the graph
	public int order()
	{
		return order;
	}
	
	//Returns the number of edges in the graph
	public int size()
	{
		int count = 0;
		
		for (int i = 0; i < order;i++)
		{
		    count += list.get(i).size();
		}
	    count = count / 2;
	    return count;
	}
	
	//Returns an Iterator to the linked list of neighbors of vertex 
	public Iterator<Integer> neighbors(int i)
	{
	    return list.get(i).iterator();
		
	}
	
	//Adds an edge between i and j
	public void addEdge(int i, int j)
	{
		list.get(i).add(j);
		list.get(j).add(i);
	}
	
}
