public class HouseBlend implements Beverage {

    private double size;

    public HouseBlend(double size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double getPrice() {
        return 1.50;
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
