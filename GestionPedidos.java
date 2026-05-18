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
}
