public class Secmax 
{
    public static void main(String[] args) 
    {
        int arr[]={1,3,8,3,9};
        System.out.println(solution(arr));
    }
    
    public static int solution(int [] arr)
    {
        int max=0;
        
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        
        int secmax=0;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>secmax && arr[i]!=max)
            {
                secmax=arr[i];
            }
        }
        
        return secmax;
    }
}
