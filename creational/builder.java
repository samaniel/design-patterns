// Producto final: Pizza
class Pizza {
    private String masa;
    private String salsa;
    private String ingredientes;
    //setters
}

// Interfaz Builder
interface PizzaBuilder {
    void reset();
    void setMasa(String masa);
    void setSalsa(String salsa);
    void setIngredientes(String ingredientes);
    Pizza getPizza();
}

// Concrete Builder: Construye pizzas específicas
class PizzaMargaritaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void setMasa(String masa) {
        pizza.setMasa(masa);
    }

    @Override
    public void setSalsa(String salsa) {
        pizza.setSalsa(salsa);
    }

    @Override
    public void setIngredientes(String ingredientes) {
        pizza.setIngredientes(ingredientes);
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}

// Director: Controla el proceso de construcción
class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makeMargarita() {
        builder.reset();
        builder.setMasa("fina");
        builder.setSalsa("tomate");
        builder.setIngredientes("mozzarella, albahaca");
        return builder.getPizza();
    }
}

// Uso del patrón Builder
public class Main {
    public static void main(String[] args) {
        PizzaBuilder margaritaBuilder = new PizzaMargaritaBuilder();
        PizzaDirector director = new PizzaDirector(margaritaBuilder);

        Pizza pizzaMargarita = director.makeMargarita();
        System.out.println(pizzaMargarita);
    }
}
