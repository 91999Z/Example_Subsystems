package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Template for one swerve module containing an independent drive motor, turning motor, and encoder.
 *
 * <p>Competition implementations should enforce steering wrap, optimize module states, and keep
 * drive/turn units consistent. This class is separate from the top-level SwerveSubsystem so teams
 * can duplicate and tune four or more modules.
 */
public class SwerveModuleSubsystem extends SubsystemBase {
  // Drive motor placeholder.
  // private final SparkMax motor1;
  // Turning motor placeholder.
  // private final SparkMax motor2;
  // Optional third motor example.
  // private final SparkMax motor3;
  // Optional fourth motor example.
  // private final SparkMax motor4;

  // Absolute encoder and optional auxiliary sensor placeholders.
  // private DutyCycleEncoder absoluteEncoder;
  // private CANcoder canCoder;
  // private Encoder encoder;
  // private DigitalInput limitSwitch;

  /** Creates an inert swerve module placeholder. */
  public SwerveModuleSubsystem() {
    // TODO: Configure drive/turn controllers, absolute encoder offset, and conversion factors.
  }

  /** Placeholder for applying a desired module state. */
  public void setDesiredState(Object desiredState) {
    // TODO: Replace Object with SwerveModuleState and optimize/command both motors.
  }

  /** Placeholder for requesting drive and turn values directly. */
  public void setDesiredState(double driveMetersPerSecond, double turnAngleRadians) {
    // TODO: Construct and optimize a SwerveModuleState using the selected units.
  }

  /** Placeholder for the current module state. */
  public Object getCurrentState() {
    // TODO: Replace Object with SwerveModuleState and read wheel speed and angle.
    return null;
  }

  /** Placeholder for the current module position. */
  public Object getPosition() {
    // TODO: Replace Object with SwerveModulePosition and read distance and angle.
    return null;
  }

  /** Placeholder absolute encoder offset calibration. */
  public void resetToAbsolute() {
    // TODO: Reset the turning motor's relative encoder using the absolute encoder offset.
  }

  /** Stops both module motors. */
  public void stop() {
    // TODO: Set both motor outputs to neutral or zero.
  }
}
