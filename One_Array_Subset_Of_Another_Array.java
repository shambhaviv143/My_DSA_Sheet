import java.util.HashSet;

public class One_Array_Subset_Of_Another_Array 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,5};
        System.out.println(solution(arr1,arr2));
    }
    
    public static boolean solution(int [] arr1, int [] arr2)
    {
        HashSet<Integer>set=new HashSet<>();
        
        for(int n:arr1)
        {
            set.add(n);
        }
        
        for(int n:arr2)
        {
            if(!set.contains(n))
            {
                return false;
            }
        }
        return true;
    }
}
