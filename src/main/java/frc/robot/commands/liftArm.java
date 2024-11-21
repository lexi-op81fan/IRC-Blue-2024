package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class liftArm extends Command{
    Arm arm;
    double armSpeed;

    public liftArm(Arm arm, double armSpeed){
        this.arm = arm;
        this.armSpeed = armSpeed;
        addRequirements(arm);
    }
    @Override
    public void execute(){
       arm.liftArm(armSpeed);

    }
    @Override
    public void end(boolean i){
        arm.stop();

    }





}
