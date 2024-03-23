package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class DriveLength extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DriveTrain m_Drive;
  private final double m_Length;
  private final double m_Speed;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public DriveLength(double Length, double Speed, DriveTrain DriveTrain) {
    m_Length = Length; //backward 1 meters
    m_Drive = DriveTrain;
    m_Speed = Speed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(DriveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  m_Drive.resetEncoders();
  m_Drive.drive(m_Speed,0,0,false);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
   m_Drive.drive(m_Speed,0,0,false);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_Drive.drive(0,0,0,false);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return Math.abs(m_Drive.Distance()) >= m_Length;
  }
}
