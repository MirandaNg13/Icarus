// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.Constants.MotorConstants;
import edu.wpi.first.units.Current;
import edu.wpi.first.wpilibj.PowerDistribution;
import edu.wpi.first.wpilibj.PowerDistribution.ModuleType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class ClimbLe extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final WPI_VictorSPX Lmotor1 = new WPI_VictorSPX(MotorConstants.kLClm1);
   private final WPI_VictorSPX Lmotor2 = new WPI_VictorSPX(MotorConstants.kLClm2);
    
     //PowerDistribution PowerDistribution = new PowerDistribution(1, ModuleType.kRev);
     
     //double current6 = PowerDistribution.getCurrent(6);
    // double current9 = PowerDistribution.getCurrent(9);
    // double currents4 = PowerDistribution.getCurrent(4);
     //double current5 = PowerDistribution.getCurrent(5);
    
     //private final MotorControllerGroup left = new MotorControllerGroup(Lmotor1, Lmotor2);
  public ClimbLe() {}

// left claw goes up.
  public void clawsUpL(){
    Lmotor1.set(-0.5);
    Lmotor2.set(-0.5);
  }

// left claw goes down.
  public void clawsDownL(){
    Lmotor1.set(0.5);
    Lmotor2.set(0.5);
   
  }

 

  // left claw stops moving.
  public void StopL(){
    Lmotor1.set(0);
    Lmotor2.set(0);
   
  }

 
   
  
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
    // SmartDashboard.putNumber("Left One Voltage", voltLeft1());
    // SmartDashboard.putNumber("Left two Voltage", voltLeft2());
     
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
 /*  public double voltLeft1(){
    double voltLeft1 = PowerDistribution.getCurrent(5);
    return voltLeft1;
  }
   public double voltLeft2(){
    double voltLeft2 = PowerDistribution.getCurrent(6);
    return voltLeft2;
  }
  */
}
