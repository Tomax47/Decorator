public class Main {
    public static void main(String[] args) {

        Beverage[] beverages = {
                new Milk(new DarkRoast(0.400)),
                new Mocha(new Milk(new Espresso(0.500))),
                new Soy(new Milk(new Decaf(1.00))),
                new Whip(new Milk(new HouseBlend(0.450)))
        };


        for (int i = 0; i < beverages.length; i++) {
            System.out.println("Ingredients : "+beverages[i].getDescription() + "\nPrice : "+beverages[i].getPrice()+"$");
            System.out.println("\n");
        }
    }
}
