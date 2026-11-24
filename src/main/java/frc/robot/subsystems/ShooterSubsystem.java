package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Shooter mechanism template for launching game pieces with a flywheel or equivalent. */
public class ShooterSubsystem extends SubsystemBase {
  // Primary motor example (commented out: add a vendor library before enabling hardware).
  // private SparkMax motor1;
  // Optional secondary motor example: // private SparkMax motor2;
  // Optional tertiary motor example: // private SparkMax motor3;

  // Sensor examples; add imports and configure only the sensors this shooter needs.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private Gyro gyro;
  // private CANcoder canCoder; // Vendor device: add its vendor dependency before use.
  // private AnalogInput distanceSensor;

  /** Creates an inert shooter placeholder without allocating hardware. */
  public ShooterSubsystem() {
    // TODO: Configure flywheel motor(s), feedback, and safe speed limits.
  }

  /** Placeholder for future flywheel speed control. */
  public void setVelocity(double velocity) {
    // TODO: Implement velocity control using selected units and feedforward values.
  }

  /** Placeholder for stopping the shooter. */
  public void stop() {
    // TODO: Stop shooter motor(s) after hardware is configured.
  }
}
