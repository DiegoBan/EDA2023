public class LinkedList{
    LinkedListNode head;
    public class LinkedListNode
    {
        int value;
        LinkedListNode next;
        LinkedListNode(int x)
        {
            this.value = x;
            this.next = null;
        }
        LinkedListNode(int x, LinkedListNode next)
        {
            this.value = x;
            this.next = next;
        }
    }
    
    public void InsertFirst(int x)
    {
        if(this.head == null)
        {
            this.head = new LinkedListNode(x);
            return;
        }
        LinkedListNode aux = new LinkedListNode(x, this.head);
        this.head = aux;
    }
    public void InsertLast(int x)
    {
        LinkedListNode aux = head;
        while(aux.next != null)
        {
            aux = aux.next;
        }
        aux.next = new LinkedListNode(x);
    }
    public boolean Search(int target)
    {
        LinkedListNode aux = this.head;
        while(aux != null)
        {
            if(aux.value == target)
            {
                return true;
            }
            aux = aux.next;
        }
        return false;
    }
    public void DeleteAtFirst()
    {
        if(this.head == null)
        {
            return;
        }
        this.head = this.head.next;
    }
    public void DeleteAtEnd()
    {
        if(head == null)
        {
            return;
        }
        if(head.next == null)
        {
            head = null;
            return;
        }
        LinkedListNode aux = head;
        while(aux.next.next != null)
        {
            aux = aux.next;
        }
        aux.next = null;
    }
    public int size()
    {
        int size = 0;
        if(head == null)
        {
            return size;
        }
        LinkedListNode aux = head;
        while(aux != null)
        {
            aux = aux.next;
            size++;
        }
        return size;
    }
    public int getIndex(int index)
    {
        if(head == null)
        {
            System.out.println("La lista está vacía");
            return -1;
        }
        if(index > size()-1)
        {
            System.out.println("Index mayor que size");
            return -1;
        }
        LinkedListNode aux = head;
        int cont = 0;
        while(cont != index)
        {
            aux = aux.next;
            cont++;
        }
        return aux.value;
    }
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void print()
    {
        LinkedListNode aux = this.head;
        while(aux != null)
        {
            System.out.print(aux.value + " -> ");
            aux = aux.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        LinkedList pepe = new LinkedList();
        System.out.println(pepe.getIndex(0));
        pepe.InsertFirst(1);
        pepe.InsertLast(2);
        pepe.InsertLast(3);
        pepe.InsertLast(4);
        pepe.InsertLast(5);
        pepe.print();
        System.out.println(pepe.getIndex(5));
    }
}