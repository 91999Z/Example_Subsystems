package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Elevator mechanism template for vertically moving a carriage or stage. */
public class ElevatorSubsystem extends SubsystemBase {
  // Primary motor example (commented out: add a vendor library before enabling hardware).
  // private SparkMax motor1;
  // Optional secondary motor example: // private SparkMax motor2;
  // Optional tertiary motor example: // private SparkMax motor3;

  // Sensor examples; add imports and configure only the sensors this elevator needs.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private Gyro gyro;
  // private CANcoder canCoder; // Vendor device: add its vendor dependency before use.
  // private AnalogInput distanceSensor;

  /** Creates an inert elevator placeholder without allocating hardware. */
  public ElevatorSubsystem() {
    // TODO: Configure the elevator motor, feedback, and mechanical limits.
  }

  /** Placeholder for future elevator position control. */
  public void setHeight(double height) {
    // TODO: Implement position control and enforce configured travel limits.
  }

  /** Placeholder for stopping the elevator. */
  public void stop() {
    // TODO: Stop the elevator motor after hardware is configured.
  }
}
