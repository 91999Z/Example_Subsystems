package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * General drivetrain placeholder for a robot's primary drive system.
 *
 * <p>Use this when the chosen drivetrain abstraction is not specifically represented by the
 * swerve or tank examples. Remove it if one of those concrete templates is used instead.
 */
public class DrivetrainSubsystem extends SubsystemBase {
  // Primary motor example (commented out: add a vendor library before enabling hardware).
  // private SparkMax motor1;
  // Optional secondary motor example: // private SparkMax motor2;
  // Optional tertiary motor example: // private SparkMax motor3;

  // Sensor examples; add imports and configure only the sensors this drivetrain needs.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private Gyro gyro;
  // private CANcoder canCoder; // Vendor device: add its vendor dependency before use.
  // private AnalogInput distanceSensor;

  /** Creates an inert drivetrain placeholder without allocating hardware. */
  public DrivetrainSubsystem() {
    // TODO: Configure selected drivetrain hardware and sensors here when ready.
  }

  /** Placeholder for future drivetrain output control. */
  public void drive() {
    // TODO: Implement the drivetrain control interface for the selected robot.
  }

  /** Placeholder for stopping the drivetrain. */
  public void stop() {
    // TODO: Stop drivetrain outputs after adding motor hardware.
  }
}
