import java.util.Queue;
import java.util.LinkedList;

public class Mezcla {
    public static Queue<Integer> mix(Queue<Integer> L1 , Queue<Integer> L2)
    {
        Queue<Integer> mix = new LinkedList<>();
        while(!L1.isEmpty() && !L2.isEmpty())
        {
            if(L1.peek() <= L2.peek())
            {
                mix.offer(L1.poll());
            }
            else
            {
                mix.offer(L2.poll());
            }
        }
        if(!L1.isEmpty())
        {
            while(!L1.isEmpty())
            {
                mix.offer(L1.poll());
            }
        }
        else
        {
            while(!L2.isEmpty())
            {
                mix.offer(L2.poll());
            }
        }
        return mix;
    }
    public static void main(String[] args)
    {
        //inicializacion de Colas
        Queue<Integer> L1 = new LinkedList<>();
        Queue<Integer> L2 = new LinkedList<>();
        //ingreso datos
        L1.offer(3);
        L1.offer(5);
        L1.offer(8);
        L1.offer(18);
        L1.offer(25);
        L1.offer(40);
        L2.offer(1);
        L2.offer(4);
        L2.offer(7);
        L2.offer(30);
        L2.offer(39);
        L2.offer(49);
        //llamado a la funcion
        Queue<Integer> mix = mix(L1, L2);
        while(!mix.isEmpty())
        {
            System.out.println(mix.poll());
        }
    }
}