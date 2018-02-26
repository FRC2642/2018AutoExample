package org.usfirst.frc.team2642.robot.commands.commandgroups;

import org.usfirst.frc.team2642.robot.commands.DriveByGyro;
import org.usfirst.frc.team2642.robot.commands.PlaceHolderCommand;
import org.usfirst.frc.team2642.robot.commands.TurnByGyro;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightStartAutoCommandGroup extends CommandGroup {

    public RightStartAutoCommandGroup() {
    	//Basic Auto (drive past auto-line)
    	//addSequential(new DriveByGyro(0, .8, 96, false));
    	
    	//Drive to scale
    	/*addSequential(new DriveByGyro(0, .6, 96, false));
    	addSequential(new DriveByGyro(0, .6, 74, false));
    	addSequential(new DriveByGyro(-32, .57, 42, false));
    	addSequential(new DriveByGyro(-10, .6, 24, false));*/
    	
    	//Drive to right side of switch
    	/*addSequential(new DriveByGyro(15, .6, 60, false));
    	addSequential(new DriveByGyro(0, .6, 90, false));
    	addSequential(new TurnByGyro(-90, 1));
    	addSequential(new DriveByGyro(-90, .6, 12, false));
    	addSequential(new PlaceHolderCommand(3));
    	addSequential(new TurnByGyro(0, 1));*/
    	
    	//Drive to right side of switch then to right side of scale
    	addSequential(new DriveByGyro(15, .6, 60, false));
    	addSequential(new DriveByGyro(0, .6, 90, false));
    	addSequential(new TurnByGyro(-90, 1));
    	addSequential(new DriveByGyro(-90, .6, 12, false));
    	addSequential(new PlaceHolderCommand(3));
    	addSequential(new TurnByGyro(0, 1));
    	addSequential(new DriveByGyro(0, .6, 24, false));
    	addSequential(new DriveByGyro(-35, .57, 30, false));
    	addSequential(new DriveByGyro(0, .6, 36, false));
    }
}
