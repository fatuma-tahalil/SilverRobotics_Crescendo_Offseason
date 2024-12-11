// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.climberConstants;

public class ClimberSubsystem extends SubsystemBase {
  /** Creates a new ClimberSubsystem. */
  private final CANSparkMax leftClimber, rightClimber;

  public ClimberSubsystem() {
    leftClimber = new CANSparkMax(climberConstants.leftClimberDeviceID, MotorType.kBrushed);
    rightClimber = new CANSparkMax(climberConstants.rightClimberDeviceID, MotorType.kBrushed);

    leftClimber.follow(rightClimber); // Climbers should follow one another to stay synced

    leftClimber.restoreFactoryDefaults();
    rightClimber.restoreFactoryDefaults();
  }

  public void climb() {
    rightClimber.set(climberConstants.climberSpeed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void stop(){
    rightClimber.set(0);
  }
}
