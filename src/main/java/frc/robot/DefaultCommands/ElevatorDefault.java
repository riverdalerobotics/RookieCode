// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.DefaultCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ElevatorDefault extends CommandBase {
  /** Creates a new ElevatorDefault. */
  public ElevatorDefault() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.ELEVATOR);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /** 
    // sets elevator to move 
    /* c
    if ((Robot.ELEVATOR.topSwitchTrigger()) == false ||(Robot.ELEVATOR.bottomSwitchTrigger()) == false) {
      Robot.ELEVATOR.speedZero();
    }else{
      Robot.ELEVATOR.setLift(Robot.OI.elevator());
    }
    
   // when elevator hits highest point it goes down
    if (!Robot.ELEVATOR.topSwitchTrigger()){ //!boolean is equivalent to boolean==false
        if (Robot.OI.elevator() < 0){
          Robot.ELEVATOR.setLift(Robot.OI.elevator());}
    }
    // when elevator is at lowest point it goes up
    else if(!Robot.ELEVATOR.bottomSwitchTrigger()){
      if (Robot.OI.elevator() >0){
        Robot.ELEVATOR.setLift(Robot.OI.elevator());
      }
    }
    // if its at neither then it keeps moving
    else{
      Robot.ELEVATOR.setLift(Robot.OI.elevator());
    }
    */
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
