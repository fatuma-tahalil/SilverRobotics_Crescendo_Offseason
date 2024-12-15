package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import static frc.robot.Constants.IntakeConstants;
import frc.robot.subsystems.IntakeSubsystem;
public class IntakeCommand extends Command {
    private final Joystick joystick; 
    private final IntakeSubsystem intake; 

    public IntakeCommand(IntakeSubsystem intake, Joystick controller) {
        joystick = controller;
        this.intake = intake;  
        addRequirements(intake);
    } 
    @Override
    public void execute() { 
    //If the button specified in the constants is pressed, begin the intake motor.  
        if (joystick.getRawButtonPressed(IntakeConstants.INTAKE_BUTTON)) {
            intake.intake();  
        }  
        // Add an else to stop
        if (joystick.getRawButtonReleased(IntakeConstants.INTAKE_BUTTON)) {
            intake.stop();
        }

    } 
    @Override
    public void end(boolean interrupted) {
        intake.stop();
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
