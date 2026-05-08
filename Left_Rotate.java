import java.util.Arrays;

public class Left_Rotate 
{
    public static void main(String [] args)
    {
        int [] arr={1,2,3,4,5};
        int k=2;
        solution(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void solution(int [] arr, int k)
    {
        if(arr==null || arr.length==0 || k==0)return ;
        
        int n=arr.length;
        k=k%n;
        
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    
    public static void reverse(int [] arr, int start, int end)
    {
        
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
    }
}
