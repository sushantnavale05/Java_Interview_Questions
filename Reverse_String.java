//import java.util.*;

public class Reverse_String
{
    public static void main(String [] args)
    {
        String str = "Shravani";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}