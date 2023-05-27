public class Whip extends BeverageDecorator{
    public Whip(Beverage newBeverage) {
        super(newBeverage);

    }

    public String getDescription(){
        return temBeverage.getDescription() + ", Whip";
    }

    public double getPrice(){
        return temBeverage.getPrice() + 1.55 * temBeverage.getSize();
    }

    public void setSize(double size){
        temBeverage.setSize(size);
    }

    public double getSize(){
        return temBeverage.getSize();
    }
}
