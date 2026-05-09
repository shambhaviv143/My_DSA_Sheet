public class Find_Missing_Number 
{
    public static void main(String [] args)
    {
        int [] arr={6, 2, 3, 1, 4,};
        System.out.println(solution(arr));
    }
    
    public static int solution(int [] arr)
    {
        int sum=0;
        int correct=0;
        int n=arr.length+1;
        
        for(int i=0; i<arr.length; i++)
        {
            correct=(n*(n+1)/2);
            sum=sum+arr[i];
            
        }
        int result=correct-sum;
        
        return result;
    }
}
