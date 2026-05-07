public class Largest_Element 
{
    public static void main(String[] args) 
    {
        int arr[]={1,7,4,8,3};
        System.out.println(solution(arr));
    }
    
    public static int solution(int [] arr)
    {
        int max=arr[0];
        
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
