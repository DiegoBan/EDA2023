public class queue {
    Node head;
    Node tail;
    public class Node
    {
        Integer value;
        Node next;

        Node(Integer value)
        {
            this.value = value;
            this.next = null;
        }
    }
    queue()
    {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(Integer value)  //en Java también llamado add u offer
    {
        Node aux = new Node(value);
        if(isEmpty())
        {
            this.head = aux;
            this.tail = aux;
        }
        else
        {
            this.tail.next = aux;
            this.tail = aux;
        }
    }
    public Integer dequeue()    //en Java también llamado poll
    {
        if(isEmpty()) return null;
        Integer x = this.head.value;
        this.head = this.head.next;
        if(this.head == null) this.tail = null;
        return x;
    }
    public Integer peek()   //toma el dato que está próximo a salir, pero no lo quita
    {
        if(isEmpty()) return null;
        return this.head.value;
    }
    public boolean isEmpty()
    {
        if(this.tail == null) return true;
        else return false;
    }
}