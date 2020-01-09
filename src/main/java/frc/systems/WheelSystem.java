package frc.systems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.input.InputMethod;
import frc.robot.RobotMap;

/**
 * Controls the drivetrain of the robot
 */
public class WheelSystem extends RobotSystem {
  private final double DRIVE_AMT = 1;

  private DifferentialDrive wheels;

  /**
   * Creates a new wheelSystem
   * 
   * @param input the controller input object
   */
  public WheelSystem(InputMethod input) {
    super(input);
  }

  @Override
  public void init() {
    Spark leftMotor = new Spark(RobotMap.LEFT_DRIVE_MOTOR);
    Spark rightMotor = new Spark(RobotMap.RIGHT_DRIVE_MOTOR);
    wheels = new DifferentialDrive(leftMotor, rightMotor);
  }

  @Override
  public void run() {
    double[] power = new double[]{input.leftSidePower() * DRIVE_AMT, input.rightSidePower() * DRIVE_AMT};
    wheels.tankDrive(power[0], power[1], true);
  }
}