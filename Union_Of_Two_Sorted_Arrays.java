import java.util.Arrays;
import java.util.HashSet;

public class Union_Of_Two_Sorted_Arrays 
{
    public static void main(String [] args)
    {
        int [] arr1={1, 2, 3, 4, 7};
        int [] arr2={1, 2, 5};
        System.out.println(Arrays.toString(solution(arr1,arr2)));
    }
    
    public static int [] solution(int [] arr1, int [] arr2)
    {
    
        HashSet<Integer>set=new HashSet<>();
        
        for(int i=0; i<arr1.length; i++)
        {
            set.add(arr1[i]);
        }
        
        for(int i=0; i<arr2.length; i++)
        {
            set.add(arr2[i]);
        }
        
        int [] arr=new int [set.size()];
        
        int i=0;
        for(int n:set)
        {
            arr[i]=n;
            i++;
        }
        
        return arr;
    }
}
