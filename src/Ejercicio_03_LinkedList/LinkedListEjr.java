package Ejercicio_03_LinkedList;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Models.Node;
public class LinkedListEjr {
    public Node head;
    

    public int getByPos(int position,ListaEnlazada lista) {
       int size =lista.size();
        
        if (position>size){
            throw new IllegalArgumentException("Position of bounds");
        }
        int targetPos=size-position;
        Node current=lista.head;
        for(int i=0;i<targetPos;i++){
            current=current.next;
        }
        return current.value;
    }
}
