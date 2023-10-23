// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems.vision;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.visionlib;


public class VisionSubsystemUtil extends SubsystemBase {
  /** Creates a new VisionSubsystemUtil. */
  public VisionSubsystemUtil() {}

  String limelight;

  Pose3d currentPose3d = visionlib.getBotPose3d(getName());
  Pose2d currentPose2d = visionlib.getBotPose2d(getName());
  Pose3d targetPose3d = visionlib.getTargetPose3d_RobotSpace(getName());
  Pose3d botPose_target3d = visionlib.getBotPose3d_TargetSpace(getName());
  Pose3d poseBluePose3d = visionlib.getBotPose3d_wpiBlue(limelight);
  Pose3d poseRedPose3d = visionlib.getBotPose3d_wpiRed(limelight);

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

