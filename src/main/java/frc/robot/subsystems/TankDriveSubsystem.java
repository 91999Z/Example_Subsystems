package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Tank-drive subsystem template for a drivetrain with left and right sides. */
public class TankDriveSubsystem extends SubsystemBase {
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

  /** Creates an inert tank-drive placeholder without allocating hardware. */
  public TankDriveSubsystem() {
    // TODO: Configure left/right motor groups and any required sensors.
  }

  /** Placeholder for future left/right drive control. */
  public void drive() {
    // TODO: Implement tank or arcade control for the selected drivetrain.
  }

  /** Placeholder for stopping both drivetrain sides. */
  public void stop() {
    // TODO: Stop left and right motor outputs when hardware is added.
  }
}
