//this code was made by team 3863 FIRST Robotics, Newbury Park, CA 91320
package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.Constants;
import frc.robot.commands.SetShooterSpeed;
import frc.robot.commands.ClimberForward;
import frc.robot.commands.ClimberBackward;
import edu.wpi.first.wpilibj.buttons.Button;

public class OI{
    private Joystick stick;
    public Button shooterButton = new JoystickButton(stick, Constants.kShooterButton);
    public Button climberForward = new JoystickButton(stick, Constants.kClimberForward);
    public Button climberBackward = new JoystickButton(stick, Constants.kClimberBackward);
    public OI(){ //CONTRUCTOR
        shooterButton.whenPressed(new SetShooterSpeed(1, 1));
        climberForward.whileHeld(new ClimberForward());
        climberBackward.whileHeld(new ClimberBackward());
        stick = new Joystick(Constants.kJoystickPort);
    }
    public double getLeftXAxis(){
        return stick.getRawAxis(Constants.kJoystickLeftXAxis);
    }
    public double getLeftYAxis(){
        return stick.getRawAxis(Constants.kJoystickLeftYAxis);
    }
    public double getRightYAxis(){
        return stick.getRawAxis(Constants.kJoystickRightYAxis);
    }
    public double getRightXAxis(){
        return stick.getRawAxis(Constants.kJoystickRightXAxis);
    }

}

