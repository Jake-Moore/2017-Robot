//this code was made by team 3863 FIRST Robotics, Newbury Park, CA 91320
package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClimberBackward extends Command{
    public ClimberBackward(){
        requires(Robot.kClimber);
    }
    protected void initialize(){
        
    }
    protected void execute(){
        Robot.kClimber.setClimberSpeed(-1);
    }
    protected boolean isFinished(){
        return true;
    }
    protected void end(){

    }
    protected void interrupted(){

    }
}

