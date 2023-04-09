import Clases.*;
import java.util.*;
//XDXDXDXDXDXDXDXD

public class Biblioteca {
  public static void main(String[] args) {
    HashMap<String, String> CredencialesBibliotecario = new HashMap<>();
    CredencialesBibliotecario.put("Pablo","12345678");


    LibrosBiblioteca libros = new LibrosBiblioteca();
    Scanner scan = new Scanner(System.in);
    System.out.println("Cual es su nombre: ");
    String nombre = scan.nextLine();
    System.out.println("Cual es su clave?");
    String clave = scan.nextLine();
    while (true){
      if (CredencialesBibliotecario.get(nombre) != "12345678"){
	System.out.println("NO eres un bibliotecario :(");
	break;
      }else {
	System.out.println("Que deseas hacer? \n 1- Agregar libro\n 2- Eliminar libro\n Editar libro");
	int opcion = scan.nextInt();
	if (opcion == 1){
	  String nombreLibro = "100 anos de soledad";
	  System.out.println("Digita el nombre del Autor: ");
	  String NombreAutor = scan.nextLine();
	  scan.nextLine();
	  System.out.println("Digita la cantidad  de unidades: ");
	  int unidades = scan.nextInt();
	  scan.nextLine();
	  System.out.println("Digita el nombre de la editorial: ");
	  String Editorial = scan.nextLine();

	  libros.create(nombreLibro, NombreAutor,unidades, Editorial);
	  System.out.println(nombreLibro);
	  libros.create("El amor en los tiempos del Colera", "Gabriel Garcia Marquez",13,"Gato malo");
	  System.out.println("Salir?");
	  System.out.println(libros.MostrarTodos()); 
	  System.out.println(libros.MostrarPorAutor(NombreAutor)); 
	  int salir = scan.nextInt();
	  if (salir == 1){
	    break;
	  }
	}
      }	
    }
    /*
       libros.create("Introduction to set theory","Jech",10,"Norma" );
       libros.create("Akelarre", "Jorge Isaac",12,"Planeta");
       libros.create("100 anos de Soledad", "Gabriel Garcia Marquez",10,"Penguin");

    // LibrosNombre muestra todos los nombres de los libros
    System.out.println("Consulta de libro por nombre: (100 años de soledad)"); 
    System.out.println(libros.MostrarPorNombre("100 anos de Soledad").getNombreLibro()); 
    System.out.println("Mostrar todo los libros en el inventario"); 
    System.out.println(libros.MostrarTodos()); 
    System.out.println("Mostrar Libro que se eliminó"); 
    System.out.println(libros.EliminarLibro("Física")); 
    System.out.println("Mostrar todo los libros en el inventario"); 
    System.out.println(libros.MostrarTodos());
    */
  }
}

