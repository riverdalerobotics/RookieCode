// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ChassisSubsystem extends SubsystemBase {
  /** Creates a new ChassisSubsystem. */
  DifferentialDrive drive;
  AHRS gyro = new AHRS(SerialPort.Port.kMXP);

  public ChassisSubsystem() {
    // declares motors...
    WPI_TalonSRX rightFront = new WPI_TalonSRX(4);
    WPI_TalonSRX rightBack = new WPI_TalonSRX(2);
    WPI_TalonSRX leftFront = new WPI_TalonSRX(1);
    WPI_TalonSRX leftBack = new WPI_TalonSRX(3);

    // groups up the motors based on their location
    MotorControllerGroup leftControllerGroup = new MotorControllerGroup(leftFront, leftBack);
    MotorControllerGroup rightControllerGroup = new MotorControllerGroup(rightFront, rightBack);

    drive = new DifferentialDrive(leftControllerGroup, rightControllerGroup);
  } // set speed and rotate
  public void driver(double speed, double turn){
    drive.arcadeDrive(speed, turn);
    
    SmartDashboard.putNumber("ySpeed", speed);
    SmartDashboard.putNumber("Turn", turn);
    
  }

  //public void drive(double speed, double turn, double zSpeed) {
   
  //}

  public double getPitch(){
    return gyro.getPitch();
  }
  public double getRoll(){
    return gyro.getRoll();
  }
  public double getAngle(){
    return gyro.getAngle();
  }
  public double horDistance(){
    return gyro.getDisplacementY();
  }
  public double verDistance(){
    return gyro.getDisplacementX();
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
