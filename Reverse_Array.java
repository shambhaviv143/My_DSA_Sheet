import java.util.Arrays;

public class Reverse_Array 
{
    public static void main(String[] args) 
    {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(solution(arr)));
    }
    
    public static int [] solution(int [] arr)
    {
        if(arr==null)return new int[]{-1};
        
        if(arr.length==0)return new int[]{-1};
        
        int start=0;
        int end=arr.length-1;
        
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
        return arr;
    }
}
