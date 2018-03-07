package org.usfirst.frc.team2642.robot.commands.commandgroups.pieces;

import org.usfirst.frc.team2642.robot.commands.DriveByGyro;
import org.usfirst.frc.team2642.robot.commands.TurnByGyro;
import org.usfirst.frc.team2642.robot.commands.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CStart_LSwitchBasic extends CommandGroup {

    public CStart_LSwitchBasic() {
    	addSequential(new WaitCommand(.1));
    	addSequential(new DriveByGyro(0, .7, 12, false));
    	addSequential(new DriveByGyro(-50, .7, 66, false));
    	addSequential(new DriveByGyro(0, .6, 36, false));
    	addSequential(new TurnByGyro(0, 2));
    	//addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(0, -.7, 54, false));
    	addSequential(new TurnByGyro(50, 2));
    	addSequential(new DriveByGyro(50, .7, 42, false));
    	//addSequential(new PlaceHolderCommand(.5));
    	addSequential(new DriveByGyro(90, -.7, 25, false));
    	addSequential(new TurnByGyro(180, 2));
    	addSequential(new DriveByGyro(180, .7, 24, false));
    }
}
