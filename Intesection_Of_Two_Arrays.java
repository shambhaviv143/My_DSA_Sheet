import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intesection_Of_Two_Arrays 
{
    public static void main(String[] args) 
    {
        int [] arr1={1,2,3,4};
        int [] arr2={3,4,5,6};
        System.out.println(solution(arr1,arr2));
    }
    
    public static List<Integer> solution(int [] arr1, int[] arr2)
    {
        List<Integer>list= new ArrayList<>();
        
        HashSet<Integer>set=new HashSet<>();
        
        for(int n:arr1)
        {
            set.add(n);
        }
        
        for(int n:arr2)
        {
            if(set.contains(n) && !list.contains(n))
            {
                list.add(n);
            }
        }
        return list;
    }
}
