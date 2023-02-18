// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.DefaultCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class AutoDefault extends CommandBase {
  double origin;

  /** Creates a new AutoDefault. */
  public AutoDefault() {
    addRequirements(Robot.CHASSIS);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    origin = Robot.CHASSIS.horDistance();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override 
  public void execute() {
    Robot.CHASSIS.driver(-0.4, -0.8);
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