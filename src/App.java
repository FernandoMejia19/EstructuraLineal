import Materia.Models.Pantallas;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;;
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

    }
}
