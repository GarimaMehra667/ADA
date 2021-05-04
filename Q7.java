
package analysis;

public class Q7 {
    private void com(String s, int l, int r)
    {
        if (l == r)
            System.out.println(s);
        else
        {
            for (int i = l; i <= r; i++)
            {
                s = swap(s,l,i);
                com(s, l+1, r);
                s = swap(s,l,i);
            }
        }
    }
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args)
    {
        String s = "ABCDEFGHIJ";
        int n = s.length(); 
        Q7 p = new Q7();
        p.com(s, 0, n-1);
    }
 
}
 

