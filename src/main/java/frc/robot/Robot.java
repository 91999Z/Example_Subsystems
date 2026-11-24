package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

/**
 * Main WPILib robot lifecycle class.
 *
 * <p>Keep this class focused on lifecycle integration. Robot behavior and subsystem selection
 * belong in {@link RobotContainer} and future command classes.
 */
public class Robot extends TimedRobot {
  private RobotContainer robotContainer;

  @Override
  public void robotInit() {
    robotContainer = new RobotContainer();
  }

  @Override
  public void robotPeriodic() {
    // Runs subsystem periodic methods and any future command-based bindings.
    CommandScheduler.getInstance().run();
  }
}
