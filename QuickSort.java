package analysis;

import java.util.Random;

public class QuickSort {
	static int count=0;
	public static void main(String[] args) {  
       
		
		Random rand = new Random();
		int[] arr1=new int[1000];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=rand.nextInt(100);
		}
		int l=0;
		int h1=arr1.length-1;

		int[] arr2=new int[1000];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=i+1000;
		}
		int[] arr3=new int[1000];
		int j=0;
		for(int i=arr3.length;i>0;i--)
		{
			arr3[j]=i+1000;
			j++;
		}
		int h2=arr2.length-1;
		int h3=arr3.length-1;
		int[] arr4=new int[1000];
		for(int i=0;i<arr2.length;i++)
		{
			arr4[i]=1;
		}
		int h4=arr4.length-1;


		long start = System.currentTimeMillis(); 
		count=0;
		quickSort(arr1,l,h1);
		System.out.println(count);
	    long end = System.currentTimeMillis(); 
	    System.out.println("QuickSort takes " + 
	                                (end - start) + "ms for random numbers"); 
	    
		long start1 = System.currentTimeMillis(); 
		count=0;
		quickSort(arr2,l,h2);
		System.out.println(count);
	    long end1 = System.currentTimeMillis(); 
	    System.out.println("QuickSort takes " + 
	                                (end1 - start1) + "ms for array in ascending order"); 
		long start2 = System.currentTimeMillis(); 
		count=0;
		quickSort(arr3,l,h3);
		System.out.println(count);
	    long end2 = System.currentTimeMillis(); 
	    System.out.println("QuickSort takes " + 
	                                (end2 - start2) + "ms for array in descending order"); 
		long start3 = System.currentTimeMillis(); 
		count=0;
		quickSort(arr4,l,h4);
		System.out.println(count);
	    long end3 = System.currentTimeMillis(); 
	    System.out.println("QuickSort takes " + 
	                                (end3 - start3) + "ms for same numbers"); 
		
    }  
    static void quickSort(int a[], int beg, int end)  
    {  
    	count++;
        int loc;  
        if(beg<end)  
        {  
            loc = partition(a, beg, end);  
            quickSort(a, beg, loc-1);  
            quickSort(a, loc+1, end);  
        }  
        
    } 
    public static int partition(int a[], int beg, int end)  
    {  
        int left, right, temp, loc, flag;     
        loc = left = beg;  
        right = end;  
        flag = 0;  
        while(flag != 1)  
        {  
            while((a[loc] <= a[right]) && (loc!=right))  
            right--;  
            if(loc==right)  
            flag =1;  
            else if(a[loc]>a[right])  
            {  
                temp = a[loc];  
                a[loc] = a[right];  
                a[right] = temp;  
                loc = right;  
            }  
            if(flag!=1)  
            {  
                while((a[loc] >= a[left]) && (loc!=left))  
                left++;  
                if(loc==left)  
                flag =1;  
                else if(a[loc] <a[left])  
                {  
                    temp = a[loc];  
                    a[loc] = a[left];  
                    a[left] = temp;  
                    loc = left;  
                }  
            }  
        }  
        return loc;  
    }   

}
