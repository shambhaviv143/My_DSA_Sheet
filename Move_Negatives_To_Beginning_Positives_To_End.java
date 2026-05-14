import java.util.Arrays;

public class Move_Negatives_To_Beginning_Positives_To_End 
{
    public static void main(String[] args) 
    {
        int [] arr={2, -4, 7, -1, 0, -8, 5, -3};
        System.out.println(Arrays.toString(solution(arr)));
    }
    
    public static int [] solution(int [] arr)
    {
        if(arr==null || arr.length==0)return arr;
        int start=0;
        int end=arr.length-1;
        
        while(start<end)
        {
            if(arr[start]<0)
            {
                start++;
            }
            
            else if(arr[end]>=0)
            {
                end--;
            }
            
            else
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                
                start++;
                end--;
            }
        }
        return arr;
    }
}
