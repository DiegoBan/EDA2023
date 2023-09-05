import java.util.*;

public class binarysearch {
    public static boolean iterativesearch(int[] arr , int target)
    {
        int L = 0; int R = arr.length-1;
        while(L <= R)
        {
            int mid = L + (R-L) /2;
            if(arr[mid] == target)
            {
                return true;
            }
            else if(arr[mid] > target)
            {
                R = mid-1;
            }
            else
            {
                L = mid+1;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tamaño arreglo: ");
        int[] arr = new int[scan.nextInt()];
        System.out.print("Ingresa numero buscado: ");
        int target = scan.nextInt();
        System.out.println("Arreglo de " + arr.length + " numeros: ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println(iterativesearch(arr, target));
        scan.close();
    }
}
