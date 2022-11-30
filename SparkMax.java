public class SparkMax extends RealMotor {
    private int id;

    public SparkMax();

    @Override
    public void set(double speed)

    @Override
    public String ToString() {
        return String.Format("<SparkMax (%s) %s>", id, get());
    }

    public static void main(String[] args) {
        RealMotor m = new SparkMax(42);
        m.set(10);
        System.out.println("Motor speed: " + m.get());
        System.out.println();

    }

}
