package S04Inherit;

//Parent class
public class Block {
    private double[] pos = new double[3];
    private double hardness;

    public double[] getPos() {
        return pos;
    }

    public void setPos(double[] pos) {
        this.pos = pos;
    }

    public double getHardness() {
        return hardness;
    }

    public void setHardness(double hardness) {
        this.hardness = hardness;
    }

    public Block(double x, double y, double z, double hardness) {
        this.pos[0] = x;
        this.pos[1] = y;
        this.pos[2] = z;
        this.hardness = hardness;
    }

    public Block(double[] pos, double hardness) {
        this.pos = pos;
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Block: \n\tPosition\n\t\tx: " + getPos()[0]
                + "\n\t\ty: " + getPos()[1]
                + "\n\t\tz: " + getPos()[2]
                + "\n\tHardness: " + getHardness();
    }

}
