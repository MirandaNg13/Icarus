// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.PowerDistribution;
import edu.wpi.first.wpilibj.PowerDistribution.ModuleType;
import frc.robot.Constants.PneumaticsConstants;
import frc.robot.Constants.pneumaticportconstants;
import frc.robot.Constants.MotorConstants;
import edu.wpi.first.wpilibj.Encoder; 

public class Shooter extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private WPI_VictorSPX shootSpeed = new WPI_VictorSPX( MotorConstants.kShoot );
  private DoubleSolenoid  ShootDown1 ;
  private DoubleSolenoid  ShootDown2 ;
  

  public Shooter() {
    

    ShootDown1 = new DoubleSolenoid(PneumaticsConstants.kModule1, PneumaticsModuleType.CTREPCM, pneumaticportconstants.kSFport1 , pneumaticportconstants.kSRport1);
    ShootDown2 = new DoubleSolenoid(PneumaticsConstants.kModule1, PneumaticsModuleType.CTREPCM, pneumaticportconstants.kSFport2, pneumaticportconstants.kSRport2);
  }

   // pushes piston at shooter out.
   public void dump(){
  ShootDown1.set(Value.kForward);
  ShootDown2.set(Value.kForward);
  }

  // pulls piston at shooter in.
  public void undump(){
ShootDown1.set(Value.kReverse);
ShootDown2.set(Value.kReverse);
  }

  // makes the Shooter shoot at full speed
  public void shoot(){
    shootSpeed.set(-1);
  }
// shoot at quarter speed
public void shootsmall(){
  shootSpeed.set(-0.25);
}
  // reverses Shooter
public void shootReverse(){
  shootSpeed.set(0.75);
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
