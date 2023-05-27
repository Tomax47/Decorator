public class BeverageDecorator implements Beverage{

    protected Beverage temBeverage;

    public BeverageDecorator(Beverage newBeverage) {
        temBeverage = newBeverage;
    }
    @Override
    public String getDescription() {
        return temBeverage.getDescription();
    }

    @Override
    public double getPrice() {
        return temBeverage.getPrice();
    }

    @Override
    public void setSize(double size) {

    }

    @Override
    public double getSize() {
        return temBeverage.getPrice();
    }
}
