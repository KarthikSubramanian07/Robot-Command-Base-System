// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Shooter;

// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AutonomousTwo extends SequentialCommandGroup {
  /** Creates a new AutonomousTwo. */
  public AutonomousTwo(DriveTrain dt, Shooter s) {
    addCommands(new DriveToDistance(dt), new AutoShoot(s));
  }
}