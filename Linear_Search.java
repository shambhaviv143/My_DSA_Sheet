public class Linear_Search 
{
    public static void main(String [] args)
    {
        int arr[]={2, 3, 4, 5, 3};
        int target=4;
        System.out.println(solution(arr,target));
    }
    
    public static int solution(int [] arr, int target)
    {
        if(arr.length==0)return -1;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
