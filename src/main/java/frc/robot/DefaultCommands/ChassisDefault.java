// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.DefaultCommands;

import javax.swing.text.AbstractDocument.DefaultDocumentEvent;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ChassisDefault extends CommandBase {
  /** Creates a new ChassisDefualt. */
  double maxSpeed = 0.5;
  public ChassisDefault() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.CHASSIS);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // takes speed and turn to move
    double turnSpeed =Robot.OI.turn();
    double driveSpeed = Robot.OI.speed();
    
    if (Math.abs(driveSpeed)<maxSpeed){
      if (Math.abs(turnSpeed)<maxSpeed){
        Robot.CHASSIS.driver(turnSpeed, driveSpeed);
      }
      else{
        if (turnSpeed>0){
          Robot.CHASSIS.driver(maxSpeed, driveSpeed);
        }
        else{
          Robot.CHASSIS.driver(-maxSpeed, driveSpeed);
        }
      }
    }
    else{
      if(driveSpeed > 0){
        if (Math.abs(turnSpeed)<maxSpeed){
          Robot.CHASSIS.driver(turnSpeed, maxSpeed);
        }
        else{
          if (turnSpeed>0){
            Robot.CHASSIS.driver(maxSpeed, maxSpeed);
          }
          else{
            Robot.CHASSIS.driver(-maxSpeed, maxSpeed);
          }
        }
      }
      else{
        if (Math.abs(turnSpeed)<maxSpeed){
          Robot.CHASSIS.driver(turnSpeed, -maxSpeed);
        }
        else{
          if (turnSpeed>0){
            Robot.CHASSIS.driver(maxSpeed, -maxSpeed);
          }
          else{
            Robot.CHASSIS.driver(-maxSpeed, -maxSpeed);
          }
        }
      }
    }
    
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
