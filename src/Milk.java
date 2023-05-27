public class Milk extends BeverageDecorator{
    public Milk(Beverage newBeverage) {
        super(newBeverage);
    }

    public String getDescription(){
        return temBeverage.getDescription() + ", Milk";
    }

    public double getPrice(){
        return temBeverage.getPrice() + 0.50*temBeverage.getSize();
    }

    public void setSize(double size){
        temBeverage.setSize(size);
    }

    public double getSize(){
        return temBeverage.getSize();
    }
}
