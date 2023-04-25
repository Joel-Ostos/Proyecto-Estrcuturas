package clases;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        HashMap<String, String> credencialesBibliotecario = new HashMap<>();
        credencialesBibliotecario.put("Pablo", "12345678");
        HashMap<String, Cliente> clientes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        LibrosBiblioteca libros = new LibrosBiblioteca();

        while (true) {
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
                    while (true) {
                        System.out.println("¿Qué deseas hacer?");
                        System.out.println("1. Agregar libro");
                        System.out.println("2. Eliminar libro");
                        System.out.println("3. Mostrar todos los libros");
                        System.out.println("4. Mostrar cantidad de unidades de un libro");
                        System.out.println("5. Volver al menú principal");
                        System.out.println("6. Salir");

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
                                System.out.println("Ingresa Categoría: ");
                                String categoria = scanner.nextLine();
                                for(int i = 1; i<= unidades ; i++){
                                    libros.create(nombreLibro, nombreAutor,i, editorial, categoria);
                                }
                                
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
                                libros.mostrarTodos();
                                break;
                            case 4:
                                System.out.println("¿Cuál es el nombre del titulo que desea consultar?");
                                String NombreLibro = scanner.nextLine();
                                System.out.println(libros.CantidadLibros(NombreLibro));
                                break;

                            case 5:
                                System.out.println("Volviendo al menú principal...");
                                break;
                            case 6:
                                System.out.println("Saliendo...");
                                System.exit(0);
                            default:
                                System.out.println("Opción no válida.");
                        }
                        if (opcion == 5) {
                            break;
                        }
                    }
                }
            } else if (tipoUsuario == 2) {
                System.out.println("Ingresa tu nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingresa tu clave: ");
                String clave = scanner.nextLine();

                Cliente cliente;
                if (clientes.containsKey(nombre)) {
                    cliente = clientes.get(nombre);
                } else {
                    cliente = new Cliente(nombre, clave, new LinkedList<>());
                    clientes.put(nombre, cliente);
                }

                while (true) {
                    System.out.println("¿Qué quieres hacer?");
                    System.out.println("1. Solicitar préstamo de libro");
                    System.out.println("2. Ver libros prestados");
                    System.out.println("3. Devolver libro");
                    System.out.println("4. Reservar libro");
                    System.out.println("5. Cancelar reservación");
                    System.out.println("6. Volver al menú principal");
                    System.out.println("7. salir");

                    int opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("¿Qué Libro deseas pedir prestado?");
                            break;
                        case 2:
                            System.out.println("Libros prestados:");
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre del libro que desea devolver: ");
                            break;
                        case 4: 
                            System.out.println("Reservar Libro: ");
                            break;
                        case 5:
                            System.out.println("Cancelar Reservación");
                            break;
                        case 6:
                            System.out.println("Volviendo al menú principal...");
                            break;
                        case 7:
                            System.out.println("Saliendo...");
                            System.exit(0);
                        default:
                            System.out.println("Opción no válida.");
                    }
                    if (opcion == 6) {
                        break;
                    }
                }
            }
        }
    }
}
