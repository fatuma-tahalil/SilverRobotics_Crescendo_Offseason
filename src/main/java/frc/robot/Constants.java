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
public final class Constants {
  public static class OperatorConstants {
    public static int controllerPort = 0;  
  }
  
  public static class autoConstants{
    // Input auto constants
  }
  public static class driverConstants{
    public static int rightUpDeviceID = 1; 
    public static int leftUpDeviceID = 3;
    public static int rightDownDeviceID = 2; 
    public static int leftDownDeviceID = 4;

    public static int controllerPort = 1;
    public static double driveSpeed = 1.00;
    public static int axisX = 4;
    public static int axisY = 1;
    public static double rate_limit = 0.5;
  }

  public static class intakeConstants{
    public static int intakeDeviceID = 8; 
    public static double intakeSpeed = 0.15; //WHATEVER YOU DO, DO NOT SET THIS TO 1!!!
    public static int intakeButton = 2; 
  }

  public static class climberConstants{
    // Input climber constants
  }

  public static class shooterConstants{
    public static int shooterPort = 0;
    public static int shooterUpDeviceID = 5; 
    public static int shooterDownDeviceID = 6;
    public static double waitTime = 1;
    public static int shootButton1 = 5;
    public static int shootButton2 = 6;

    public static double shooterSpeed = 1.00;
  }
}
