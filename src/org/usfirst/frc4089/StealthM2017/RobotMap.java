// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4089.StealthM2017;



// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Ultrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Encoder shooterEncoderShoot;
    public static Servo shooterServoLowGoal;
    public static Ultrasonic sensorsSonic1;
    public static AnalogGyro sensorsAnalogGyro1;
    public static Encoder utilsEncoderDrive1;
    public static Encoder utilsEncoderDrive2;
    public static PowerDistributionPanel utilsPDP;
    public static DigitalInput utilsLSClimbStop;
    public static DigitalInput utilsLSCollectorOut;
    public static DigitalInput utilsLSCollectorIn;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static RobotDrive driveRobotDrive41;
    public static CANTalon driveMotorD1;
    public static CANTalon driveMotorD2;
    public static CANTalon driveMotorD3;
    public static CANTalon driveMotorD4;
    public static CANTalon ballCollectorMotorBC;
    public static CANTalon shooterMotorShoot;
    public static CANTalon elevatorMotorOne;
    public static CANTalon elevatorMotorTwo;
    public static CANTalon climbMotorOne;
    public static CANTalon climbMotorTwo;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterEncoderShoot = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "EncoderShoot", shooterEncoderShoot);
        shooterEncoderShoot.setDistancePerPulse(1.0);
        shooterEncoderShoot.setPIDSourceType(PIDSourceType.kRate);
        shooterServoLowGoal = new Servo(1);
        LiveWindow.addActuator("Shooter", "ServoLowGoal", shooterServoLowGoal);
        
        sensorsSonic1 = new Ultrasonic(2, 3);
        LiveWindow.addSensor("Sensors", "Sonic1", sensorsSonic1);
        
        sensorsAnalogGyro1 = new AnalogGyro(0);
        LiveWindow.addSensor("Sensors", "AnalogGyro 1", sensorsAnalogGyro1);
        sensorsAnalogGyro1.setSensitivity(0.007);
        utilsEncoderDrive1 = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Utils", "EncoderDrive1", utilsEncoderDrive1);
        utilsEncoderDrive1.setDistancePerPulse(1.0);
        utilsEncoderDrive1.setPIDSourceType(PIDSourceType.kRate);
        utilsEncoderDrive2 = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("Utils", "EncoderDrive2", utilsEncoderDrive2);
        utilsEncoderDrive2.setDistancePerPulse(1.0);
        utilsEncoderDrive2.setPIDSourceType(PIDSourceType.kRate);
        utilsPDP = new PowerDistributionPanel(0);
        LiveWindow.addSensor("Utils", "PDP", utilsPDP);
        
        utilsLSClimbStop = new DigitalInput(8);
        LiveWindow.addSensor("Utils", "LSClimbStop", utilsLSClimbStop);
        
        utilsLSCollectorOut = new DigitalInput(9);
        LiveWindow.addSensor("Utils", "LSCollectorOut", utilsLSCollectorOut);
        
        utilsLSCollectorIn = new DigitalInput(10);
        LiveWindow.addSensor("Utils", "LSCollectorIn", utilsLSCollectorIn);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveMotorD1 = new CANTalon(Constants.CANdriveMotorD1);
        LiveWindow.addActuator("Drive", "MotorD1", (CANTalon) driveMotorD1);
        
        driveMotorD2 = new CANTalon(Constants.CANdriveMotorD2);
        LiveWindow.addActuator("Drive", "MotorD2", (CANTalon) driveMotorD2);
        
        driveMotorD3 = new CANTalon(Constants.CANdriveMotorD3);
        LiveWindow.addActuator("Drive", "MotorD3", (CANTalon) driveMotorD3);
        
        driveMotorD4 = new CANTalon(Constants.CANdriveMotorD4);
        LiveWindow.addActuator("Drive", "MotorD4", (CANTalon) driveMotorD4);
        
        driveRobotDrive41 = new RobotDrive(driveMotorD1, driveMotorD2,
              driveMotorD3, driveMotorD4);
        
        driveRobotDrive41.setSafetyEnabled(Constants.driveMotorSafety);
        driveRobotDrive41.setExpiration(Constants.driveMotorExpiration);
        driveRobotDrive41.setSensitivity(Constants.driveMotorSensitivity);
        driveRobotDrive41.setMaxOutput(Constants.driveMotorMaxOutput);
        driveRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        ballCollectorMotorBC = new CANTalon(Constants.CANballCollectorMotorBC);
        LiveWindow.addActuator("BallCollector", "MotorBC", (CANTalon) ballCollectorMotorBC);
        
        shooterMotorShoot = new CANTalon(Constants.CANshooterMotorShoot);
        LiveWindow.addActuator("Shooter", "MotorShoot", (CANTalon) shooterMotorShoot);
        
        elevatorMotorOne = new CANTalon(Constants.CANelevatorMotorOne);
        LiveWindow.addActuator("Elevator", "MotorElevOne", (CANTalon) elevatorMotorOne);
        
        elevatorMotorTwo = new CANTalon(Constants.CANelevatorMotorOne);
        LiveWindow.addActuator("Elevator", "MotorElevTwo", (CANTalon) elevatorMotorTwo);
        
        climbMotorOne = new CANTalon(Constants.CANclimbMotorOne);
        LiveWindow.addActuator("Climber", "MotorClimbOne", (CANTalon) climbMotorOne);
        
        climbMotorTwo = new CANTalon(Constants.CANclimbMotorOne);
        LiveWindow.addActuator("Climber", "MotorClimbTwo", (CANTalon) climbMotorTwo);
    }
}
