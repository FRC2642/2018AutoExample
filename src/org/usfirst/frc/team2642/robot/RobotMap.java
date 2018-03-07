/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2642.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static final String logDirectory = "/home/lvuser/";
	public static final String logFileName = "log.txt";
	
	public static final int ENCODER_FOOT = 235;
	public static final double PULSES_PER_INCH = ENCODER_FOOT / 12;
	public static int leftEncoderChannelA = 0;
	public static int leftEncoderChannelB = 1;
	public static int rightEncoderChannelA =2;
	public static int rightEncoderChannelB =3;
	
	public static int leftDriveMotor = 1;
	public static int rightDriveMotor = 0;
	
	public static int driveStickChannel = 0;
	public static int driveStickX = 0;
	public static int driveStickY = 1;
	
	public static double inputGear = 40;
	public static double outputGear = 40;
	public static double gearRatio = outputGear / inputGear;
	public static int wheelDiameter = 6;
	public static int pulsesPerRev = 1400;
	public static double circumference = wheelDiameter * Math.PI;
	public static double pulsesPerInch = (pulsesPerRev / circumference) * gearRatio;
	public static double inchesPerPulse = (circumference / pulsesPerRev) * gearRatio;
	
	public static int autoDialPort = 2;
}
