// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.SwerveModule;

import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.Constants.AutoConstants;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;



import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;


public class Autos extends SequentialCommandGroup {
/**
 * @param drive
 * 
 */


  public Autos(DriveTrain drive) {
    addCommands(
    //new ShootLength (shoot, in)
    new DriveLength(AutoConstants.kDriveFor, AutoConstants.kDriveSpeed ,drive)
    //new PickupLength (AutoConstants.KPikUpFor, in)
    
    );
  }

 // private Auto() {
  //  throw new UnsupportedOperationException("This is a utility class!");
  //}


@Override
public boolean runsWhenDisabled() {
   
    return false;


}
}