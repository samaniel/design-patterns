public class SingletonEager {

    // Instancia única de la clase, creada al cargar la clase
    private static final SingletonEager instancia = new SingletonEager();

    // Constructor privado para evitar instanciación desde fuera
    private SingletonEager() {
        // Inicialización de recursos si es necesario
    }

    // Método público para obtener la instancia única de la clase
    public static SingletonEager getInstance() {
        return instancia;
    }

    // Método de ejemplo en la clase Singleton
    public void mostrarMensaje() {
        System.out.println("Hola desde Singleton con Eager Initialization!");
    }
}
