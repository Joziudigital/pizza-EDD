class Nodo {
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
        return pizzaRetirada;
    }

    public Pizza peek(){
        if (isEmpty()) {
            return null;
        }
        return tope.dato;
    }

    public boolean isEmpty(){
        return tope==null;
    }

    public int getTamaño(){
        return tamaño;
    }

    public void mostrarTodos(){
        if(isEmpty()){
            System.out.println("La pila esta vacía.");
            return;
        }
        Nodo actual=tope;
        int posicion=1;
        while(actual!=null){
            System.out.println(posicion+". "+actual.dato);
            actual=actual.siguiente;
            posicion++;
        }
    }
}
