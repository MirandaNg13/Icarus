// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.ClimbLe;
import frc.robot.subsystems.ClimbR;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.SwerveModule;
import frc.robot.subsystems.Pickup;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.Constants.AutoConstants;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;


import frc.robot.commands.armsDownL;
import frc.robot.commands.armsDownR;
import frc.robot.commands.armsUpL;
import frc.robot.commands.armsUpR;
import frc.robot.commands.shootFast;
import frc.robot.commands.rollerSpinIn;
import frc.robot.commands.rollorSpinOut;
import frc.robot.commands.ShootLength;
import frc.robot.commands.PickupLength;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;


public class Autos extends SequentialCommandGroup {
/**
 * @param drive
 * @param Shoot
 * @param in
 */


  public Autos(DriveTrain drive, Shooter shoot, Pickup in) {
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