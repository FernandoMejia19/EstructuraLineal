import Materia.Models.Pantallas;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;
import Ejercicio_01_sign.SignValidator;
import Materia.Colas.*;
import Materia.ListasEnlazadas.ListaEnlazada;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pila pila=new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        System.out.println("Elemento en la cima es "+pila.peek());
        System.out.println("Elemento eliminado de la pila es "+pila.pop());
        System.out.println("Elemento en la cima es "+pila.peek());

        System.out.println();

        ///implementacion de pila generica
        PilaGenerica<Pantallas> pilaPantallas=new PilaGenerica<>();
        pilaPantallas.push(new Pantallas("Home page", "/Home"));
        pilaPantallas.push(new Pantallas("Menu page", "/Home/menu"));
        pilaPantallas.push(new Pantallas("Settings page", "/Home/menu/settings"));
        System.out.println("Estoy en la pantalla \t"+pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla \t"+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla \t"+pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantallas("User page", "/Home/menu/user"));
        System.out.println("Estoy en la pantalla \t"+pilaPantallas.peek().getNombre());
        //implementacion de la cola generica tipo pantalla

        Cola queue=new Cola();
        //añadir elementos a la cola
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);
        //mostrar el elemento en el frente
        System.out.println("Elemento en el frente "+queue.peek());
        //retirar elementos de la cola
        System.out.println("Elemento retirado  "+queue.remove());
        System.out.println("Elemento en el frente "+queue.peek());

        System.out.println("Elemento retirado  "+queue.remove());
        System.out.println("Elemento en el frente "+queue.peek());
        //verificar si la cola esta vacia
        System.out.println("¿Cola vacia?  "+(queue.isEmpty()?"si":"no")); 
        

        ///IMPLEMENTACION DE COLA GENERICA TIPO PANTALLA
        ColaGenerica<Pantallas> queueGeneric=new ColaGenerica<>();
        queueGeneric.addNode(new Pantallas("Home page","/Home page" ));
        queueGeneric.addNode(new Pantallas("Menu page","/Home page/Menu page" ));
        queueGeneric.addNode(new Pantallas("Settings page","/Home page/Menu page/Settings page" ));
        System.out.println("La cola tiene "+queueGeneric.size()+"  Elementos");
        System.out.println("Estoy en la pantalla \t"+queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida \t"+queueGeneric.remove().getNombre());
        queueGeneric.addNode(new Pantallas("User page","/User page/Menu page/Settings page" ));
        System.out.println("Estoy en la pantalla \t"+queueGeneric.peek().getNombre());
        System.out.println("Pantalla destruida \t"+queueGeneric.remove().getNombre());
        System.out.println("Pantalla destruida \t"+queueGeneric.remove().getNombre());
        System.out.println("Estoy en la pantalla \t"+queueGeneric.peek().getNombre());
        System.out.println("La cola tiene "+queueGeneric.size()+"  Elementos");
        
        ///EJERCICIO 1 SING VALIDATOR
        SignValidator sign=new SignValidator();
        System.out.println(sign.isValid("({[()dsfsgsg)])})"));

        //Lista enlazada
        ListaEnlazada lista=new ListaEnlazada();
        lista.addNode(1);
        lista.addNode(4);
        lista.addNode(3);
        lista.addNode(6);
        lista.print();
        lista.deleteNode(1);
        lista.print();
        lista.deleteNode(3);
        lista.print();
        
    }
}
