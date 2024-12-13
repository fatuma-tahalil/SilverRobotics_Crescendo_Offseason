// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */

 /*  TODO: Make all constant start with an uppercase letter
   TODO: Make the class name start with an uppercasse letter 
   */
public final class Constants {
  public static class OperatorConstants {
    public static int controllerPort = 0;  
  }
  
  public static class AutoConstants{
    // Input auto constants
  }
  public static class DriverConstants{
    public static int rightUpDeviceID = 1; 
    public static int leftUpDeviceID = 3;
    public static int rightDownDeviceID = 2; 
    public static int leftDownDeviceID = 4;

    public static int controllerPort = 1;
    public static double driveSpeed = 1.00;
    public static int axisX = 2;
    public static int axisY = 1;
    public static double rate_limit = 0.5;
  }

  public static class IntakeConstants{
    public static int intakeDeviceID = 8; 
    public static double intakeSpeed = 0.15; //WHATEVER YOU DO, DO NOT SET THIS TO 1!!!
    public static int intakeButton = 2; // PLACEHOLDER VALUE
  }

  public static class ClimberConstants{
    // Input climber constants
    public static int rightClimberDeviceID = 9;
    public static int leftClimberDeviceID = 10;
    public static int climberButton = 3;
    public static double climberSpeed = 0.6; // To be determined
  }

  public static class ShooterConstants{
    public static int shooterPort = 0;
    public static int shooterUpDeviceID = 5; 
    public static int shooterDownDeviceID = 6;
    public static double waitTime = 1;
    public static int shootButton1 = 5;
    public static int shootButton2 = 6;

    public static double shooterSpeed = 1.00;
  }
}
