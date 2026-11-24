package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Turret mechanism template for aiming a rotating mechanism. */
public class TurretSubsystem extends SubsystemBase {
  // Primary motor example (commented out: add a vendor library before enabling hardware).
  // private SparkMax motor1;
  // Optional secondary motor example: // private SparkMax motor2;
  // Optional tertiary motor example: // private SparkMax motor3;

  // Sensor examples; add imports and configure only the sensors this turret needs.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private Gyro gyro;
  // private CANcoder canCoder; // Vendor device: add its vendor dependency before use.
  // private AnalogInput distanceSensor;

  /** Creates an inert turret placeholder without allocating hardware. */
  public TurretSubsystem() {
    // TODO: Configure turret hardware, feedback, and the allowed rotation range.
  }

  /** Placeholder for future turret angle control. */
  public void setAngle(double angle) {
    // TODO: Implement angle control and respect mechanical/cable-wrap limits.
  }

  /** Placeholder for stopping turret movement. */
  public void stop() {
    // TODO: Stop the turret motor after hardware is configured.
  }
}
