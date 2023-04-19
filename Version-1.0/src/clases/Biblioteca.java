package clases;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {

  Biblioteca libros = new LibrosBiblioteca();

      System.out.println("¿Qué tipo de usuario eres?");
      System.out.println("1. Bibliotecario");
      System.out.println("2. Cliente");
      if (tipoUsuario == 1) {

	scanner.nextLine();
      int tipoUsuario = scanner.nextInt();
      while (true) {

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
		for (int i = 0; i < unidades; i++){
		  libros.create(nombreLibro, nombreAutor,1, editorial);}
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
		System.out.println("Cual es el nombre del titulo que desea consultar?");
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
	    if (opcion == 4) {
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
	  System.out.println("4. Volver al menú principal");
	  System.out.println("5. Salir");

	  int opcion = scanner.nextInt();
	  scanner.nextLine();

	  switch (opcion) {
	    case 1:
	      System.out.println("Libros disponibles: ");
	      System.out.println(libros.mostrarTodos());
	      System.out.println("Ingrese el nombre del libro que desea pedir prestado: ");
	      String libro = scanner.nextLine();
	      Libro libroEncontrado = libros.mostrarPorNombre(libro);

	      if (libroEncontrado != null) {
		cliente.getListaLibros().add(libro);
		libros.eliminarLibro(libro);
		System.out.println("Libro prestado con éxito.");
	      } else {
		System.out.println("No se encontró el libro o no hay unidades disponibles.");
	      }
	      break;
	    case 2:
	      System.out.println("Libros prestados:");
	      for (String libroPrestado : cliente.getListaLibros()) {
		System.out.println(libroPrestado);
	      }
	      break;
	    case 3:
	      System.out.println("Ingrese el nombre del libro que desea devolver: ");
	      String libroDevolver = scanner.nextLine();
	      System.out.println("Ingrese el nombre del autor del libro: ");
	      String autorDevolver = scanner.nextLine();
	      System.out.println("Ingrese el nombre de la editorial: ");
	      String editorialDevolver = scanner.nextLine();
	      System.out.println("Ingrese el nombre del libro que desea devolver: ");
	      if (cliente.getListaLibros().remove(libroDevolver)) {
		System.out.println("Libro devuelto con éxito.");
		libros.create(libroDevolver, autorDevolver, 1, editorialDevolver);
	      } else {
		System.out.println("No se encontró el libro en su lista de libros prestados.");
	      }
	      break;
	    case 4:
	      System.out.println("Volviendo al menú principal...");
	      break;
	    case 5:
	      System.out.println("Saliendo...");
	      System.exit(0);
	    default:
	      System.out.println("Opción no válida.");
	  }
	  if (opcion == 4) {
	    break;
	  }
	}
      }
    }
  }
}
