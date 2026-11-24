package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** LED subsystem template for status indication and operator feedback. */
public class LEDSubsystem extends SubsystemBase {
  // Primary motor/controller example (commented out: add a vendor library if required).
  // private SparkMax motor1;
  // Optional secondary motor example: // private SparkMax motor2;
  // Optional tertiary motor example: // private SparkMax motor3;

  // Sensor examples; LED subsystems typically need few sensors, but these are available as patterns.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private Gyro gyro;
  // private CANcoder canCoder; // Vendor device: add its vendor dependency before use.
  // private AnalogInput distanceSensor;

  /** Creates an inert LED placeholder without initializing an output port. */
  public LEDSubsystem() {
    // TODO: Configure the LED output, strip length, and default status pattern.
  }

  /** Placeholder for future status pattern selection. */
  public void setStatus() {
    // TODO: Select and display an appropriate robot status pattern.
  }

  /** Placeholder for disabling the LED output. */
  public void stop() {
    // TODO: Turn off or safely idle LEDs after the output hardware is selected.
  }
}
