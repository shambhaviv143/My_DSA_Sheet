import java.util.Arrays;

public class Sort_An_Array_0s_1s_2s 
{
    public static void main(String[] args) 
    {
        int [] arr={2,1,0,1,1,2,0,0,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
    
    public static int [] solution(int [] arr)
    {
        if(arr==null || arr.length==0)return new int[]{-1};
        
        int low=0;
        int mid=0;
        int high=arr.length-1;
        
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                
                high--;
            }
        }
        return arr;
    }
}
