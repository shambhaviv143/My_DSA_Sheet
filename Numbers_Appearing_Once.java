public class Numbers_Appearing_Once 
{
    public static void main(String [] args)
    {
        int [] arr={1, 2, 2, 4, 3, 1, 4};
        System.out.println(solution(arr));
    }
    
    public static int solution(int [] arr)
    {
        if(arr.length==0)return -1;
        
        int result=0;
        for(int i=0; i<arr.length; i++)
        {
            result=result^arr[i];
        }
        return result;
    }
}
