package frc.systems;

import frc.input.InputMethod;

/**
 * Parent class of the systems that run on the robot
 */
public abstract class RobotSystem {
  protected InputMethod input;

  /**
   * Creates a new RobotSystem
   * 
   * @param input the object that gives the controller input from the user
   */
  public RobotSystem(InputMethod input) {
    this.input = input;
  }

  /**
   * Initializes the motors and other elements of the system. 
   * Separate from constructor to allow skipping during testing.
   */
  public abstract void init();

  /**
   * Runs the system. Intended to be called periodically and rapidly
   */
  public abstract void run();
}