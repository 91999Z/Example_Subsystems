package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Wrist mechanism template for a small joint or end-effector pivot. */
public class WristSubsystem extends SubsystemBase {
  // Primary motor example (commented out: add a vendor library before enabling hardware).
  // private SparkMax motor1;
  // Optional secondary motor example: // private SparkMax motor2;
  // Optional tertiary motor example: // private SparkMax motor3;

  // Sensor examples; add imports and configure only the sensors this wrist needs.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private Gyro gyro;
  // private CANcoder canCoder; // Vendor device: add its vendor dependency before use.
  // private AnalogInput distanceSensor;

  /** Creates an inert wrist placeholder without allocating hardware. */
  public WristSubsystem() {
    // TODO: Configure wrist hardware, feedback sensor, and allowed angular range.
  }

  /** Placeholder for future wrist position control. */
  public void setAngle(double angle) {
    // TODO: Implement position control and apply safe angular limits.
  }

  /** Placeholder for stopping wrist movement. */
  public void stop() {
    // TODO: Stop the wrist motor after hardware is configured.
  }
}
