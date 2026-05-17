import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        GestionPedidos gestion=new GestionPedidos();
        in opcion;

        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║    Sistema de gestión de pedidos      ║");
        System.out.println("╚═══════════════════════════════════════╝");

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Mostrar pedidos");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.print("Ingrese el nombre de la pizza: ");
                    String nombrePizza = scanner.nextLine();

                    String[] ingredientes = new String[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Ingrese el ingrediente " + (i + 1) + ": ");
                        ingredientes[i] = scanner.nextLine();
                    }

                    Pizza pizza = new Pizza(nombrePizza, ingredientes);
                    Pedido pedido = new Pedido(cliente, pizza);
                    gestion.agregarPedido(pedido);
                    System.out.println("Pedido agregado exitosamente.");
                    break;

                case 2:
                    gestion.mostrarPedidos();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        } while (opcion != 3);