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

public class ClimbR extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
   public static Boolean Both = false;
  
    private final WPI_VictorSPX Rmotor1 = new WPI_VictorSPX(MotorConstants.kRClm1);
     private final WPI_VictorSPX Rmotor2 = new WPI_VictorSPX(MotorConstants.kRClm2);
     //PowerDistribution PowerDistribution = new PowerDistribution(1, ModuleType.kRev);
     
     //double current6 = PowerDistribution.getCurrent(6);
    // double current9 = PowerDistribution.getCurrent(9);
    // double currents4 = PowerDistribution.getCurrent(4);
     //double current5 = PowerDistribution.getCurrent(5);
    
     //private final MotorControllerGroup left = new MotorControllerGroup(Lmotor1, Lmotor2);
  public ClimbR() {}



  // right claw goes up.
  public void clawsUpR(){
   
    Rmotor1.set(-0.5);
    Rmotor2.set(-0.5);
  }

 // right claw goes down.
  public void clawsDownR(){
   
    Rmotor1.set(0.5);
    Rmotor2.set(0.5);
  }

  

  // right claw stops moving.
  public void StopR(){
    Rmotor1.set(0);
    Rmotor2.set(0);
  }
  
   // simplify volt controll
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
     
     //SmartDashboard.putNumber("Right One Voltage", voltRight1());
      //SmartDashboard.putNumber("Right two Voltage", voltRight2());
     
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
 
   /*public double voltRight1(){
    //double voltRight1 = PowerDistribution.getCurrent(4);
    return voltRight1;
  }
  public double voltRight2(){
    //double voltRight2 = PowerDistribution.getCurrent(5);
   // return voltRight2;
  }*/
}
