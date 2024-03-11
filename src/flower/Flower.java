package flower;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected int chanceOfGrowth = 50;
    protected int water = 25;
    protected boolean growth;

    public Flower(String name, double price, double neededArea, int chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Flower.Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public void plant() {

    }

    public boolean water() {
        if (growth == false) {
            
        }
    }

    public boolean growth() {
        if (chanceOfGrowth >= 75) {
            growth = true;
        } else {
            growth = false;
        }
        return growth;
    }

    public void harvest() {
        if (growth = true) {
            harvest();
        }
    }
}
