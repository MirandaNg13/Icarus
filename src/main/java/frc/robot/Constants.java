// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static class MotorConstants {
    // climbing motor channels.
    public static final int kRClm1 = 16;
    public static final int kRClm2 = 12;
    public static final int kLClm1 = 9;
    public static final int kLClm2 = 11;
    // shoot channel
    public static final int kShoot = 17;
    // pick up channel
    public static final int kPick = 8;
  }
  public static class PneumaticsConstants{
    public static final int kModule1 = 18;
    //public static final int kModule2 = 2;
  }
  public static class pneumaticportconstants{
    // Pickup Piston
    public static final int kPFport1 =1;
    public static final int kPRport1 =2;
    
    // Shooter Dump
    public static final int kSFport1 =3;
    public static final int kSRport1 =4;
    public static final int kSFport2 =5;
    public static final int kSRport2 =6;
  }
  public static class AutoConstants{
    public static final double kDriveFor = 4;
    public static final double kDriveSpeed = 0.25;
    public static final double kShootFor = 5;
    public static final double KPikUpFor = 5;

  }
  public static class SwerveConstants{
    public static final int kAngleEncoderResolution = 400; //see https://www.andymark.com/products/hall-effect-two-channel-encoder
    public static final int kDriveEncoderResolution = 4096; // neo brushless settings in rev can id setting
  
    public static final double kModuleMaxAngularVelocity = DriveConstants.kMaxAngularSpeed;
    public static final double kModuleMaxAngularAcceleration =
        2 * Math.PI; // radians per second squared
        
    public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
    public static final int kDrivingMotorPinionTeeth = 12;
    public static final double kDrivingMotorReduction = (40.0 * 20) / (kDrivingMotorPinionTeeth * 40);
    public static final double kDrivingEncoderPositionFactor = (kWheelDiameterMeters * Math.PI)
        / kDrivingMotorReduction; // meters
    public static final double kDrivingEncoderVelocityFactor = ((kWheelDiameterMeters * Math.PI)
        / kDrivingMotorReduction) / 60.0; // meters per second    
    public static final double driveGainP = 0.1;
    public static final double driveGainI = 0;
    public static final double driveGainD = 0;
    public static final double turnGainP = 0.3;
    public static final double turnGainI = 0;
    public static final double turnGainD = 0;
  }

  public static class DriveConstants {
    public static final double kMaxSpeed = 3.0; // 3 meters per second
    public static final double kMaxAngularSpeed = Math.PI; // 1/2 rotation per second
    public static final double kDriveDeadband = 0.05;

    public static final double kFrontLeftChassisAngularOffset = 0;
    public static final double kFrontRightChassisAngularOffset = 0;
    public static final double kBackLeftChassisAngularOffset = 0;
    public static final double kBackRightChassisAngularOffset = 0;
    // just to make the runcommand work in robot container, I think this is the wanted value.
    public static final boolean kTeleField = true;

  }

  public static class ControlSystem {
    // Driving motor CAN IDs
    public static final int kLeftFrontDrive = 2;
    public static final int kLeftBackDrive = 4;
    public static final int kRightFrontDrive = 1;
    public static final int kRightBackDrive = 3;
    // Turning motors
    public static final int kLeftFrontTurn = 10;
    public static final int kLeftBackTurn = 14;
    public static final int kRightFrontTurn = 13;
    public static final int kRightBackTurn = 15;
// no idea if I should swap the A and Bs.
    public static final int kLFturnA = 2;
    public static final int kLFturnB = 3;
    public static final int kLBturnA = 0;
    public static final int kLBturnB = 1;
    public static final int kRFturnA = 6;
    public static final int kRFturnB = 7;
    public static final int kRBturnA = 4;
    public static final int kRBturnB = 5;
  }
}
