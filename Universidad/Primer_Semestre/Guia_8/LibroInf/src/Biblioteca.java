import java.util.ArrayList;

//clase de biblioteca

public class Biblioteca {

    private final ArrayList<LibroNuevo> listaDeLibros;

    //creation array

public Biblioteca() {
    listaDeLibros = new ArrayList<>();
    }
    //logic para añadir el libro a la lista
public void agregarLibro(LibroNuevo libro) {
    listaDeLibros.add(libro);
}
//method para mostrar la lista
    public void mostrarLista() {
        for (LibroNuevo libro : listaDeLibros) {
            libro.mostrarDatos();
        }
    }
}
