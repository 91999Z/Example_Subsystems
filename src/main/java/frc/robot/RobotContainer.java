package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.*;

/**
 * Composition root for robot subsystems, operator interfaces, and future command bindings.
 *
 * <p>All subsystem instances are safe, inert placeholders. Remove unused instances as a robot
 * design takes shape; keep only the drivetrain type and mechanisms actually used by the robot.
 */
public class RobotContainer {
  // Subsystem placeholders: remove mechanisms this robot does not use.
  private final DrivetrainSubsystem drivetrainSubsystem = new DrivetrainSubsystem();
  private final SwerveSubsystem swerveSubsystem = new SwerveSubsystem();
  private final TankDriveSubsystem tankDriveSubsystem = new TankDriveSubsystem();
  private final ArmSubsystem armSubsystem = new ArmSubsystem();
  private final ElevatorSubsystem elevatorSubsystem = new ElevatorSubsystem();
  private final WristSubsystem wristSubsystem = new WristSubsystem();
  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
  private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
  private final FeederSubsystem feederSubsystem = new FeederSubsystem();
  private final ClimberSubsystem climberSubsystem = new ClimberSubsystem();
  private final TurretSubsystem turretSubsystem = new TurretSubsystem();
  private final VisionSubsystem visionSubsystem = new VisionSubsystem();
  private final LEDSubsystem ledSubsystem = new LEDSubsystem();
  private final PneumaticsSubsystem pneumaticsSubsystem = new PneumaticsSubsystem();
  private final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();

  // Requested cross-cutting subsystem additions.
  private final LocalizationSubsystem localizationSubsystem = new LocalizationSubsystem();
  private final GyroSubsystem gyroSubsystem = new GyroSubsystem();
  private final PowerSubsystem powerSubsystem = new PowerSubsystem();
  private final TelemetrySubsystem telemetrySubsystem = new TelemetrySubsystem();
  private final DiagnosticsSubsystem diagnosticsSubsystem = new DiagnosticsSubsystem();
  private final LimelightSubsystem limelightSubsystem = new LimelightSubsystem();
  private final PhotonVisionSubsystem photonVisionSubsystem = new PhotonVisionSubsystem();
  private final GamePieceDetectionSubsystem gamePieceDetectionSubsystem =
      new GamePieceDetectionSubsystem();
  private final ManipulatorSubsystem manipulatorSubsystem = new ManipulatorSubsystem();
  private final SwerveModuleSubsystem swerveModuleSubsystem = new SwerveModuleSubsystem();

  // Operator interface placeholder.
  private final CommandXboxController driverController =
      new CommandXboxController(Constants.OperatorConstants.DRIVER_CONTROLLER_PORT);
  // Optional second controller: // private final CommandXboxController operatorController =
  //     new CommandXboxController(Constants.OperatorConstants.OPERATOR_CONTROLLER_PORT);

  /** Creates subsystem placeholders and future command bindings. */
  public RobotContainer() {
    configureBindings();

    // Default commands location:
    // TODO: Set default commands here, commonly after creating a drive or mechanism command.
    // Example: drivetrainSubsystem.setDefaultCommand(new ExampleDriveCommand(drivetrainSubsystem));

    // Autonomous integration location:
    // TODO: Add autonomous chooser integration here; keep routines out of subsystem constructors.
  }

  /**
   * Controller bindings location.
   *
   * <p>Use onTrue, whileTrue, toggleOnTrue, and other trigger bindings here once commands exist.
   * Keep real hardware setup in the subsystems and composition only in this container.
   */
  private void configureBindings() {
    // TODO: Add controller bindings here after selecting the active subsystems.
    // Example: driverController.a().onTrue(new ExampleCommand(exampleSubsystem));

    // References keep template instances explicit. Remove these statements for unused subsystems.
    drivetrainSubsystem.getClass();
    swerveSubsystem.getClass();
    tankDriveSubsystem.getClass();
    armSubsystem.getClass();
    elevatorSubsystem.getClass();
    wristSubsystem.getClass();
    intakeSubsystem.getClass();
    shooterSubsystem.getClass();
    feederSubsystem.getClass();
    climberSubsystem.getClass();
    turretSubsystem.getClass();
    visionSubsystem.getClass();
    ledSubsystem.getClass();
    pneumaticsSubsystem.getClass();
    exampleSubsystem.getClass();
    localizationSubsystem.getClass();
    gyroSubsystem.getClass();
    powerSubsystem.getClass();
    telemetrySubsystem.getClass();
    diagnosticsSubsystem.getClass();
    limelightSubsystem.getClass();
    photonVisionSubsystem.getClass();
    gamePieceDetectionSubsystem.getClass();
    manipulatorSubsystem.getClass();
    swerveModuleSubsystem.getClass();
  }
}
