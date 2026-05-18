public class GestionPedidos {
    private PilaManual pilaUndo;
    private PilaManual pilaRedo;
    public GestionPedidos(){
        pilaUndo=new PilaManual();
        pilaRedo=new PilaManual();
    }

    public void registrarPedido(Pizza pizza){
        pilaUndo.push(pizza);
        
        while (!pilaRedo.isEmpty()) {
            pilaRedo.pop();
        }   
        System.out.println("\n Pedido registrado: " + pizza.getNombre());
    }

    public void deshacer(){
        if (pilaUndo.isEmpty()) {
           System.out.println("\n No hay pedidos para deshacer.");
           return;
        }
        Pizza pizzaDeshecha = pilaUndo.pop();
        pilaRedo.push(pizzaDeshecha);
        System.out.println("\n Pedido deshecho: " + pizzaDeshecha.getNombre());
    }

    public void rehacer(){
        if (pilaRedo.isEmpty()) {
            System.out.println("\n No hay pedidos para rehacer.");
            return;
        }
        Pizza pizzaRehecha = pilaRedo.pop();
        pilaUndo.push(pizzaRehecha);
        System.out.println("\n Pedido rehecho: " + pizzaRehecha.getNombre());
    }

    public void mostrarPedidoActual(){
        if (pilaUndo.isEmpty()) {
            System.out.println("\n No hay pedidos activos.");
            return;
        }
        System.out.println("\n Pedido actual (tope de la pila)" );
        System.out.println("" + pilaUndo.peek());
    }

    public void mostrarTodosLosPedidos(){
        System.out.println("\n Pedidos activos (tope):");
        pilaUndo.mostrarTodos();
        System.out.println("\n Pedidos deshechos en espera de rehacer:" + pilaRedo.getTamaño());
    }
}
