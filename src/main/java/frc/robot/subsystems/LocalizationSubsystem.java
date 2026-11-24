package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Localization subsystem template for combining wheel, gyro, and vision measurements into a field
 * pose.
 *
 * <p>Typical use cases include autonomous trajectory following, alliance-relative positioning,
 * and aligning mechanisms to field targets. The implementation can use WPILib odometry, a
 * {@code PoseEstimator}, and one or more vision observers when vendor APIs are added.
 */
public class LocalizationSubsystem extends SubsystemBase {
  // Sensor examples; leave all hardware declarations commented until dependencies are added.
  // private Encoder encoder;
  // private DutyCycleEncoder absoluteEncoder;
  // private DigitalInput limitSwitch;
  // private DigitalInput beamBreak;
  // private TimeOfFlight tofSensor;
  // private CANcoder canCoder;
  // private AHRS navX;
  // private Pigeon2 pigeon;

  /** Creates an inert localization subsystem without allocating hardware. */
  public LocalizationSubsystem() {
    // TODO: Construct odometry/PoseEstimator objects once drivetrain and gyro sources are selected.
  }

  /** Placeholder odometry update hook. */
  public void updateOdometry() {
    // TODO: Update odometry with drivetrain encoder and gyro measurements.
  }

  /** Placeholder pose-estimator update hook. */
  public void updatePoseEstimator() {
    // TODO: Update the PoseEstimator with wheel, gyro, and vision observations.
  }

  /** Placeholder for retrieving the estimated pose. */
  public Object getPose() {
    // TODO: Replace Object with Pose2d and return the estimator's current pose.
    return null;
  }

  /** Placeholder for retrieving the estimated position and heading. */
  public Object getPose2d() {
    // TODO: Return a Pose2d directly when WPILib geometry is used.
    return null;
  }

  /** Placeholder for fusing a timestamped vision measurement. */
  public void addVisionMeasurement(Object pose, double timestampSeconds) {
    // TODO: Replace Object with Pose2d and call the PoseEstimator vision fusion API.
  }

  /** Resets localization to the origin. */
  public void resetPose() {
    // TODO: Reset odometry and pose estimation to (0, 0, 0 degrees).
  }

  /** Placeholder for resetting localization to a known field pose. */
  public void resetPose(Object pose) {
    // TODO: Replace Object with Pose2d and reset every pose source consistently.
  }
}
