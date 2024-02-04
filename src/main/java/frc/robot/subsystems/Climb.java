// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.Constants.MotorConstants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Climb extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final WPI_VictorSPX Lmotor1 = new WPI_VictorSPX(MotorConstants.kLClm1);
   private final WPI_VictorSPX Lmotor2 = new WPI_VictorSPX(MotorConstants.kLClm2);
    private final WPI_VictorSPX Rmotor1 = new WPI_VictorSPX(MotorConstants.kRClm1);
     private final WPI_VictorSPX Rmotor2 = new WPI_VictorSPX(MotorConstants.kRClm2);

     //private final MotorControllerGroup left = new MotorControllerGroup(Lmotor1, Lmotor2);
  public Climb() {}

// left claw goes up.
  public void clawsUpL(){
    Lmotor1.set(0.5);
    Lmotor2.set(0.5);
   
  }

// left claw goes down.
  public void clawsDownL(){
    Lmotor1.set(-0.5);
    Lmotor2.set(-0.5);
   
  }

  // right claw goes up.
  public void clawsUpR(){
   
    Rmotor1.set(0.5);
    Rmotor2.set(0.5);
  }

 // right claw goes down.
  public void clawsDownR(){
   
    Rmotor1.set(-0.5);
    Rmotor2.set(-0.5);
  }

  // left claw stops moving.
  public void StopL(){
    Lmotor1.set(0);
    Lmotor2.set(0);
   
  }

  // right claw stops moving.
  public void StopR(){
    Rmotor1.set(0);
    Rmotor2.set(0);
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
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}