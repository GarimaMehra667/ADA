package analysis;
import java.util.*;
public class DFS {
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(5);
		for(int i=0;i<5;i++)
		{
			arr.add(new ArrayList<Integer>());
		}
		add(arr,0,1);
		add(arr,0,2);
		add(arr,1,3);
		add(arr,1,4);
		add(arr,2,3);
		add(arr,3,4);
		boolean[] visited = new boolean[5];
		System.out.print("DFS -> ");
		depth(arr,0,visited);		
	}
	
	public static void add(ArrayList<ArrayList<Integer>> arr,int x,int y)
	{
		arr.get(x).add(y);
		arr.get(y).add(x);
	}
	public static void depth(ArrayList<ArrayList<Integer>> arr,int s,boolean[] visited)
	{
		visited[s]=true;
		System.out.print(s + " ");
		for(int i:arr.get(s))
		{
			if(visited[i]==false)
			{
				depth(arr,i,visited);
			}
		}
		
	}

}