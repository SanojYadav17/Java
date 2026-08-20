package Basics;

public class VolumeOfSphere {
    public static void main(String[] args) {

        double r = 9.5;
        double volume = (4.0 / 3.0) * 3.14 * r * r * r;
        System.out.println(volume);
        double l = 20;
        double b = 21;
        double h = 4;
        double Surface = 2*(l*b + b*h + h*l);
        System.out.println(Surface);
    }
}
