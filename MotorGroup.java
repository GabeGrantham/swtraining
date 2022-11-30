public class MotorGroup implements Motor {

    private Motor[] motors;

    public MotorGroup(Motor... motors) {
        this.motors = motors;
    }

    @Override
    public void set(double speed){
        for(Motor m : motors){
            m.set(speed);
        }

    @Override
    public double get() {
        return motors[0].get();
    }

    @Override
    public void stop() {
        for (Motor m : motors) {
            m.stop();
        }

    }
}
