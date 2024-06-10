package Ejercicio_01_sign;


import Materia.Colas.ColaGenerica;
import Materia.Pilas.PilaGenerica;

public class SignValidator {
    boolean value=false;
    PilaGenerica<Character> pila=new PilaGenerica<>();
    ColaGenerica<Character> cola2=new ColaGenerica<>();
    
    public boolean isValid (String s){
        for (int i=0;i<s.length();i++){
    
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                pila.push(s.charAt(i));
                
            }else if (s.charAt(i)==')'){
               
                if (pila.peek()=='('){
                    pila.pop();
                    value=true;
                }else {
                    return false;
                }  

            }else if (s.charAt(i)==']'){
               
                if(pila.peek()=='['){
                    pila.pop();
                    value=true;
                }else {
                    return false;
                }  

            }else if (s.charAt(i)=='}'){
                
                if(pila.peek()=='{'){
                    value=true;
                    pila.pop();
                }else {
                    return false;
                }  
            
            }
        }
        return value;
}
}