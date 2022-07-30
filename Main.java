
public class Main
{
	public static void main(String[] args) {
		
    	String str1 = "ABACD";
        String str2 = "CDABA";
		char arr1[] = (str1+str1).toCharArray();
		char arr2[] = str2.toCharArray();
		
		int n = arr1.length;
		int m = arr2.length;
		
		int i = 0;
		int j = m-1;
		while(j<n)
		{
		    int t = 0;
		    for(int p=i;p<=j;p++)
		    {
		        if(arr1[p]!=arr2[t])
		        {
		            break;
		        }
		        
		        if(t==m-1)
		        {
		            System.out.println(true);
		            return;
		        }
		        t++;
		    }
		    i++;j++;
		}
	System.out.println(false);
	
		
	}
}
