package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;



public class SetShooterSpeed extends Command{
    double left, right;
    public SetShooterSpeed(double left, double right){
        requires(Robot.kShooter);
        this.left = left;
        this.right = right;
    }
    protected void initialize(){
        
    }
    protected void execute(){
        Robot.kShooter.setLeftTalon(left);
        Robot.kShooter.setRightTalon(right);
    }
    protected boolean isFinished(){
        return true;
    }
    protected void end(){

    }
    protected void interrupted(){

    }
}
