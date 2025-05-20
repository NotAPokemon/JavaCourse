package S04Inherit;

public class Wool extends Block {

    private String color;

    public Wool(double x, double y, double z, double hardness, String color) {
        super(x, y, z, hardness);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Wool: \n\tPosition\n\t\tx: " + getPos()[0]
                + "\n\t\ty: " + getPos()[1]
                + "\n\t\tz: " + getPos()[2]
                + "\n\tHardness: " + getHardness()
                + "\n\tColor: " + getColor();
    }

}
