public class Secmax 
{
    public static void main(String[] args) 
    {
        int arr[]={-1,-2,-3,-9,-8};
        System.out.println(solution(arr));
    }
    
    public static int solution(int [] arr)
    {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
       
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax && arr[i]!=max)
            {
                secmax=arr[i];
            }
        }
        if(max==secmax)return -1;
        return secmax;

    }
}
