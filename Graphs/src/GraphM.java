//Scott Shuffler
//2-18-15
//GraphM.java
//Worked with Devin Sink

public class GraphM {
    public int order;
    int [][] matrix;
    
    //Create a nxn matrix with no edges
	public GraphM(int n)
	{
	    order = n;
	    matrix = new int[n][n];  
	}
	
	//Return the number of vertices 
	public int order()
	{
		return order;
	}
	
	//Returns the number of edges in the graph
	public int size()
	{
	    int count = 0;
	    for(int i = 0; i < matrix.length; i++)
	    {
	        for(int j = 0; j < matrix[i].length; j++)
	        {
	            count++;
	        }
	    }
		return count / 2;
	}
	
	//Returns wether or not there is an edge between i and j
	public boolean isEdge(int i, int j)
	{
		if(matrix[i][j] == 1)
		{
		    return true;
		}
		else
		{
		    return false;
		}
	}
	
	//adds an edge between i and j 
	public void addEdge(int i, int j)
	{
	    matrix[i][j] = 1;
	    matrix[j][i] = 1;
	}
}
