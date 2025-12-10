public class Zeros_to_End 
{
    public static void main(String [] args)
        {
            int[] arr = {2, 5, 0, 4, 7, 0, 1, 23, 34, 0};
            int index = 0;

            for(int n : arr)
            
                if( n != 0)
        
                    arr[index++] = n;
                
                
                while (index < arr.length) 
                
                    arr[index++] = 0;    
                
                for(int i : arr)
                
                    System.out.println(i + " ");
                
            
        }
    
    
}
