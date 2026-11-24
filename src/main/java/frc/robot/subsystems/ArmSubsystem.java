package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Arm mechanism template for positioning a pivoting link or joint. */
public class ArmSubsystem extends SubsystemBase {
  // Primary motor example (commented out: add a vendor library before enabling hardware).
  // private SparkMax motor1;
  // Optional secondary motor example: // private SparkMax motor2;
  // Optional tertiary motor example: // private SparkMax motor3;

  // Sensor examples; add imports and configure only the sensors this arm needs.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private Gyro gyro;
  // private CANcoder canCoder; // Vendor device: add its vendor dependency before use.
  // private AnalogInput distanceSensor;

  /** Creates an inert arm placeholder without allocating hardware. */
  public ArmSubsystem() {
    // TODO: Configure the arm motor, feedback sensor, and safe travel range.
  }

  /** Placeholder for future arm position control. */
  public void setPosition(double position) {
    // TODO: Implement closed-loop positioning using the selected units and limits.
  }

  /** Placeholder for stopping arm movement. */
  public void stop() {
    // TODO: Stop the arm motor after hardware is configured.
  }
}
