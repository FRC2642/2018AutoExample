package org.usfirst.frc.team2642.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CanBoardSystem extends Subsystem {
	public TalonSRX motor1 = new TalonSRX(1);
	public TalonSRX motor2 = new TalonSRX(2);
	public TalonSRX motor3 = new TalonSRX(3);
	PowerDistributionPanel pdp = new PowerDistributionPanel();
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void CANSystem()
    {
    	motor2.follow(motor1);
    	motor3.follow(motor1);
    }
    
    public void runMotor1(double value)
    {
    	motor1.set(ControlMode.PercentOutput, value);
    }
    
    public void runMotor2(double value)
    {
    	motor2.set(ControlMode.Follower, value);
    }
    
    public void runMotor3(double value)
    {
    	motor3.set(ControlMode.Follower, value);
    }
}

