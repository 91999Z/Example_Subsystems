package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/** Starts the WPILib robot application. */
public final class Main {
  private Main() {
    // Utility class; do not instantiate.
  }

  /** Application entry point. */
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}
