package src.main.java.frc.systems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.input.InputMethod;
import frc.robot.RobotMap;

/**
 * Controls the intake of the robot
 */
public class IntakeSystem extends RobotSystem {

  private Spark intakeMotor;

  /**
   * Creates a new intakeSystem
   * 
   * @param input the controller input object
   */
  public IntakeSystem(InputMethod input) {
    super(input);
  }

  @Override
  public void init() {
    Spark intakeMotor = new Spark(RobotMap.INTAKE_MOTOR);
  }

  @Override
  public void run() {
    if(input.SHOULD_INTAKE(INTAKE_MOTOR.setSpeed(.5));
    else 
    INTAKE_MOTOR.setSpeed(0);
  }
}