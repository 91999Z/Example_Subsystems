package frc.robot;

/**
 * Central location for robot-wide and subsystem-specific constants.
 *
 * <p>Hardware IDs and tuning values are examples only and are intentionally commented out so the
 * project starts without vendor libraries or connected hardware. Define only values used by the
 * selected robot, and avoid reusing one CAN/DIO/analog/PCM port for unrelated devices.
 */
public final class Constants {
  private Constants() {}

  /** Placeholder ports for operator interfaces. */
  public static final class OperatorConstants {
    // USB port for the driver's controller; update to match the actual driver station setup.
    public static final int DRIVER_CONTROLLER_PORT = 0;

    private OperatorConstants() {}
  }

  // For each selected subsystem, uncomment and rename only the constants that apply.
  // Keep the units and physical constraints documented when real values are added.
  public static final class DrivetrainConstants {
    // CAN IDs: motor/controller addresses.
    // DIO ports: encoder, limit switch, or beam-break inputs.
    // Analog ports: analog sensor inputs.
    // PCM channels: pneumatic solenoid channels.
    // PID values: kP, kI, kD, and tolerance.
    // Feedforward values: kS, kV, and kA.
    // Physical limits: maximum speed, acceleration, and allowed travel.
    private DrivetrainConstants() {}
  }

  public static final class SwerveConstants {
    // CAN IDs: drive/steer motors and optional CANcoder modules.
    // DIO ports: optional digital inputs.
    // Analog ports: optional analog sensors.
    // PCM channels: optional pneumatics.
    // PID values: steering and drive controller gains.
    // Feedforward values: drive kS, kV, and kA.
    // Physical limits: module geometry, speed, and angular limits.
    private SwerveConstants() {}
  }

  public static final class TankDriveConstants {
    // CAN IDs: left/right motor controllers.
    // DIO ports: optional encoder, limit switch, or beam-break inputs.
    // Analog ports: optional analog sensor inputs.
    // PCM channels: optional pneumatic channels.
    // PID values: velocity and heading gains.
    // Feedforward values: kS, kV, and kA.
    // Physical limits: track width, maximum speed, and acceleration.
    private TankDriveConstants() {}
  }

  public static final class ArmConstants {
    // CAN IDs: arm motor and optional CANcoder.
    // DIO ports: limit switch or encoder inputs.
    // Analog ports: optional potentiometer input.
    // PCM channels: optional brake or pneumatic channels.
    // PID values: position controller gains.
    // Feedforward values: arm kS, kG, kV, and kA.
    // Physical limits: minimum and maximum arm angle.
    private ArmConstants() {}
  }

  public static final class ElevatorConstants {
    // CAN IDs: elevator motor and optional CANcoder.
    // DIO ports: limit switch, encoder, or beam-break inputs.
    // Analog ports: optional analog sensor inputs.
    // PCM channels: optional pneumatic channels.
    // PID values: height/position controller gains.
    // Feedforward values: elevator kS, kG, kV, and kA.
    // Physical limits: minimum and maximum elevator height.
    private ElevatorConstants() {}
  }

  public static final class WristConstants {
    // CAN IDs: wrist motor and optional CANcoder.
    // DIO ports: limit switch or encoder inputs.
    // Analog ports: optional absolute-position sensor.
    // PCM channels: optional pneumatic channels.
    // PID values: position controller gains.
    // Feedforward values: wrist kS, kG, kV, and kA.
    // Physical limits: minimum and maximum wrist angle.
    private WristConstants() {}
  }

  public static final class IntakeConstants {
    // CAN IDs: intake motor and optional CANcoder.
    // DIO ports: beam-break or limit switch inputs.
    // Analog ports: optional distance sensor input.
    // PCM channels: optional deployment solenoid.
    // PID values: optional roller speed gains.
    // Feedforward values: optional roller kS, kV, and kA.
    // Physical limits: roller speed and mechanism travel limits.
    private IntakeConstants() {}
  }

  public static final class ShooterConstants {
    // CAN IDs: shooter motor(s) and optional CANcoder.
    // DIO ports: optional encoder, limit switch, or beam-break inputs.
    // Analog ports: optional analog sensor inputs.
    // PCM channels: optional pneumatic channels.
    // PID values: flywheel velocity gains.
    // Feedforward values: flywheel kS, kV, and kA.
    // Physical limits: minimum/maximum speed and acceleration.
    private ShooterConstants() {}
  }

  public static final class FeederConstants {
    // CAN IDs: feeder motor and optional CANcoder.
    // DIO ports: beam-break or limit switch inputs.
    // Analog ports: optional distance sensor input.
    // PCM channels: optional pneumatic channels.
    // PID values: optional feeder speed gains.
    // Feedforward values: optional feeder kS, kV, and kA.
    // Physical limits: feeder speed and travel limits.
    private FeederConstants() {}
  }

  public static final class ClimberConstants {
    // CAN IDs: climber motor(s) and optional CANcoder.
    // DIO ports: limit switch or encoder inputs.
    // Analog ports: optional potentiometer input.
    // PCM channels: optional ratchet solenoid.
    // PID values: position or velocity gains.
    // Feedforward values: climber kS, kG, kV, and kA.
    // Physical limits: minimum/maximum extension and load limits.
    private ClimberConstants() {}
  }

  public static final class TurretConstants {
    // CAN IDs: turret motor and optional CANcoder.
    // DIO ports: limit switch or encoder inputs.
    // Analog ports: optional analog sensor input.
    // PCM channels: optional pneumatic channels.
    // PID values: angular position gains.
    // Feedforward values: turret kS, kG, kV, and kA.
    // Physical limits: minimum/maximum angle and rotation range.
    private TurretConstants() {}
  }

  public static final class VisionConstants {
    // CAN IDs: optional sensor network IDs (camera configuration is typically network-based).
    // DIO ports: optional trigger or status inputs.
    // Analog ports: optional distance sensor input.
    // PCM channels: optional lighting/pneumatic channels.
    // PID values: optional aim-controller gains.
    // Feedforward values: optional aim feedforward values.
    // Physical limits: camera mounting geometry and accepted target ranges.
    private VisionConstants() {}
  }

  public static final class LEDConstants {
    // CAN IDs: optional LED controller address.
    // DIO ports: addressable LED PWM output.
    // Analog ports: optional analog inputs.
    // PCM channels: optional pneumatic channels.
    // PID values: generally unused; document any closed-loop brightness behavior.
    // Feedforward values: generally unused; document any output compensation.
    // Physical limits: strip length, brightness range, and animation bounds.
    private LEDConstants() {}
  }

  public static final class PneumaticsConstants {
    // CAN IDs: optional pneumatic hub/module address.
    // DIO ports: optional pressure/status input.
    // Analog ports: optional pressure transducer input.
    // PCM channels: solenoid channels.
    // PID values: generally unused; document pressure-control gains if applicable.
    // Feedforward values: generally unused; document compressor behavior if applicable.
    // Physical limits: pressure operating range and compressor limits.
    private PneumaticsConstants() {}
  }

  public static final class ExampleConstants {
    // CAN IDs: example motor/controller address.
    // DIO ports: example encoder, limit switch, or beam-break input.
    // Analog ports: example analog sensor input.
    // PCM channels: example pneumatic channel.
    // PID values: example kP, kI, kD, and tolerance.
    // Feedforward values: example kS, kV, and kA.
    // Physical limits: example minimum/maximum mechanism values.
    private ExampleConstants() {}
  }
}
