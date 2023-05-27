public class Decaf implements Beverage{

    private double size;

    public Decaf(double size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double getPrice() {
        return 0.80 * size;
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
