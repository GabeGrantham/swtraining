import java.util.Scanner;

public class DriveTrain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RealMotor left = new MotorGroup(new Sparkmax(5), new SparkMax(6));
        RealMotor right = new Talon("right");
        DriveTrain drive = new DriveTrain(left, right);
        System.out.println(drive);
        //
        drive.move(5.0, -2.0);
        System.out.println(drive);
        while (true) {
            drive.moveWithInput(scan::nextDouble, scan::nextDouble);
            System.out.println(drive);
        }

    }
}