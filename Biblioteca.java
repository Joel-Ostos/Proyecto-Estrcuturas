import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {
  public static void main(String[] args) {
    HashMap<String, String> credencialesBibliotecario = new HashMap<>();
    credencialesBibliotecario.put("Pablo", "12345678");

    Scanner scanner = new Scanner(System.in);
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
        while (true) {
          System.out.println("¿Qué quieres hacer?\n1.Prestamo de libro\n2. Mostrar mis libros \n3.salir");
          int opcion = scanner.nextInt();
          LinkedList<String> librosCliente = new LinkedList<>();
          if (opcion == 1) {
            System.out.println("Bienvenido");
            String usuario = scanner.nextLine();
            System.out.println("Escribe tu clave: )");
            String llave = scanner.nextLine();
            System.out.println("Ingresa el libro que quieras pedir prestado: ");
            System.out.println("Libros disponibles: ");
            LibrosBiblioteca libros = new LibrosBiblioteca();
            libros.mostrarTodos();
            System.out.println("libro:");
            String libro = scanner.nextLine();
            if (libros.mostrarPorNombre(libro) != null) {
              librosCliente.add(libro);
              Cliente cliente = new Cliente(usuario, llave, librosCliente);
              System.out.println("se ha creado su registro satisfactoriamente");
            }else {
              break;
            }
          } else if (opcion == 2) {
            for (String i : librosCliente) {
              System.out.println(i);
            }

          } else if (opcion == 3) {
            System.out.println("saliendo...");
            break;
          }
        }
      }
    }
  }
}

/*
 * libros.create("Introduction to set theory","Jech",10,"Norma" );
 * libros.create("Akelarre", "Jorge Isaac",12,"Planeta");
 * libros.create("100 anos de Soledad", "Gabriel Garcia Marquez",10,"Penguin");
 * 
 * // LibrosNombre muestra todos los nombres de los libros
 * System.out.println("Consulta de libro por nombre: (100 años de soledad)");
 * System.out.println(libros.MostrarPorNombre("100 anos de Soledad").
 * getNombreLibro());
 * System.out.println("Mostrar todo los libros en el inventario");
 * System.out.println(libros.MostrarTodos());
 * System.out.println("Mostrar Libro que se eliminó");
 * System.out.println(libros.EliminarLibro("Física"));
 * System.out.println("Mostrar todo los libros en el inventario");
 * System.out.println(libros.MostrarTodos());
 */