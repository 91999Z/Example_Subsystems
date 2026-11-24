package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Gyro subsystem template for heading and tilt measurements.
 *
 * <p>Support implementations using NavX/AHRS, Pigeon2, or ADIS16470 IMUs, along with gyro calibration,
 * heading continuity, and field-relative drive integration.
 */
public class GyroSubsystem extends SubsystemBase {
  // Sensor examples; only enable declarations for the selected gyro hardware.
  // private AHRS navX;
  // private Pigeon2 pigeon;
  // private ADIS16470_IMU adisGyro;

  /** Creates an inert gyro subsystem without allocating hardware. */
  public GyroSubsystem() {
    // TODO: Configure and calibrate the NavX, Pigeon2, or ADIS gyro implementation.
  }

  /** Placeholder heading getter. */
  public double getHeadingDegrees() {
    // TODO: Return continuous or wrapped heading in degrees.
    return 0.0;
  }

  /** Placeholder yaw getter. */
  public double getYawDegrees() {
    // TODO: Read yaw from the selected gyro implementation.
    return 0.0;
  }

  /** Placeholder pitch getter. */
  public double getPitchDegrees() {
    // TODO: Read pitch for balance or tilt diagnostics.
    return 0.0;
  }

  /** Placeholder roll getter. */
  public double getRollDegrees() {
    // TODO: Read roll for balance or tilt diagnostics.
    return 0.0;
  }

  /** Placeholder turn-rate getter. */
  public double getTurnRateDegreesPerSecond() {
    // TODO: Return angular velocity for closed-loop stabilization.
    return 0.0;
  }

  /** Resets the robot heading to zero. */
  public void resetGyro() {
    // TODO: Reset the selected gyro and update field-relative heading state.
  }

  /** Placeholder for resetting heading to a specified angle. */
  public void resetGyro(double headingDegrees) {
    // TODO: Offset or reset the gyro so heading matches headingDegrees.
  }
}
