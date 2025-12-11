public class Max_Subarray_Sum 
{
    public static void main(String[] args)
    {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int max = arr[0];
        int sum = 0;

        for(int n : arr)
        {
            sum += n;

            max = Math.max(max, sum);
            if(max < 0)
                sum = 0;
        }
        System.out.println("Maximum subarray sum is : " + max);
    }
}
