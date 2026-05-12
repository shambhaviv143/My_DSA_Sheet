import java.util.Arrays;

public class Min_Max 
{
    public static void main(String[] args) 
    {
        int [] arr={2,6,1,9,8};
        System.out.println(Arrays.toString(solution(arr)));
    }
    
    public static int [] solution(int [] arr)
    {
       if(arr==null)return new int[]{-1,-1};
       
       if(arr.length==0)return new int[]{-1,-1};
       
       int min=arr[0];
       int max=arr[0];
       
       for(int i=1; i<arr.length; i++)
       {
           if(arr[i]<min)
           {
               min=arr[i];
           }
           
           if(arr[i]>max)
           {
               max=arr[i];
           }
       }
       return new int[]{min,max};
    }
}
