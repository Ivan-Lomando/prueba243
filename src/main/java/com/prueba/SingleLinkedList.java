package com.prueba;

public class SingleLinkedList {
    public Node head;


    public void appendToTail(int value){
        if (head == null){
            head = new Node(value);
            return;
        }

        Node current = head; // current es un nodo auxilar que se inicializa en el priemro de la lista.
        while (current.next != null){
            current = current.next; // asi se rocorre una lista enlazada.
        }
        current.next = new Node(value);
    }

    public void deleteNode(int value){
        if(head == null) return;

        if (head.value == value){ // para eliminar el primer valor de la lista.
            head = head.next;  
            return;
        }
        Node current = head;        // para eliminar otro que no sea el 1
        while (current.next != null){
            if (current.next.value == value){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public void print() {
        if (head == null) {
          System.out.println("END");
          return;
        }
        Node current = head;
        while (current.next != null) {
          System.out.print(current.value + " -> ");
          current = current.next;
        }
        System.out.println(current.value + " -> END");
      }
    
}
