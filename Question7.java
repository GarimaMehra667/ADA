package analysis;
import java.util.*;
public class Question7 {
static void differentFlagPermutations(int e, String[] a)
{
	String[] s= a;
	for(int i = 0; i < s.length; i++)
	{
		System.out.print(s[i] + " ");
	}
	int count = s.length;
	for(int j = 0; j < e - 1; j++)
	{
		Vector<String> tmp = new Vector<String>();
		for(int i = 0; i < a.length; i++)
		{
			for(int k = 0; k < s.length; k++)
			{
				if (a[i] != s[k])
				{
					tmp.add(s[k] + a[i]);
					count += 1;
				}
			}
		}	
		for(int i = 0; i < tmp.size(); i++)
		{
			System.out.print(tmp.get(i) + " ");
		}
		s= tmp.toArray(new String[tmp.size()]);;
	}
}

public static void main(String[] args)
{
	String []a = { "a","b","c","d","e","f","g","h","i","j"};
	int e=9;	
	differentFlagPermutations(e,a);
}
}




