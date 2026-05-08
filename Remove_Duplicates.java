public class Remove_Duplicates 
{
    public static void main(String[] args) 
    {
        int arr[]={1,1,2,3,4,4,5};
        System.out.println(solution(arr));
    }
    
    public static int solution(int [] arr)
    {
        if(arr.length==0) return -1;
        int k=1;
        
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}
