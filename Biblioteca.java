package clases;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        HashMap<String, String> credencialesBibliotecario = new HashMap<>();
        credencialesBibliotecario.put("Pablo", "12345678");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tipo de usuario eres?");
        System.out.println("1. Bibliotecario");
        System.out.println("2. Cliente");

        int tipoUsuario = scanner.nextInt();
        scanner.nextLine();

        if (tipoUsuario == 1) {
            System.out.println("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa tu clave: ");
            String clave = scanner.nextLine();

            if (!credencialesBibliotecario.containsKey(nombre) || !credencialesBibliotecario.get(nombre).equals(clave)) {
                System.out.println("No eres un bibliotecario autorizado.");
            } else {
                LibrosBiblioteca libros = new LibrosBiblioteca();

                while (true) {
                    System.out.println("¿Qué deseas hacer?");
                    System.out.println("1. Agregar libro");
                    System.out.println("2. Eliminar libro");
                    System.out.println("3. Mostrar todos los libros");
                    System.out.println("4. Salir");

                    int opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("Ingresa el nombre del libro: ");
                            String nombreLibro = scanner.nextLine();
                            System.out.println("Ingresa el nombre del autor: ");
                            String nombreAutor = scanner.nextLine();
                            System.out.println("Ingresa la cantidad de unidades: ");
                            int unidades = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Ingresa el nombre de la editorial: ");
                            String editorial = scanner.nextLine();

                            libros.create(nombreLibro, nombreAutor, unidades, editorial);
                            System.out.println("Libro agregado.");
                            break;
                        case 2:
                            System.out.println("Ingresa el nombre del libro que deseas eliminar: ");
                            String nombreLibroEliminar = scanner.nextLine();
                            if (libros.eliminarLibro(nombreLibroEliminar) != null) {
                                System.out.println("Libro eliminado.");
                            } else {
                                System.out.println("No se encontró el libro especificado.");
                            }
                            break;
                        case 3:
                            System.out.println("Todos los libros en el inventario:");
                            System.out.println(libros.mostrarTodos());
                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            System.exit(0);
                        default:
                            System.out.println("Opción no válida.");
                    }
                }
            }
        } else if (tipoUsuario == 2) {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 1) {
                System.out.println("Ingresa tu Usuario: ");
                String nombreCliente = scanner.nextLine();
                System.out.println("Ingresa tu clave: ");
                String claveCliente = scanner.nextLine();
                Cliente obj = new Cliente(nombreCliente, claveCliente);
            }
        }
    }
}
