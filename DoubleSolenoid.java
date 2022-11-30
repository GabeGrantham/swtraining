public class DoubleSolenoid {
    public enum Value {
        FORWARD, NEUTRAL, REVERSE
    }

    private Value value = Value.NEUTRAL;

    void set(Value active) {
        this.value = value;
    }

    public boolean get() {
        return value;
    }
}