package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Power subsystem template for monitoring PDP/PDH, battery, current, and brownout conditions.
 *
 * <p>Typical values include channel currents, total current, battery voltage, and brownout status.
 * Use these observations for diagnostics, current limiting, or selecting conservative operation.
 */
public class PowerSubsystem extends SubsystemBase {
  // Vendor examples; uncomment one or both when their vendor dependency is intentionally added.
  // private PowerDistribution pdhOrPdp;

  /** Creates an inert power-monitoring subsystem. */
  public PowerSubsystem() {
    // TODO: Construct the PDH/PDP implementation selected for the robot.
  }

  /** Placeholder battery-voltage getter. */
  public double getBatteryVoltage() {
    // TODO: Return battery voltage from the PDH/PDP or RobotController.
    return 0.0;
  }

  /** Placeholder total-current getter. */
  public double getTotalCurrent() {
    // TODO: Return total robot current in amps.
    return 0.0;
  }

  /** Placeholder channel-current getter. */
  public double getChannelCurrent(int channel) {
    // TODO: Read current for the requested PDH/PDP channel.
    return 0.0;
  }

  /** Placeholder brownout-state getter. */
  public boolean isBrownoutDetected() {
    // TODO: Check RobotController or driver station state as appropriate.
    return false;
  }

  /** Placeholder low-battery hook. */
  public boolean isLowBattery() {
    // TODO: Compare battery voltage with a team-selected minimum threshold.
    return false;
  }

  /** Placeholder for high-current warning logic. */
  public boolean isCurrentWarning() {
    // TODO: Compare total or channel current with team-selected thresholds.
    return false;
  }
}
