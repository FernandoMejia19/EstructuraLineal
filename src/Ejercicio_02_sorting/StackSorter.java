package Ejercicio_02_sorting;

import Materia.Pilas.PilaGenerica;

public class StackSorter {
    
    public void sortStack(PilaGenerica<Integer> stack){
        PilaGenerica<Integer> stackAdicional=new PilaGenerica<>();
        while (!stackAdicional.isEmpty()){
            stack.pop();
            while(stackAdicional.peek()>stack.pop()){
                stack.push(stackAdicional.pop());
            }
            stackAdicional.push(stack.pop());
        }
        while (!stackAdicional.isEmpty()) {
            stack.push(stackAdicional.pop());
        }
    }
}
