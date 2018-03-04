package org.usfirst.frc.team2642.robot.commands.commandgroups;

import org.usfirst.frc.team2642.robot.commands.DriveByVector;
import org.usfirst.frc.team2642.robot.commands.FindCubeCommand;
import org.usfirst.frc.team2642.robot.commands.ReturnByVector;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class VectorExample extends CommandGroup {

    public VectorExample() {
    	addSequential(new FindCubeCommand(.8, true));
    	addSequential(new DriveByVector(.55, 24));
        addSequential(new ReturnByVector(-.7));
    }
}
