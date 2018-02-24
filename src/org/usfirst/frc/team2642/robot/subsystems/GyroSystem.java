package org.usfirst.frc.team2642.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GyroSystem extends Subsystem {
	ADXRS450_Gyro gyro = new ADXRS450_Gyro(Port.kMXP);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

