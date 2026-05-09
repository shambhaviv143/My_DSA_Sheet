import java.util.Arrays;

public class Move_Zeros 
{
    public static void main(String[] args) 
    {
        int arr[]={0,2,3,4,1,0,8};
        System.out.println(Arrays.toString(solution(arr)));
    }
    
    public static int [] solution(int [] arr)
    {
        if(arr.length==0)return new int[0];
        if(arr.length==1)return arr;
        
        int j=0;
        
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                j++;
            }
            
        }
        return arr;
    }
}
