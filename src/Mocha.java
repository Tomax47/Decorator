public class Mocha extends BeverageDecorator{
    public Mocha(Beverage newBeverage) {
        super(newBeverage);

    }

    public String getDescription(){
        return temBeverage.getDescription() + ", Mocha";
    }

    public double getPrice(){
        return temBeverage.getPrice() + 0.80 * temBeverage.getSize();
    }

    public void setSize(double size){
        temBeverage.setSize(size);
    }

    public double getSize(){
        return temBeverage.getSize();
    }
}
