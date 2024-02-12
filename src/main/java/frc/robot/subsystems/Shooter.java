// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import frc.robot.Constants.PneumaticsConstants;
import frc.robot.Constants.pneumaticportconstants;
import frc.robot.commands.ShootFull;
public class Shooter extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private WPI_VictorSPX shootSpeed = new WPI_VictorSPX(5);
  private DoubleSolenoid  beltSqushTop1 ;
  private DoubleSolenoid  beltSqushTop2 ;
  public Shooter() {
    beltSqushTop1 = new DoubleSolenoid(PneumaticsConstants.kModule1 , PneumaticsModuleType.CTREPCM, pneumaticportconstants.kport5 , pneumaticportconstants.kport6);
    beltSqushTop2 = new DoubleSolenoid(PneumaticsConstants.kModule1 , PneumaticsModuleType.CTREPCM, pneumaticportconstants.kport7 , pneumaticportconstants.kport8);
  }

   // pushes piston at shooter out.
   public void dump(){
  beltSqushTop1.set(Value.kForward);
  beltSqushTop2.set(Value.kForward);
  }

  // pulls piston at shooter in.
  public void undump(){
beltSqushTop1.set(Value.kReverse);
beltSqushTop2.set(Value.kReverse);
  }

  // makes the Shooter shoot at Quarter speed
  public void shoot(){
    shootSpeed.set(0.25);
    Commands.waitSeconds(1.5);
   shootSpeed.set(0.5);
    Commands.waitSeconds(1.5);
    shootSpeed.set(0.75);
    Commands.waitSeconds(1.5);
    shootSpeed.set(1);
  }

  // makes the Shooter shoot at full speed
  public void shootFast(){
    shootSpeed.set(1);
  }

  // stops shooter from shooting
  public void Stop(){
    shootSpeed.set(0);
  }
  
  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command ex() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  

  
    // Query some boolean state, such as a digital sensor.
    
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
