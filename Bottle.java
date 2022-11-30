import java.util.Scanner;

public class Bottle {
    // Members
    String bottleColor;
    String liquidType;
    double volumeOz;
    double liquidVolumeOz;

    // Constructors
    public Bottle(String bottleColor, String liquidType, double volume, double liquidVolume) {
        this.bottleColor = bottleColor;
        this.liquidType = liquidType;
        this.volumeOz = volume;
        this.liquidVolumeOz = liquidVolume;
        fill(liquidVolumeOz);

    }

    public void drink(double amountToDrink) {
        if (amountToDrink > liquidVolumeOz) {
            amountToDrink = liquidVolumeOz;
        }

        liquidVolumeOz -= amountToDrink;

    }

    public void fill(double amountToFillOz) {

        if (amountToFillOz > remainingVolume()) {
            amountToFillOz = remainingVolume();
        }

        liquidVolumeOz += amountToFillOz;
    }

    public void fill() { // Fills to full
        fill(remainingVolume());
    }

    public boolean isEmpty() {
        // return liquidVolume > 0.0 ? false : true;
        return liquidVolumeOz <= 0.0;
    }

    public double remainingVolume() {
        return volumeOz - liquidVolumeOz;
    }

    public String toString() {
        return String.format("%s Bottle (%s) (%s/%s)", bottleColor, liquidType, liquidVolumeOz, volumeOz);

    }

    public static void main(String[] args) {
        // static is used to indicate that a member does not need a object of that class
        // to operate
        Bottle b = new Bottle("jade", "tea", 12, 0);
        System.out.println(b.remainingVolume());
        System.out.println(b);

        b.drink(5);
        System.out.println(b);

        b.drink(13);
        System.out.println(b);

        b.fill(6);
        System.out.println(b);

        System.out.println(b.isEmpty());

        Bottle nalgene = new Bottle("clear", "water", 32, 0);

    }
}