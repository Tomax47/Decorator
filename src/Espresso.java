public class Espresso implements Beverage{

    private double size;

    public Espresso(double size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getPrice() {
        return 1.60*size;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }
}
