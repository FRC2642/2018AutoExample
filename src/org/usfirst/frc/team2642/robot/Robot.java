/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2642.robot;

import org.usfirst.frc.team2642.robot.commands.ExampleCommand;
import org.usfirst.frc.team2642.robot.commands.commandgroups.pieces.VectorExample;
import org.usfirst.frc.team2642.robot.commands.commandgroups.testpaths.CenterStartAutoCommandGroup;
import org.usfirst.frc.team2642.robot.commands.commandgroups.testpaths.LeftStartAutoCommandGroup;
import org.usfirst.frc.team2642.robot.commands.commandgroups.testpaths.RightStartAutoCommandGroup;
import org.usfirst.frc.team2642.robot.subsystems.DriveTrainSystem;
import org.usfirst.frc.team2642.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team2642.robot.subsystems.PixySubsystem;
import org.usfirst.frc.team2642.robot.subsystems.SonarSubsystem;
import org.usfirst.frc.team2642.robot.utilities.AutoSelector;
import org.usfirst.frc.team2642.robot.utilities.RoboRioLogger;
import org.usfirst.frc.team2642.robot.utilities.VectorValues;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	public static final ExampleSubsystem kExampleSubsystem
			= new ExampleSubsystem();
	public static final DriveTrainSystem drive = new DriveTrainSystem();
	public static OI m_oi;
	public static UsbCamera cam;
	public int numTargets = 0;
	public static PixySubsystem pixy = new PixySubsystem();
	public static SonarSubsystem sonar = new SonarSubsystem();
	
	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();
	
	//CameraServer camServer = CameraServer.getInstance();
	//public CanBoardSystem canSystem = new CanBoardSystem();
	public static final RoboRioLogger logger = new RoboRioLogger();
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		while (drive.gyro.isCalibrating());
		m_oi = new OI();
		m_chooser.addDefault("Default Auto", new ExampleCommand());
		// chooser.addObject("My Auto", new MyAutoCommand());
		m_chooser.addObject("Right Auto", new RightStartAutoCommandGroup());
		m_chooser.addObject("Left Auto", new LeftStartAutoCommandGroup());
		m_chooser.addObject("Center Auto", new CenterStartAutoCommandGroup());
		m_chooser.addObject("Vector Example", new VectorExample());
		SmartDashboard.putData("Auto mode", m_chooser);
		
		//cam = CameraServer.getInstance().startAutomaticCapture("Camera", 0);
		//cam.setResolution(320, 240);
		//cam.setFPS(10);
		
		//Timer.delay(10);
		
		/*VisionThread exampleVisionThread = new VisionThread(cam, new ExamplePipeline(), examplePipeline ->{
			VisionTargetInfo.setFilterContours(examplePipeline.filterContoursOutput());
			numTargets = VisionTargetInfo.getNumTargets();
		});
		exampleVisionThread.start();*/
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		SmartDashboard.putNumber("Cube x position", pixy.getCubeCenter());
		SmartDashboard.putBoolean("isCubeVisible", pixy.isCubeVisible());
		SmartDashboard.putNumber("Distance", sonar.getDistance());
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		drive.gyro.reset();
		//m_autonomousCommand = m_chooser.getSelected();
	
		AutoSelector a = new AutoSelector();
		a.selectAuto();
		m_autonomousCommand = a.autoCommand;
		
		// schedule the autonomous command (example)
		if (m_autonomousCommand != null) {
			m_autonomousCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("Encoder count", drive.getDistance());
		SmartDashboard.putNumber("Angle", drive.gyro.getAngle());
		SmartDashboard.putNumber("Cube x position", pixy.getCubeCenter());
		SmartDashboard.putBoolean("isCubeVisible", pixy.isCubeVisible());
		SmartDashboard.putNumber("Distance", sonar.getDistance());
		SmartDashboard.putNumber("VectorComponentX", VectorValues.vectorComponentX);
		SmartDashboard.putNumber("VectorComponentY", VectorValues.vectorComponentY);
		SmartDashboard.putNumber("Magnitude", VectorValues.getMagnitude());
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("Encoder count", drive.getDistance());
		SmartDashboard.putNumber("Cube x position", pixy.getCubeCenter());
		SmartDashboard.putBoolean("isCubeVisible", pixy.isCubeVisible());
		SmartDashboard.putNumber("Distance", sonar.getDistance());
		//canSystem.runMotor1(m_oi.driveStick.getRawAxis(2));
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("Left Encoder count", drive.leftEncoder.get());
		SmartDashboard.putNumber("Right Encoder count", drive.rightEncoder.get());
		SmartDashboard.putNumber("Encoder count", drive.getDistance());
		SmartDashboard.putNumber("Angle", drive.gyro.getAngle());
	}
}
