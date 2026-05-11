import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum_Problem 
{
    public static void main(String[] args) 
    {
        int [] arr={1, 6, 2, 10, 3};
        int target=7;
        System.out.println(Arrays.toString(solution(arr,target)));
    }
    
    public static int [] solution(int [] arr, int target)
    {
        if(arr.length==0)return new int[]{-1,-1};
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
        {
            int result=target-arr[i];
            
            if(map.containsKey(result))
            {
                return new int[]{map.get(result),i};
            }
            
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
