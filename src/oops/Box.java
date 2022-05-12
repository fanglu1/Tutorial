package oops;
public class Box {
    int width;
    int height;

    Box(int w, int h) {
        width = w;
        height = h;
    }
    Box(Box b) {
        this.width = b.width;
        this.height = b.height;
    }
    boolean isEqual(Box b){
        return this.width == b.width && this.height == b.height;
    }
    public Box duplicate() {
        return new Box(this.width, this.height);
    }
    static boolean isTwoObjectsEqual(Box b1, Box b2) {
        return b1.width == b2.width && b1.height == b2.height;
    }
    void display() {
        System.out.println("Width is " + this.width + " and height is " + this.width);
    }


}
