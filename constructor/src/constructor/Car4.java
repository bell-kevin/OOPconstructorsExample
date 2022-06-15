package constructor;

public class Car4 {

    private String make;
    private int year;
    private String color;
    boolean getMake;

    public Car4(String m, int y, String c) {
        this.make = m;
        this.year = y;
        this.color = c;
    }

    public String getMake() {
        return this.make;
    }
}
