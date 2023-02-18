// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;


import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
  /** Creates a new ArmSubsystem. */

  //declares piston object :)
  DoubleSolenoid arm;
  DoubleSolenoid claw;
  Value armState;
  Value clawState;
  public ArmSubsystem() {
    /** 
    arm = new DoubleSolenoid(null, 0, 0);
    claw = new DoubleSolenoid(null, 0, 0);
    */
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void toggleArmState(){
    //changes the piston state either to extended or retracted
    /** 
    armState = (armState == Value.kForward) ? Value.kReverse : Value.kForward;
    arm.set(armState);
    */
  }
  public void toggleClawState(){
    //changes the piston state either to extended or retracted
    /** 
    clawState = (clawState == Value.kForward) ? Value.kReverse : Value.kForward;
    claw.set(clawState);
    */
  }
}
