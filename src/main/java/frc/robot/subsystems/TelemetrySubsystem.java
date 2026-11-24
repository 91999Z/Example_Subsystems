package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Telemetry subsystem template for publishing operator and developer data.
 *
 * <p>Use Shuffleboard for driver/operator dashboards, SmartDashboard for compatibility, NetworkTables
 * for structured custom data, and an optional AdvantageKit/AdvantageScope data path for match analysis.
 */
public class TelemetrySubsystem extends SubsystemBase {
  /** Creates an inert telemetry subsystem. */
  public TelemetrySubsystem() {
    // TODO: Create publishers, entries, and dashboard layouts when enabled.
  }

  /** Placeholder Shuffleboard publisher. */
  public void publishToShuffleboard(String key, Object value) {
    // TODO: Use Shuffleboard/GenericEntry or a ShuffleboardWidget for key/value output.
  }

  /** Placeholder SmartDashboard publisher. */
  public void publishToSmartDashboard(String key, Object value) {
    // TODO: Add SmartDashboard.putData or putNumber/String/Boolean overloads.
  }

  /** Placeholder NetworkTables publisher. */
  public void publishToNetworkTables(String table, String key, Object value) {
    // TODO: Create a SubTable/Publisher and publish typed values.
  }

  /** Placeholder AdvantageScope logging hook. */
  public void logForAdvantageScope(String key, Object value) {
    // TODO: Integrate AdvantageKit or NetworkTables logging once the chosen logging stack is added.
  }

  /** Placeholder periodic telemetry update. */
  public void updateTelemetry() {
    // TODO: Poll subsystem states and publish at a controlled update rate.
  }
}
