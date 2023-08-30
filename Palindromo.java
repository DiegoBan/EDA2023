import java.util.*;

public class Palindromo {
    public static boolean verification(String word)
    {
        int first = 0;
        int last = word.length()-1;
        while(first < last)
        {
            if(word.charAt(first) != word.charAt(last))
            {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        boolean ver = verification(word);
        System.out.println(ver);
        scan.close();
    }
}
