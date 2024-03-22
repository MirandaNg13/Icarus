package frc.robot.commands;

import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Pickup;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj.Timer;

public class ShootLength extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Shooter m_Shooter;
  private final Pickup m_Pickup;
  private final Timer m_timer = new Timer();
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ShootLength( Shooter Shooter, Pickup Pickup) {
   // m_Length = Length;
    m_Shooter = Shooter;
    m_Pickup = Pickup;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  m_timer.reset();
  m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_timer.get()<4){
      m_Shooter.shoot();
     if(m_timer.get()>1.5){
      m_Pickup.Spit();
    }
    } else if (m_timer.get()>4){
      m_Pickup.Stop();
      m_Shooter.Stop();
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_Shooter.Stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_timer.get() >= 5;
    //return (true);
  }
}
