

public class GraphM {
    public int order;
    int [][] matrix;
    
    
	public GraphM(int n)
	{
		//Creates a graph with n vertices and no edges
		//(create an n by n two-dimensional,  array of int (or more complex) )
	    order = n;
	    matrix = new int[n][n];  
	}
	
	public int order()
	{
		//Returns the number of vertices in the graph
		return order;
	}
	
	public int size()
	{
		//Returns the number of edges in the graph
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
	
	public boolean isEdge(int i, int j)
	{
		//Returns whether or not there is an edge between i and j
		//or you can return an int weight
		if(matrix[i][j] == 1)
		{
		    return true;
		}
		else
		{
		    return false;
		}
	}
	
	public void addEdge(int i, int j)
	{
		//adds an edge between i and j (and j and i, if you wish)
		// you may overload this method to have three parameters,
		// the third being an edge weight
	    matrix[i][j] = 1;
	    matrix[j][i] = 1;
	}
}
