import java.util.ArrayList;
import java.util.List;

public class Subarray_With_Given_Sum 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        System.out.println(solution(arr, target));
    }

    public static List<Integer> solution(int[] arr, int target)
    {
        List<Integer> list = new ArrayList<>();

        
        if(arr.length == 0)
        {
            return list;
        }

        int start = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];

           
            while(sum > target && start <= i)
            {
                sum = sum - arr[start];
                start++;
            }

            
            if(sum == target)
            {
                for(int j = start; j <= i; j++)
                {
                    list.add(arr[j]);
                }

                return list;
            }
        }

        return list;
    }
}
