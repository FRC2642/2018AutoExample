package org.usfirst.frc.team2642.robot.commands.commandgroups;

import org.usfirst.frc.team2642.robot.commands.DriveByGyro;
import org.usfirst.frc.team2642.robot.commands.DriveToCubeCommand;
import org.usfirst.frc.team2642.robot.commands.FindCubeCommand;
import org.usfirst.frc.team2642.robot.commands.PlaceHolderCommand;
import org.usfirst.frc.team2642.robot.commands.TurnByGyro;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterStartAutoCommandGroup extends CommandGroup {

    public CenterStartAutoCommandGroup() {
    	//basic right side switch (front of switch)
    	/*addSequential(new PlaceHolderCommand(.1));
    	addSequential(new DriveByGyro(0, .7, 12, false));
    	addSequential(new DriveByGyro(50, .7, 96, false));
    	addSequential(new DriveByGyro(0, .6, 18, false));
    	addSequential(new TurnByGyro(0, 2));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(0, -.7, 60, false));
    	addSequential(new TurnByGyro(-55, 2));
    	addSequential(new DriveByGyro(-55, .7, 48, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(-90, -.7, 25, false));
    	addSequential(new DriveByGyro(-110, .7, 72, false));
    	addSequential(new TurnByGyro(-180, 2));
    	addSequential(new DriveByGyro(-180, .7, 12, false));*/
    	
    	//basic left side switch (front of switch)
    	/*addSequential(new PlaceHolderCommand(.1));
    	addSequential(new DriveByGyro(0, .7, 12, false));
    	addSequential(new DriveByGyro(-50, .7, 66, false));
    	addSequential(new DriveByGyro(0, .6, 36, false));
    	addSequential(new TurnByGyro(0, 2));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(0, -.7, 54, false));
    	addSequential(new TurnByGyro(50, 2));
    	addSequential(new DriveByGyro(50, .7, 42, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(90, -.7, 25, false));
    	addSequential(new TurnByGyro(180, 2));
    	addSequential(new DriveByGyro(180, .7, 24, false));*/
    	
    	//(Basic left) go to left side of swich
    	/*addSequential(new DriveByGyro(0, .8, 6, false));
    	addSequential(new DriveByGyro(-60, .8, 113, false));
    	addSequential(new DriveByGyro(-50, .8, 2, false));
    	addSequential(new DriveByGyro(-40, .8, 2, false));
    	addSequential(new DriveByGyro(-30, .8, 2, false));
    	addSequential(new DriveByGyro(-20, .8, 2, false));
    	addSequential(new DriveByGyro(-10, .8, 2, false));
    	addSequential(new DriveByGyro(0, .8, 2, false));
    	addSequential(new DriveByGyro(0, .8, 66, false));
    	addSequential(new TurnByGyro(90, 3));
    	addSequential(new PlaceHolderCommand(.8));*/
    	
    	//Go to left scale from left side of switch (added to basic left)
    	/*addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .7, 55, false));
    	addSequential(new TurnByGyro(137, 2));
    	addSequential(new DriveByGyro(137, .7, 10, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new TurnByGyro(15, 2));
    	addSequential(new DriveByGyro(15, .7, 16, false));
    	addSequential(new DriveByGyro(5, .7, 26, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(0, -.8, 6, false));
    	addSequential(new DriveByGyro(0, -.8, 12, false));
    	addSequential(new PlaceHolderCommand(1.5));
    	addSequential(new TurnByGyro(135, 2));
    	addSequential(new DriveByGyro(135, .7, 24, false));*/
    	
    	
    	//go to right scale from left side of switch (added to basic left)
    	/*addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .8, 55, false));
    	addSequential(new TurnByGyro(137, 2));
    	addSequential(new DriveByGyro(137, .8, 14, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(120, -.8, 5, false));
    	addSequential(new DriveByGyro(110, -.8, 5, false));
    	addSequential(new DriveByGyro(100, -.8, 5, false));
    	addSequential(new TurnByGyro(90, 2));
    	addSequential(new DriveByGyro(90, .8, 66, false));
    	addSequential(new DriveByGyro(90, .6, 48, false));
    	addSequential(new DriveByGyro(90, .8, 42, false));
    	addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .7, 36, false));
    	addSequential(new PlaceHolderCommand(.8));*/
    	
    	//(Basic right) go to right side of switch
    	/*addSequential(new DriveByGyro(0, .8, 6, false));
    	addSequential(new DriveByGyro(60, .8, 132, false));
    	addSequential(new DriveByGyro(50, .8, 2, false));
    	addSequential(new DriveByGyro(40, .8, 2, false));
    	addSequential(new DriveByGyro(30, .8, 2, false));
    	addSequential(new DriveByGyro(20, .8, 2, false));
    	addSequential(new DriveByGyro(10, .8, 2, false));
    	addSequential(new DriveByGyro(0, .8, 2, false));
    	addSequential(new DriveByGyro(0, .8, 40, false));
    	addSequential(new TurnByGyro(-90, 3));
    	addSequential(new PlaceHolderCommand(.5));*/
    	
    	//go to left scale from right side of switch (added to basic right)
    	/*addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .8, 65, false));
    	addSequential(new TurnByGyro(-137, 2));
    	addSequential(new DriveByGyro(-137, .8, 18, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(-115, -.8, 2, false));
    	addSequential(new DriveByGyro(-100, -.8, 2, false));
    	addSequential(new TurnByGyro(-90, 2));
    	addSequential(new DriveByGyro(-90, .8, 75, false));
    	addSequential(new DriveByGyro(-90, .6, 50, false));
    	addSequential(new DriveByGyro(-90, .8, 47, false));
    	addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .8, 16, false));
    	addSequential(new PlaceHolderCommand(.8));*/
    	
    	//go to right scale from right side of switch (added to basic right)
    	/*addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .8, 55, false));
    	addSequential(new TurnByGyro(-137, 2));
    	addSequential(new DriveByGyro(-137, .8, 10, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new TurnByGyro(-25, 2));
    	addSequential(new DriveByGyro(-25, .8, 20, false));
    	addSequential(new DriveByGyro(-5, .8, 20, false));
    	addSequential(new TurnByGyro(-5, 2));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(0, -.8, 6, false));
    	addSequential(new DriveByGyro(0, -.8, 6, false));
    	addSequential(new PlaceHolderCommand(1.5));
    	addSequential(new TurnByGyro(-150, 2));
    	addSequential(new DriveByGyro(-150, .7, 24, false));*/
    	
    	//test vision
    	/*addSequential(new DriveByGyro(0, .8, 6, false));
    	addSequential(new DriveByGyro(-60, .8, 113, false));
    	addSequential(new DriveByGyro(-50, .8, 2, false));
    	addSequential(new DriveByGyro(-40, .8, 2, false));
    	addSequential(new DriveByGyro(-30, .8, 2, false));
    	addSequential(new DriveByGyro(-20, .8, 2, false));
    	addSequential(new DriveByGyro(-10, .8, 2, false));
    	addSequential(new DriveByGyro(0, .8, 2, false));
    	addSequential(new DriveByGyro(0, .8, 66, false));
    	addSequential(new TurnByGyro(90, 3));
    	addSequential(new PlaceHolderCommand(.8));
    	
    	addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .7, 55, false));
    	addSequential(new TurnByGyro(137, 2));*/
    	addSequential(new FindCubeCommand(.8, true));
    	addSequential(new DriveToCubeCommand(.55, 24));
    }
}
