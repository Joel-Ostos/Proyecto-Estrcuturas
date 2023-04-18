package clases;

public class Libro {
	private String NombreLibro;
	private String Autor;
	private int CantLibros;
	private String Editorial;
	
	public Libro(String NombreLibro, String Autor, int CantLibros, String Editorial){
	  this.NombreLibro = NombreLibro;
	  this.Autor = Autor;
	  this.CantLibros = CantLibros;
	  this.Editorial = Editorial;
	}

	// Metodo para obtener y fijar el nombre del libro (getters y setters).
	public String getNombreLibro() {
		return NombreLibro;
	}

	public void setNombreLibro(String NombreLibro) {
		this.NombreLibro = NombreLibro;
	}

	// Metodo para obtener y fijar autor (getters y setters).
	public String getAutor() {
		return Autor;
	}

	public void setAutor(String Autor) {
		this.Autor = Autor;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String Editorial) {
		this.Editorial = Editorial;
	}

}
