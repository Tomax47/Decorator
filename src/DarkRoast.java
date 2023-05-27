public class DarkRoast implements Beverage{

    private double size;

    public DarkRoast(double size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double getPrice() {
        return 2.00;
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
