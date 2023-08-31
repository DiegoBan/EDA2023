import java.util.*;

public class Jugador {
    public static boolean binarysearch(int[] arr, int target)
    {
        int L = 0; int R = arr.length-1;
        while(L < R)
        {
            int mid = (L + R)/2;
            if(arr[mid] == target)
            {
                return true;
            }
            else if(arr[mid] < target)
            {
                L = mid+1;
            }
            else
            {
                R = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        System.out.println(binarysearch(arr, target));
        scan.close();
    }
}
