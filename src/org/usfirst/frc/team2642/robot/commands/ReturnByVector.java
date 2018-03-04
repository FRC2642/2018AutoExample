package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;
import org.usfirst.frc.team2642.robot.utilities.PIDCorrection;
import org.usfirst.frc.team2642.robot.utilities.VectorValues;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ReturnByVector extends Command {
	PIDCorrection pidCorrection = new PIDCorrection(0.008);
	double setPoint;
	double basePower;
	double targetDistance;
	double correction;
	
    public ReturnByVector(double basePower) {
    	requires(Robot.drive);
    	this.basePower = basePower;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.setPoint = VectorValues.getAngle();
    	this.targetDistance = VectorValues.getMagnitude();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double currentHeading = Robot.drive.getCurrentHeading();
    	double correction = pidCorrection.calculateCorrection(setPoint, currentHeading);
    	double leftPower = basePower;
    	double rightPower = basePower;
	    	if (setPoint < currentHeading)
	    	{
	    		leftPower -= correction;
	    		rightPower += correction;
	    	}
	    	else
	    	{
	    		leftPower += correction;
	    		rightPower -= correction;
	    	}
    	Robot.drive.tankMove(leftPower, rightPower);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (Robot.drive.getDistance() >= targetDistance);
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
