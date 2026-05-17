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
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║            MENU PRINCIPAL             ║");
            System.out.println("╠═══════════════════════════════════════╣");
            System.out.println("║ 1. Registrar Pizza (push)             ║");
            System.out.println("║ 2. Deshacer últimopedido (undo)       ║");
            System.out.println("║ 3. Rehacer pedido (redo)              ║");
            System.out.println("║ 4. Mostrar pedido actual (peek)       ║");
            System.out.println("║ 5. Mostrar todos los pedidos          ║");
            System.out.println("║ 6. Salir                              ║");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); 
                }
            opcion = scanner.nextInt();
            scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("\n Registrar nueva Pizza: ");
                System.out.print("Ingrese el nombre de la pizza: ");
                String nombre = scanner.nextLine().trim();
                String[] ingredientes = new String[3];
                