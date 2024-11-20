package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class arm extends SubsystemBase {
    VictorSP armMotor;

    //Constructor
    public arm(){
        //placeholder channel until confirmed in roboRIO
        armMotor = new VictorSP(3);

        //make sure robot drives straight!!!
        //armMotor.setInverted(true);
    }

    public void liftArm(double armSpeed){
        armMotor.set(armSpeed);
    }

    public void stop(){
        armMotor.stopMotor();
    }

}