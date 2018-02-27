package org.usfirst.frc.team2642.robot.commands.commandgroups;

import org.usfirst.frc.team2642.robot.commands.DriveByGyro;
import org.usfirst.frc.team2642.robot.commands.PlaceHolderCommand;
import org.usfirst.frc.team2642.robot.commands.TurnByGyro;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftStartAutoCommandGroup extends CommandGroup {

    public LeftStartAutoCommandGroup() {
    	
    	//Basic Auto (drive past auto-line)
    	//addSequential(new DriveByGyro(0, .8, 96, false));
    	
    	//Drive to left side of switch then to left side of scale
    	/*addSequential(new DriveByGyro(0, .8, 140, false));
    	addSequential(new TurnByGyro(90, 2));
    	addSequential(new PlaceHolderCommand(.5));
    	
    	addSequential(new TurnByGyro(-5, 2));
    	addSequential(new DriveByGyro(0, .7, 55, false));
    	addSequential(new TurnByGyro(137, 2));
    	addSequential(new DriveByGyro(137, .7, 10, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new TurnByGyro(15, 2));
    	addSequential(new DriveByGyro(15, .7, 16, false));
    	addSequential(new DriveByGyro(0, .7, 20, false));*/
    	
    	//Drive to left side of scale then to left of switch
    	addSequential(new DriveByGyro(0, .8, 163, false));
    	addSequential(new DriveByGyro(34, .7, 59, false));
    	addSequential(new DriveByGyro(25, .7, 2, false));
    	addSequential(new DriveByGyro(10, .7, 2, false));
    	addSequential(new DriveByGyro(0, .7, 24, false));
    	addSequential(new PlaceHolderCommand(.8));
    	addSequential(new DriveByGyro(0, -.6, 6, false));
    	addSequential(new DriveByGyro(0, -.6, 6, false));
    	addSequential(new PlaceHolderCommand(1.5));
    	addSequential(new TurnByGyro(161, 2));
    	addSequential(new DriveByGyro(163, .6, 21, false));
    	addSequential(new PlaceHolderCommand(1.5));
    	addSequential(new DriveByGyro(125, -.6, 16, false));
    	addSequential(new DriveByGyro(125, .6, 20, false));
    	
    	//Right side of the scale then right side of switch
    	/*addSequential(new DriveByGyro(0, .9, 184, false));
    	addSequential(new DriveByGyro(20, .9, 3, false));
    	addSequential(new DriveByGyro(40, .9, 3, false));
    	addSequential(new DriveByGyro(60, .9, 3, false));
    	addSequential(new DriveByGyro(80, .9, 3, false));
    	addSequential(new TurnByGyro(90, 2));
    	addSequential(new DriveByGyro(90, .8, 66, false));
    	addSequential(new DriveByGyro(90, .6, 48, false));
    	addSequential(new DriveByGyro(90, .8, 54, false));
    	addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .7, 24, false));
    	addSequential(new PlaceHolderCommand(.8));
    	addSequential(new DriveByGyro(0, -.7, 6, false));
    	addSequential(new DriveByGyro(0, -.7, 6, false));
    	addSequential(new PlaceHolderCommand(1.5));
    	addSequential(new TurnByGyro(-170, 2));
    	addSequential(new DriveByGyro(-170, .7, 19, false));*/
    	
    }
}
