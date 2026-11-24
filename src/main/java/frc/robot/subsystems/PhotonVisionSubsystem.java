package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * PhotonVision subsystem template for camera management and pose estimation.
 *
 * <p>Typical uses include AprilTag field localization, target detection, multi-camera fusion, and
 * camera latency compensation. Vendor APIs should be isolated in implementation later.
 */
public class PhotonVisionSubsystem extends SubsystemBase {
  /** Creates an inert PhotonVision subsystem. */
  public PhotonVisionSubsystem() {
    // TODO: Add cameras and robot-to-camera transforms once the PhotonVision dependency is installed.
  }

  /** Placeholder for registering or enabling a camera. */
  public void setCameraEnabled(String cameraName, boolean enabled) {
    // TODO: Add camera lifecycle or pipeline configuration logic.
  }

  /** Placeholder target-detection getter. */
  public boolean hasTarget(String cameraName) {
    // TODO: Return a camera's latest target status.
    return false;
  }

  /** Placeholder latest-result getter. */
  public Object getLatestTarget(String cameraName) {
    // TODO: Replace Object with a PhotonTrackedTarget or team-specific result type.
    return null;
  }

  /** Placeholder estimated field pose getter. */
  public Object getEstimatedPose(String cameraName) {
    // TODO: Return a timestamped estimated pose or PhotonPoseEstimator result.
    return null;
  }

  /** Placeholder vision-measurement update hook. */
  public void updatePoseEstimator(Object poseEstimator) {
    // TODO: Feed valid PhotonVision measurements into the robot PoseEstimator.
  }

  /** Placeholder pipeline selector. */
  public void setPipeline(String cameraName, int pipelineIndex) {
    // TODO: Set the selected camera's pipeline after vendor integration.
  }
}
