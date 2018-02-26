package org.usfirst.frc.team2642.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterStartAutoCommandGroup extends CommandGroup {

    public CenterStartAutoCommandGroup() {
    	//Basic go to left side of swich
    	addSequential(new DriveByGyro(0, .8, 6, false));
    	addSequential(new DriveByGyro(-60, .8, 105, false));
    	addSequential(new DriveByGyro(-50, .8, 2, false));
    	addSequential(new DriveByGyro(-40, .8, 2, false));
    	addSequential(new DriveByGyro(-30, .8, 2, false));
    	addSequential(new DriveByGyro(-20, .8, 2, false));
    	addSequential(new DriveByGyro(-10, .8, 2, false));
    	addSequential(new DriveByGyro(0, .8, 2, false));
    	addSequential(new DriveByGyro(0, .8, 60, false));
    	addSequential(new TurnByGyro(90, 3));
    }
}
