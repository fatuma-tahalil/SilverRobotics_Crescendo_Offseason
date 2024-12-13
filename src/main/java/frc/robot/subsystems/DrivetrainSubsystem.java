// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriverConstants;

public class DrivetrainSubsystem extends SubsystemBase{


  private final CANSparkMax rightUpMotor, rightDownMotor, leftUpMotor, leftDownMotor;

  private DifferentialDrive differentialDrive = null; 

  public DrivetrainSubsystem() {
    rightUpMotor = new CANSparkMax(DriverConstants.rightUpDeviceID, MotorType.kBrushed);
    rightDownMotor = new CANSparkMax(DriverConstants.rightDownDeviceID, MotorType.kBrushed);
    leftUpMotor = new CANSparkMax(DriverConstants.leftUpDeviceID, MotorType.kBrushed);
    leftDownMotor = new CANSparkMax(DriverConstants.leftDownDeviceID, MotorType.kBrushed);

    rightDownMotor.follow(rightUpMotor);
    leftDownMotor.follow(leftUpMotor);
    
    differentialDrive = new DifferentialDrive(leftUpMotor, rightUpMotor);

    rightUpMotor.restoreFactoryDefaults();
    leftUpMotor.restoreFactoryDefaults();
    rightDownMotor.restoreFactoryDefaults();
    leftDownMotor.restoreFactoryDefaults();
  }

  public void drive(double moveSpeed, double rotateSpeed) {
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }
 @Override
  public void periodic() {
    // This method will be called once per scheduler run

    // Safety code and dashboard updates go here
    }

  public void stop() {
    differentialDrive.arcadeDrive(0,0);
  }
}