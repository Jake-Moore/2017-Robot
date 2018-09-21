//this code was made by team 3863 FIRST Robotics, Newbury Park, CA 91320
package frc.robot.subsytems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants;
import frc.robot.commands.*;

public class Drivetrain extends Subsystem{
    private TalonSRX mLeftA = new TalonSRX(Constants.kLeftA);
    private TalonSRX mLeftB = new TalonSRX(Constants.kLeftB);
    private TalonSRX mRightA = new TalonSRX(Constants.kRightA);
    private TalonSRX mRightB = new TalonSRX(Constants.kRightB);
    
    public Drivetrain(){
        mLeftB.follow(mLeftA);
        mRightB.follow(mRightA);
        mLeftA.setInverted(true);
        mLeftB.setInverted(true);
    }
    public void initDefaultCommand(){
        setDefaultCommand(new Drive());
    }
    public void setMotorPower(double left, double right){
        mLeftA.set(ControlMode.PercentOutput, left);
        mRightA.set(ControlMode.PercentOutput, right);
    }
}

