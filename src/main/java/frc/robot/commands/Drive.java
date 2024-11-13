package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class Drive extends Command{
    private Drivetrain drivetrain;
    private Joystick leftStick;
    private Joystick rightStick;

    public Drive(Drivetrain drivetrain, Joystick leftStick, Joystick rightStick){
        this.drivetrain = drivetrain;
        this.leftStick = leftStick;
        this.rightStick = rightStick;
        addRequirements(drivetrain);
    }
    @Override
    public void execute(){
        drivetrain.drive(leftStick.getY(), rightStick.getY());
        
    }
    @Override
    public void end(boolean interrupted){
        drivetrain.stop();
    }
    
}
