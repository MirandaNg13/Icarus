// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import frc.robot.Constants.PneumaticsConstants;
import frc.robot.Constants.pneumaticportconstants;
import frc.robot.Constants.MotorConstants;
import edu.wpi.first.wpilibj.Encoder; 
//import edu.wpi.first.wpilibj.Relay;
public class PickupPiston extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  //private WPI_VictorSPX goInOut = new WPI_VictorSPX(MotorConstants.kPick);
  private DoubleSolenoid Intake1;
 
  
  public PickupPiston() {
   

    Intake1 = new DoubleSolenoid(PneumaticsConstants.kModule1, PneumaticsModuleType.CTREPCM, pneumaticportconstants.kPFport1 , pneumaticportconstants.kPRport1);
    
  }

  // pushes out piston at intake.
  public void drop(){
  Intake1.set(Value.kForward);
  
  }

  // pulls in piston at intake.
  public void undrop(){
  Intake1.set(Value.kReverse);
  
  }
/*
  // makes intake go inward, pulling in notes.
  public void Eat(){
    goInOut.set(0.5);
  }

  // makes intake go out, pushing out notes.
  public void Spit(){
    goInOut.set(-1);
  }
  
  // stops intake.
  public void Stop(){
    goInOut.set(0);
  }

*/
  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
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
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
