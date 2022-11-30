public class Solenoid implements Sendable {

    private boolean isActive;

    void set(boolean active) {
        isActive = active;
    }

    public boolean get() {
        return isActive;
    }

    @Override
    public String send() {
        return String.format("<Solenoid %s>", isActive);
    }

}
