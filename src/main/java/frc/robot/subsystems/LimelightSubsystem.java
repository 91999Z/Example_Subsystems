package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Limelight vision subsystem template for primary/alternate pipelines and AprilTag observations.
 *
 * <p>Typical competition uses include target-relative aiming, tag alignment, pose estimation,
 * and range-based shooter or mechanism setpoints. NetworkTables or LimelightHelpers may be used.
 */
public class LimelightSubsystem extends SubsystemBase {
  /** Creates an inert Limelight subsystem without network or camera access. */
  public LimelightSubsystem() {
    // TODO: Select table name/pipeline and initialize optional LimelightHelpers integration.
  }

  /** Placeholder target visibility getter. */
  public boolean hasTarget() {
    // TODO: Read Limelight valid-target indicator.
    return false;
  }

  /** Placeholder horizontal target angle. */
  public double getTargetXDegrees() {
    // TODO: Read horizontal offset and apply any unit/mounting transform.
    return 0.0;
  }

  /** Placeholder vertical target angle. */
  public double getTargetYDegrees() {
    // TODO: Read vertical offset and apply any unit/mounting transform.
    return 0.0;
  }

  /** Placeholder AprilTag ID getter. */
  public int getPrimaryAprilTagId() {
    // TODO: Read fiducial ID from Limelight detector data.
    return -1;
  }

  /** Placeholder AprilTag pose getter. */
  public Object getAprilTagPose() {
    // TODO: Convert Limelight pose data to WPILib Pose3d or robot-relative data.
    return null;
  }

  /** Placeholder distance estimate. */
  public double estimateDistanceMeters() {
    // TODO: Use fiducial pose or solve with mounting height/angle and target height.
    return 0.0;
  }

  /** Placeholder pipeline selector. */
  public void setPipeline(int pipelineIndex) {
    // TODO: Publish the pipeline index to the selected Limelight table.
  }
}
