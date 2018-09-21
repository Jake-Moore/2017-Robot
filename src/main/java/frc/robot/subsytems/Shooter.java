//this code was made by team 3863 FIRST Robotics, Newbury Park, CA 91320
package frc.robot.subsytems;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem{
    private TalonSRX mLeftShooter, mRightShooter;
    public Shooter(){
        mLeftShooter = new TalonSRX(Constants.kLeftTalon);
        mRightShooter = new TalonSRX(Constants.kRightTalon);
    }
    public void initDefaultCommand(){
        
    }
    public void setRightTalon(double rightTalonSpeed){
        mRightShooter.set(ControlMode.PercentOutput, rightTalonSpeed);
    }
    public void setLeftTalon(double leftTalonSpeed){
        mLeftShooter.set(ControlMode.PercentOutput, leftTalonSpeed);
    }
}


