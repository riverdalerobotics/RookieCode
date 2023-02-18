// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.OperatorInput;

import edu.wpi.first.wpilibj.XboxController;

/** Add your docs here. */

public class OperatorInput {
    XboxController moveController;
    XboxController intakeController;

    public OperatorInput(){
        moveController = new XboxController(0);
        intakeController = new XboxController(1);
    }

    public double speed(){
        return moveController.getLeftY();
    }

    public double turn(){
        return moveController.getRightX();
    
    }
    public double elevator(){
        return -intakeController.getLeftY();
    }
    public boolean arm(){
        return intakeController.getAButton();
    }
    public boolean claw(){
        return intakeController.getBButton();
    }

}
