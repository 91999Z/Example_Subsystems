package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Climber mechanism template for endgame climbing or other load-bearing extension. */
public class ClimberSubsystem extends SubsystemBase {
  // Primary motor example (commented out: add a vendor library before enabling hardware).
  // private SparkMax motor1;
  // Optional secondary motor example: // private SparkMax motor2;
  // Optional tertiary motor example: // private SparkMax motor3;

  // Sensor examples; add imports and configure only the sensors this climber needs.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private Gyro gyro;
  // private CANcoder canCoder; // Vendor device: add its vendor dependency before use.
  // private AnalogInput distanceSensor;

  /** Creates an inert climber placeholder without allocating hardware. */
  public ClimberSubsystem() {
    // TODO: Configure climber motors, limits, and any ratchet/interlock mechanism.
  }

  /** Placeholder for future climber extension control. */
  public void extend() {
    // TODO: Implement safe climber extension after load and limit requirements are known.
  }

  /** Placeholder for stopping the climber. */
  public void stop() {
    // TODO: Stop climber motor(s) after hardware is configured.
  }
}
