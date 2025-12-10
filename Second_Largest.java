public class Second_Largest 
{
    public static void main(String []args)
    {
        int arr[] = {34, 67, 23, 89, 2, 90, 21};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int n : arr)
        {
            if(n > firstLargest)
            {
                secondLargest = firstLargest;
                firstLargest = n;
            }
            else if( n > secondLargest && n!= firstLargest)
            {
                secondLargest = n;
            }
        }
        System.out.println("Second Largest element is: " + secondLargest);
    }
    
}
