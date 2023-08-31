import java.util.*;

public class CadenaString {
    public static String consecutive(String string)
    {
        int max = 0;    //largo maximo
        int currentL = 1;
        char current = string.charAt(0);
        int sIndex = 0;
        int maxsIndex = 0;  //largo maximo encontrado
        for(int i = 1 ; i < string.length() ; i++)
        {
            if(string.charAt(i) == current)
            {
                currentL++;
                if(currentL > max)
                {
                    max = currentL;
                    maxsIndex = sIndex;
                }
            }
            else
            {
                current = string.charAt(i);
                sIndex = i;
                currentL = 1;
            }
        }
        return string.substring(maxsIndex, maxsIndex+max);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        System.out.println(consecutive(string));
        scan.close();
    }
}