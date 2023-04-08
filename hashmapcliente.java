import java.util.HashMap;
importa java.Cliente;

public class nuevousuario{
    private HashMap<String,Integer> tablausuarios;
    private Usuario usuario;
    
    public TablaHash() {
        tablausuarios= new HashMap<>();
    }
    
    public void agregar() {
	System.out.println("Ingresa el nombre del usuario: ");
        String nombreUsuario = scanner.nextLine();
	System.out.println("cree clave del usuario: ");
        Integer claveUsuario = scanner.nextLine();
        if(tablausuarios.containsKey(nombreUsuario)){
	      System.out.println("este usuario ya esta registrado");
        //implementar forma de acceder al odjeto de un usuario en particular
        /*
        this.usuario = nombreUsuario;
        System.out.println(usuario.toString());
        */
	}else{
	      tablausuarios.put(nombreUsuario , claveUsuario );
        this.usuario = nombreUsuario;
        Usuario usuario = new Cliente(nombreUsuario,claveUsuario);
	      System.out.println("Usuario agregado exitosamente");
	}
    }
    public void borrar() {
	System.out.println("Ingresa el nombre del usuario que desea eliminar: ");
        String nombreUsuario1 = scanner.nextLine();
	System.out.println("Ingresa clave del usuario que desea eliminar: ");
        Integer claveUsuario1 = scanner.nextLine();
        if(claveUsuario1==tablausuarios.get(nombreUsuario1)){
	      tablausuarios.remove(nombreUsuario1);
	      System.out.println("Usuario eliminado exitosamente");
	}else{
	      System.out.println("contraseña o usuario equivocado, no se ha podido borrar el usuario");
	}
    }

}
