import java.util.HashSet;

public class Find_Duplicate 
{
    public static void main(String[] args) 
{

        int[] arr = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(arr));
}
    public static int findDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {

            if(set.contains(num)) {
                return num;
            }

            set.add(num);
        }

        return -1;
    }
}
