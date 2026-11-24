package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.ClimberSubsystem;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.FeederSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LEDSubsystem;
import frc.robot.subsystems.PneumaticsSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.SwerveSubsystem;
import frc.robot.subsystems.TankDriveSubsystem;
import frc.robot.subsystems.TurretSubsystem;
import frc.robot.subsystems.VisionSubsystem;
import frc.robot.subsystems.WristSubsystem;

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

  // Operator interface placeholder. This object does not access hardware until bindings are added.
  private final CommandXboxController driverController =
      new CommandXboxController(Constants.OperatorConstants.DRIVER_CONTROLLER_PORT);
  // Optional second controller example:
  // private final CommandXboxController operatorController = new CommandXboxController(1);

  /** Creates the robot's subsystem and operator-interface placeholders. */
  public RobotContainer() {
    configureBindings();
  }

  /**
   * Add button-to-command bindings here when commands are introduced.
   *
   * <p>For example, bind a controller trigger to a command that requires the selected subsystem.
   * Keep bindings out of subsystem constructors.
   */
  private void configureBindings() {
    // TODO: Add controller bindings here after selecting the robot's active subsystems.
    // Example: driverController.a().onTrue(new ExampleCommand(exampleSubsystem));
    // TODO: Remove this reference if the driver controller placeholder is not needed.
    driverController.getHID();

    // References keep all template subsystem instances explicit in this composition root.
    // Remove these statements together with any unused subsystem fields above.
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
  }
}
