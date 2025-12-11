import java.util.*;

public class Two_Sum_Problem 
{
    public static void main(String[] args) 
    {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) 
            {
            int diff = target - arr[i];

            if (map.containsKey(diff)) 
            {
                System.out.println(map.get(diff) + " " + i);
                return;
            }

            map.put(arr[i], i);
        }
    }
}
