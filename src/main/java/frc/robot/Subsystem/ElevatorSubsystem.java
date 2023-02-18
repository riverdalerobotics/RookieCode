// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {
  /** Creates a new ElevatorSubsystem. */
  //declare piston
  WPI_TalonSRX lift1;
  WPI_TalonSRX lift2;
  DigitalInput topSwitch;
  DigitalInput bottomSwitch;
  public ElevatorSubsystem() {
    // port number 0 means we don't know yet
    /** 
    lift1 = new WPI_TalonSRX(0);
    lift2 = new WPI_TalonSRX(0);
    topSwitch = new DigitalInput(0);
    bottomSwitch = new DigitalInput(0);
    */
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public boolean topSwitchTrigger(){
    return topSwitch.get();
  }
  public boolean bottomSwitchTrigger(){
    return bottomSwitch.get();
  }
  public void speedZero(){
    lift1.set(0);
    lift2.set(0);
  }

  // Set lift speed
  public void setLift(double speed){
    lift1.set(speed);
    lift2.set(speed);
  }
}
