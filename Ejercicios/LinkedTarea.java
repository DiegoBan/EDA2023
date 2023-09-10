public class LinkedTarea {
    public static class tarea  //clase solicitada
    {
        int priority;
        String subjet;
        String name;
        String description;
        tarea(int priority, String subjet, String name, String description)
        {
            this.priority = priority;
            this.subjet = subjet;
            this.name = name;
            this.description = description;
        }
        public void print()
        {
            System.out.println("Prioridad: " + this.priority);
            System.out.println("Materia: " + this.subjet);
            System.out.println("Nombre: " + this.name);
            System.out.println("Descripción: " + this.description);
        }
    }
    LinkedListNode head;
    public class LinkedListNode
    {
        tarea value;
        LinkedListNode next;
        LinkedListNode(tarea value)
        {
            this.value = value;
            this.next = null;
        }
        LinkedListNode(tarea value, LinkedListNode next)
        {
            this.value = value;
            this.next = next;
        }
    }
    public void insertAtStart(tarea value)
    {
        if(this.head == null)
        {
            this.head = new LinkedListNode(value);
            return;
        }
        LinkedListNode aux = new LinkedListNode(value, head);
        this.head = aux;
    }
    public void insertAtEnd(tarea value)
    {
        if(this.head == null)
        {
            this.head = new LinkedListNode(value);
            return;
        }
        LinkedListNode aux = this.head;
        while(aux.next != null)
        {
            aux = aux.next;
        }
        aux.next = new LinkedListNode(value);
    }
    public void deleteAtStart()
    {
        if(this.head == null)
        {
            System.out.println("Lista Vacía");
            return;
        }
        this.head = this.head.next;
    }
    public int size()
    {
        if(this.head == null)
        {
            return 0;
        }
        LinkedListNode aux = this.head;
        int cont = 0;
        while(aux != null)
        {
            aux = aux.next;
            cont++;
        }
        return cont;
    }
    public tarea get(int index)
    {
        if(index >= size())
        {
            System.out.println("index mayor a tamaño de la lista");
            return null;
        }
        LinkedListNode aux = this.head;
        int cont = 0;
        while(index != cont)
        {
            aux = aux.next;
            cont++;
        }
        return aux.value;
    }
    public void print()
    {
        LinkedListNode aux = this.head;
        while(aux != null)
        {
            System.out.print(aux.value.name + " -> ");
            aux = aux.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        LinkedTarea tareas = new LinkedTarea();
        tareas.insertAtStart(new tarea(0, "calculo 2", "tarea presolemne", "Calcular integrales"));
        tareas.insertAtEnd(new tarea(3, "EDA", "Tarea 1", "Hackerrank"));
        tareas.insertAtEnd(new tarea(3, "Redes de datos", "Tarea 3", "Pings y conexiones"));
        System.out.println(tareas.size());
        tareas.print();
        tareas.get(1).print();
    }
}