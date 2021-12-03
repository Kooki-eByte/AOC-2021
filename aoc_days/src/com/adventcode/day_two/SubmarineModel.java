package com.adventcode.day_two;

public class SubmarineModel {
  private int horizontalPos;
  private int depthPos;
  private int aim;

  public SubmarineModel() {
    this.horizontalPos = 0;
    this.depthPos = 0;
    this.aim = 0;
  }

  public int getHorizontalPos() {
    return horizontalPos;
  }

  public void setForwardPos(int forwardPos) {
    this.horizontalPos += forwardPos;
    this.depthPos += this.aim * forwardPos;
  }

  public int getDepthPos() {
    return depthPos;
  }

  public void setDownDepthPos(int position) {
    this.aim += position;
  }

  public void setUpDepthPos(int position) {
    this.aim -= position;
  }

  public int getAim() {
    return aim;
  }

  @Override
  public String toString() {
    return "SubmarineModel{" +
            "horizontalPos=" + horizontalPos +
            ", depthPos=" + depthPos +
            '}';
  }
}
