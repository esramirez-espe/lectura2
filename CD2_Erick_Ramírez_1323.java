import java.util.ArrayList;
import java.util.List;

class Computadora {
    public Mouse mouse;
    public Teclado teclado;
    public GestorDeArchivos gestor;
    public Computadora(Mouse mouse, Teclado teclado, GestorDeArchivos gestor) {
        this.mouse = mouse;
        this.teclado = teclado;
        this.gestor = gestor;
    }
    public void encender() {
        System.out.println("Computadora encendida.");
    }
}

class Mouse {
    public String Marca;
    public String Tipo;
    public Mouse(int id, String tipo) {
        this.Marca = Marca;
        this.Tipo = Tipo;
    }
    public void conectar() {
        System.out.println("Mouse detectado");
    }
}

class Teclado {
    public String Marca;
    public String Tipo;
    public Teclado(int id, String tipo) {
        this.Marca = Marca;
        this.Tipo = Tipo;
    }
    public void conectar() {
        System.out.println("Teclado detectado");
    }
}

class GestorDeArchivos {
    public List<Archivo> archivos;
    public GestorDeArchivos() {
        this.archivos = new ArrayList<>();
    }
    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
        System.out.println("Archivo agregado: " + archivo.getNombre());
    }
    public void eliminarArchivo(String nombre) {
        archivos.removeIf(archivo -> archivo.getNombre().equals(nombre));
        System.out.println("Archivo eliminado: " + nombre);
    }
}

class Archivo {
    public String nombre;
    public int tamaño;
    public Archivo(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
    public String getNombre() {
        return nombre;
    }
    public void abrir() {
        System.out.println("Archivo abierto: " + nombre);
    }
    public void cerrar() {
        System.out.println("Archivo cerrado: " + nombre);
    }
}

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse(1, "Conectado");
        Teclado teclado = new Teclado(1, "Conectado");
        GestorDeArchivos gestor = new GestorDeArchivos();
        Computadora computadora = new Computadora(mouse, teclado, gestor);
        computadora.encender();
        mouse.conectar();
        teclado.conectar();
        Archivo archivo1 = new Archivo("Archivo.txt", 1024);
        gestor.agregarArchivo(archivo1);
        archivo1.abrir();
        archivo1.cerrar();
        gestor.eliminarArchivo("Archivo.txt");
    }
}
