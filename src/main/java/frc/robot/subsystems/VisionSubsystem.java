package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Vision subsystem template for camera observations and optional distance measurements. */
public class VisionSubsystem extends SubsystemBase {
  // Primary motor example (commented out: add a vendor library before enabling hardware).
  // private SparkMax motor1;
  // Optional secondary motor example: // private SparkMax motor2;
  // Optional tertiary motor example: // private SparkMax motor3;

  // Sensor examples; cameras may instead communicate over the network.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private Gyro gyro;
  // private CANcoder canCoder; // Vendor device: add its vendor dependency before use.
  // private AnalogInput distanceSensor;

  /** Creates an inert vision placeholder without opening cameras or network devices. */
  public VisionSubsystem() {
    // TODO: Configure the selected camera/vision source and target pipeline.
  }

  /** Placeholder for future target-visibility query. */
  public boolean hasTarget() {
    // TODO: Read and validate a target observation from the chosen vision source.
    return false;
  }

  /** Placeholder for future estimated target distance. */
  public double getTargetDistance() {
    // TODO: Calculate distance from validated vision data and camera geometry.
    return 0.0;
  }
}
