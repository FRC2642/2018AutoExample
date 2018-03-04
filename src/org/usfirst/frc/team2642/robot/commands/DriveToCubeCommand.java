package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;
import org.usfirst.frc.team2642.robot.utilities.PIDCorrection;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveToCubeCommand extends Command {
	double basePower;
	double distance;
	double leftPower;
	double rightPower;
	PIDCorrection pixyCorrection = new PIDCorrection(0.005);
	PIDCorrection sonarCorrection = new PIDCorrection(0.006);
	
    public DriveToCubeCommand(double basePower, double distance) {
        requires(Robot.sonar);
        requires(Robot.pixy);
        requires(Robot.drive);
        this.basePower = basePower;
        this.distance = distance;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double currentHeading = Robot.pixy.getCubeCenter();
    	double headingCorrection = pixyCorrection.calculateCorrection(140, currentHeading);
    	double currentDistance = Robot.sonar.getDistance();
    	double powerCorrection = pixyCorrection.calculateCorrection(distance, currentDistance);
    	if (headingCorrection > .25) {
    		headingCorrection = .25;
    	}
    	if(powerCorrection > .25) {
    		powerCorrection = .25;
    	}
    	double power = basePower + powerCorrection;
    	if (Robot.pixy.getCubeCenter() < 150) {
    		leftPower = (power - headingCorrection);
    		rightPower = (power+ headingCorrection);
    	}
    	else if (Robot.pixy.getCubeCenter() > 130) {
    		leftPower = (power + headingCorrection);
    		rightPower = (power - headingCorrection);
    	}
    	else {
    		leftPower = power;
    		rightPower = power;
    	}
    	Robot.drive.tankMove(leftPower, rightPower);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (Robot.sonar.getDistance() < distance);
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
