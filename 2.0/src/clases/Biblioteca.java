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
            System.out.println("Que tipo de usuario eres?");
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
                        System.out.println("Que deseas hacer?");
                        System.out.println("1. Agregar libro");
                        System.out.println("2. Eliminar libro");
                        System.out.println("3. Mostrar todos los libros");
                        System.out.println("4. Mostrar cantidad de unidades de un libro");
                        System.out.println("5. Actualizar datos de un libro");
                        System.out.println("6. Volver al menu principal");
                        System.out.println("7. Salir");

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
                                System.out.println("Ingresa Categoria: ");
                                String categoria = scanner.nextLine();
                                libros.create(nombreLibro, nombreAutor, unidades, editorial, categoria);
                                System.out.println("Libro agregado.");
                                break;
                            case 2:
                                System.out.println("Ingresa el nombre del libro que deseas eliminar: ");
                                String nombreLibroEliminar = scanner.nextLine();
                                if (libros.eliminarLibro(nombreLibroEliminar) != null) {
                                    System.out.println("Libro eliminado.");
                                } else {
                                    System.out.println("No se encontro el libro especificado.");
                                }
                                break;
                            case 3:
                                System.out.println("Todos los libros en el inventario:");
                                libros.mostrarTodos();
                                break;
                            case 4:
                                System.out.println("Cual es el nombre del titulo que desea consultar?");
                                String NombreLibro = scanner.nextLine();
                                System.out.println(libros.cantidadLibros(NombreLibro));
                                break;
                            case 5:
                                System.out.println("Ingresa el nombre del libro que deseas editar: ");
                                String nombreLibroActualizar = scanner.nextLine();
                                System.out.println("Ingresa el nuevo nombre del libro: ");
                                String nuevoNombre = scanner.nextLine();
                                System.out.println("Ingresa el nuevo nombre del autor: ");
                                String nuevoAutor = scanner.nextLine();
                                System.out.println("Ingresa el nuevo nombre de la editorial: ");
                                String nuevaEditorial = scanner.nextLine();
                                System.out.println("Ingresa la nueva categoria: ");
                                String nuevaCategoria = scanner.nextLine();
                                libros.actualizarLibro(nombreLibroActualizar, nuevoNombre, nuevoAutor, nuevaEditorial, nuevaCategoria);
                                break;
                            case 6:
                                System.out.println("Volviendo al menu principal...");
                                break;
                            case 7:
                                System.out.println("Saliendo...");
                                System.exit(0);

                            default:
                                System.out.println("Opcion no valida.");
                        }
                        if (opcion == 6) {
                            break;
                        }
                    }
                }
            } else if (tipoUsuario == 2) {
                boolean passwordCorrecta;
                Cliente cliente = null;

                do {
                    System.out.println("Ingresa tu nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresa tu clave: ");
                    String clave = scanner.nextLine();

                    if (clientes.containsKey(nombre)) {
                        cliente = clientes.get(nombre);
                        System.out.println("busca el cliente");
                        passwordCorrecta = cliente.getClave().equals(clave);
                        System.out.println("aca manda un booleano de si la clave guardada es igual a la escrita");
                        System.out.println(passwordCorrecta);
                        if (!passwordCorrecta) {
                            System.out.println("Contrase�a equivocada, intente de nuevo");
                        }
                    } else {
                        System.out.println("aca no encuentra el cliente");
                        cliente = new Cliente(nombre, clave, new LinkedList<>());
                        clientes.put(nombre, cliente);
                        passwordCorrecta = true;
                    }
                } while(!passwordCorrecta); //ejecuta otra vez si la password es incorrecta
                    while (true) {
                        System.out.println("Que quieres hacer?");
                        System.out.println("1.  Solicitar  libro");
                        System.out.println("2.  Ver libros prestados");
                        System.out.println("3.  Devolver libro");
                        System.out.println("4.  Hacer reservacion");
                        System.out.println("5.  Cancelar reservacion");
                        System.out.println("6.  Mirar libros reservados");
                        System.out.println("7.  Busqueda de libros por Autor");
                        System.out.println("8.  Busqueda de libros por Editorial");
                        System.out.println("9.  Busqueda de libros por Autor y Editorial");
                        System.out.println("10. Busqueda de libros por Nombre del libro");
                        System.out.println("11. Volver al menu principal");
                        System.out.println("12. salir");
                        libros.notificarCliente(cliente.getNombre());

                        int opcion = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcion) {
                            case 1:
                                libros.mostrarTodos();
                                System.out.println("Digita el nombre del libro que deseas pedir prestado?");
                                String Nombre = scanner.nextLine();
                                Libro libroPrestado = libros.mostrarPorNombre(Nombre);
                                if (libroPrestado != null && libroPrestado.getCantidad() > 0) {
                                    if (libros.eliminarLibro(Nombre) != null) {
                                        System.out.println("Libro prestado con exito.");
                                        cliente.getListaLibros().add(libroPrestado);
                                    }
                                } else {
                                    System.out.println("Este libro no se encuentra en el sistema");
                                }
                                break;
                            case 2:
                                System.out.println("Libros prestados:");
                                cliente.mostrarLibros();
                                break;
                            case 3:
                                cliente.mostrarLibros();
                                System.out.println("Ingrese el nombre del libro que desea devolver: ");
                                String NombreDevolver = scanner.nextLine();
                                Libro l = libros.mostrarPorNombre(NombreDevolver);
                                if (l != null) {
                                    l.setCantidad(l.getCantidad() + 1);
                                    cliente.getListaLibros().remove(l);
                                } else {
                                    Libro t = cliente.mostrarPorNombreCli(NombreDevolver);
                                    libros.create(t.getNombre(), t.getAutor(), 1, t.getEditorial(), t.getCategoria());
                                }
                                break;
                            case 4:
                                System.out.println("Ingresa el Libro que quieras reservar: ");
                                String libroReservar = scanner.nextLine();
                                libros.reservarLibro(cliente.getNombre(), libroReservar);
                                break;
                            case 5:
                                System.out.println("Ingresa el libro que quieras cancelar:");
                                libros.mostrarLibrosReservados();
                                System.out.println("Ingresa el libro que ya no quieras reservar:");
                                String libroCancelar = scanner.nextLine();
                                libros.cancelarReserva(cliente.getNombre(), libroCancelar);
                                break;
                            case 6:
                                System.out.println("Libros reservados: ");
                                libros.mostrarLibrosReservados();
                            case 7:
                                System.out.println("Ingresa el nombre del Autor para inicar la busqueda: ");
                                String busquedaA = scanner.nextLine();
                                libros.mostrarPorAutor(busquedaA);
                                break;
                            case 8:
                                System.out.println("Ingresa el nombre de la Editorial para inicar la busqueda: ");
                                String busquedaE = scanner.nextLine();
                                libros.mostrarPorEditorial(busquedaE);
                                break;
                            case 9:
                                System.out.println("Ingresa el nombre del Autor para inicar la busqueda: ");
                                String busquedaAutor = scanner.nextLine();
                                System.out.println("Ingresa el nombre de la Editorial para inicar la busqueda: ");
                                String busquedaEditorial = scanner.nextLine();
                                libros.mostrarPorAutorEditorial(busquedaAutor, busquedaEditorial);
                                break;
                            case 10:
                                System.out.println("Ingresa el nombre del Libro para inicar la busqueda: ");
                                String busquedaLibro = scanner.nextLine();
                                libros.mostrarPorAutor(busquedaLibro);
                                break;
                            case 11:
                                System.out.println("Volviendo al menu principal...");
                                break;
                            case 12:
                                System.out.println("Saliendo...");
                                System.exit(0);
                            default:
                                System.out.println("Opcion no valida.");
                        }
                        if (opcion == 11) {
                            break;
                        }
                    }
                
            }
        }
    }
}
