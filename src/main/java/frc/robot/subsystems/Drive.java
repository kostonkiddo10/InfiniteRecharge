// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Subsystem;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.SpeedControllerGroup;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Drive implements Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private CANSparkMax speedController1;
    private CANSparkMax speedController4;
    private CANSparkMax speedController3;
    private CANSparkMax speedController2;
    private SpeedControllerGroup left;
    private SpeedControllerGroup right;
    public DifferentialDrive robotDrive;
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Drive() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        speedController1 = new CANSparkMax(1, MotorType.kBrushless);
        speedController1.setInverted(false);
        
        speedController4 = new CANSparkMax(2, MotorType.kBrushless);
        speedController4.setInverted(false);
        
        speedController3 = new CANSparkMax(4, MotorType.kBrushless);
        speedController3.setInverted(false);
        
        speedController2 = new CANSparkMax(3, MotorType.kBrushless);
        speedController2.setInverted(false);

        left = new SpeedControllerGroup(speedController1, speedController2);
        right = new SpeedControllerGroup(speedController4, speedController3);
        
        robotDrive = new DifferentialDrive(left,right);
        
        robotDrive.setSafetyEnabled(false);
        robotDrive.setExpiration(0.1);
        robotDrive.setMaxOutput(1.0);

        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

