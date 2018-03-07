/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2642.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick autoDial = new Joystick(RobotMap.autoDialPort);
	
	//left dial
	public static Button dial1 = new JoystickButton(autoDial, 1);
	public static Button dial2 = new JoystickButton(autoDial, 2);
	public static Button dial3 = new JoystickButton(autoDial, 3);
	
	//right dial
	public static Button dial4 = new JoystickButton(autoDial, 4);
	public static Button dial5 = new JoystickButton(autoDial, 5);
	public static Button dial6 = new JoystickButton(autoDial, 6);
	
	public Joystick driveStick = new Joystick(RobotMap.driveStickChannel);
}
