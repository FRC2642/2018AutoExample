package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.DriveCommand;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrainSystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	Spark leftDrive = new Spark(RobotMap.leftDriveMotor);
	Spark rightDrive = new Spark(RobotMap.rightDriveMotor);
	
	//public ADXRS450_Gyro gyro = new ADXRS450_Gyro();
	public AHRS gyro = new AHRS(I2C.Port.kOnboard);
	public Encoder leftEncoder = new Encoder(RobotMap.leftEncoderChannelA, RobotMap.leftEncoderChannelB, false, EncodingType.k4X);
	public Encoder rightEncoder = new Encoder(RobotMap.rightEncoderChannelA, RobotMap.rightEncoderChannelB, false, EncodingType.k4X);
	
	DifferentialDrive drive = new DifferentialDrive(leftDrive, rightDrive);
	
	public PIDController pidControllerLeft = new PIDController(.061, 0.005, 0, gyro, leftDrive);
	public PIDController pidControllerRight = new PIDController(.061, 0.005, 0, gyro, rightDrive);
	
	public DriveTrainSystem()
	{
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveCommand());
    }
    
    public void move(double moveValue, double rotateValue)
    {
    	drive.arcadeDrive(-moveValue, rotateValue);
    }

    public void tankMove(double leftMoveValue, double rightMoveValue)
    {
    	drive.tankDrive(leftMoveValue, rightMoveValue);
    }
    
    public void brake() {
    	leftDrive.stopMotor();
    	rightDrive.stopMotor();
    }
    
    public void stop()
    {
    	drive.arcadeDrive(0.0, 0.0);
    }
    
    public void resetEncoders()
    {
    	leftEncoder.reset();
    	rightEncoder.reset();
    }
    
    public int getPulses()
    {
    	return Math.abs(leftEncoder.get());
    }
    
    public double getDistance() //returns inches
    {
    	return Math.abs(leftEncoder.get()) / RobotMap.PULSES_PER_INCH;
    }
    
    public double encoderToFeet(double encoderCount)
    {
    	return encoderCount / RobotMap.ENCODER_FOOT;
    }
    
    public double feetToEncoder(double feet)
    {
    	return RobotMap.ENCODER_FOOT * feet;
    }
    
    public void setPIDSetPoint(double setPoint)
    {
    	pidControllerLeft.setSetpoint(setPoint);
    	pidControllerRight.setSetpoint(setPoint);
    }
    
    public void disablePID()
    {
    	
    }
    
    public double getCurrentHeading()
    {
		return (gyro.getAngle());
		//return (ahrs.getAngle()) - 2.5;
    }
}

