package com.adventcode.day_two;

public class SubmarineModel {
  private int horizontalPos;
  private int depthPos;

  public SubmarineModel(int horizontalPos, int depthPos) {
    this.horizontalPos = horizontalPos;
    this.depthPos = depthPos;
  }

  public int getHorizontalPos() {
    return horizontalPos;
  }

  public void setForwardPos(int horizontalPos) {
    this.horizontalPos += horizontalPos;
  }

  public int getDepthPos() {
    return depthPos;
  }

  public void setDownDepthPos(int depthPos) {
    this.depthPos += depthPos;
  }

  public void setUpDepthPos(int depthPos) {
    this.depthPos -= depthPos;
  }

  @Override
  public String toString() {
    return "SubmarineModel{" +
            "horizontalPos=" + horizontalPos +
            ", depthPos=" + depthPos +
            '}';
  }
}
