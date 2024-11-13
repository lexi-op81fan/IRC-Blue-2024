package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase{
    //Declare motor controllers
    VictorSP leftMotor;
    VictorSP rightMotor;

    //Constructor
    public Drivetrain(){
        //placeholder channel until confirmed in roboRIO
        leftMotor = new VictorSP(0);
        rightMotor = new VictorSP(1);
        //make sure robot drives straight!!!
        leftMotor.setInverted(true);
    }
         public void drive(double leftSpeed, double rightSpeed){
            leftMotor.set(leftSpeed);
            rightMotor.set(rightSpeed);
        }

        public void stop(){
            leftMotor.stopMotor();
            rightMotor.stopMotor();
        }

        


}
