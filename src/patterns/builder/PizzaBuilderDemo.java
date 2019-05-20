package patterns.builder;

public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzaBuilder );
        waiter.constructPizza();

        Pizza hawaiianPizza = waiter.getPizza();

        waiter.setPizzaBuilder( spicyPizzaBuilder );
        waiter.constructPizza();

        Pizza spicyPizza = waiter.getPizza();
    }
}
