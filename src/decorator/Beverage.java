package decorator;

public abstract class Beverage {
    String description;
    enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;

    String getDescription() {
        return description;
    }

    void setSize(Size size) {
        this.size = size;
    }

    Size getSize() {
        return this.size;
    }

    abstract double cost();

}
