//this code was made by team 3863 FIRST Robotics, Newbury Park, CA 91320
package frc.robot.subsytems;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem{
    private TalonSRX mLeftClimber, mRightClimber;
    public Climber(){
        mLeftClimber = new TalonSRX(Constants.kLeftClimber);
        mLeftClimber = new TalonSRX(Constants.kRightClimber);
        mLeftClimber.setInverted(true);
        mLeftClimber.follow(mRightClimber);
    }
    public void initDefaultCommand(){

    }
    public void setClimberSpeed(double ClimberSpeed){
        mRightClimber.set(ControlMode.PercentOutput, ClimberSpeed);
    }
}