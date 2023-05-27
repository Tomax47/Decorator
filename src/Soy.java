public class Soy extends BeverageDecorator{
    public Soy(Beverage newBeverage) {
        super(newBeverage);

    }

    public String getDescription(){
        return temBeverage.getDescription() + ", Soy";
    }

    public double getPrice(){
        return temBeverage.getPrice() + 1.00 * temBeverage.getSize();
    }

    public void setSize(double size){
        temBeverage.setSize(size);
    }

    public double getSize(){
        return temBeverage.getSize();
    }
}
