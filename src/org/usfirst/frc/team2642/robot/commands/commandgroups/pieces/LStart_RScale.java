package org.usfirst.frc.team2642.robot.commands.commandgroups.pieces;

import org.usfirst.frc.team2642.robot.commands.DriveByGyro;
import org.usfirst.frc.team2642.robot.commands.TurnByGyro;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LStart_RScale extends CommandGroup {

    public LStart_RScale() {
    	addSequential(new DriveByGyro(0, .9, 184, false));
    	addSequential(new DriveByGyro(20, .9, 3, false));
    	addSequential(new DriveByGyro(40, .9, 3, false));
    	addSequential(new DriveByGyro(60, .9, 3, false));
    	addSequential(new DriveByGyro(80, .9, 3, false));
    	addSequential(new TurnByGyro(90, 2));
    	addSequential(new DriveByGyro(90, .8, 66, false));
    	addSequential(new DriveByGyro(90, .6, 48, false));
    	addSequential(new DriveByGyro(90, .8, 48, false));
    	addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .8, 24, false));
    	//addSequential(new PlaceHolderCommand(.8));
    }
}
