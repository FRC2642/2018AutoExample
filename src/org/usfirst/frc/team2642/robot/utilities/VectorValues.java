package org.usfirst.frc.team2642.robot.utilities;

import org.usfirst.frc.team2642.robot.RobotMap;

public final class VectorValues {
	public static double vectorComponentX = 0;
	public static double vectorComponentY = 0;
	public static double encoderDistance = 0;
	
	public static double getMagnitude() {
		return Math.sqrt(Math.pow(vectorComponentX, 2) + Math.pow(vectorComponentY, 2));
	}
	
	public static double getAngle() {
		return (Math.acos((vectorComponentY / RobotMap.PULSES_PER_INCH) / (getMagnitude() / RobotMap.PULSES_PER_INCH)) * (180 / Math.PI));
	}
}
