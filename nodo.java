public class Nodo {
    Pizza dato;
    Nodo siguiente;

    Nodo(Pizza dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
}

public class PilaManual(){

    private Nodo tope;
    private int tamaño;

    public PilaManual(){
        tope=null;
        tamaño=0;
    }

    public void push(Pizza pizza){
        Nodo nuevoNodo=new Nodo(pizza);
        nuevoNodo.siguiente=tope;
        tope=nuevoNodo;
        tamaño++;
    }

    public Pizza pop(){
        if (isEmpty()) {
            return null;
        }
        Pizza pizzaRetirada=tope.dato;
        tope=tope.siguiente;
        tamaño--;
        return pizzaRetiradaa;
    }
}
