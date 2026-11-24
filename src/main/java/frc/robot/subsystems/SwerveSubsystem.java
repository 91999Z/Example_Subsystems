package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Swerve-drive subsystem template for four or more independently steered wheel modules. */
public class SwerveSubsystem extends SubsystemBase {
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

  /** Creates an inert swerve placeholder without allocating hardware. */
  public SwerveSubsystem() {
    // TODO: Define module layout, configure modules, and initialize the selected gyro.
  }

  /** Placeholder for future chassis-speed control. */
  public void drive() {
    // TODO: Convert requested chassis motion to module states and command the modules.
  }

  /** Placeholder for future swerve module zeroing. */
  public void zeroModules() {
    // TODO: Calibrate module steering offsets after hardware and configuration are selected.
  }
}
