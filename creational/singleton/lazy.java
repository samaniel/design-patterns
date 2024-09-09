
public class SingletonLazy {

    // Instancia única de la clase, inicialmente nula
    private static SingletonLazy instancia;

    // Constructor privado para evitar instanciación desde fuera
    private SingletonLazy() {
        // Inicialización de recursos si es necesario
    }

    // Método público para obtener la instancia única de la clase
    public static SingletonLazy getInstance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

    // Método de ejemplo en la clase Singleton
    public void mostrarMensaje() {
        System.out.println("Hola desde Singleton con Lazy Initialization!");
    }
}
