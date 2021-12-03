package com.adventcode.day_two;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class SubmarineMovement {

  public static void main (String[] args) throws FileNotFoundException {
    ReadSubmarineData readSubmarineData = new ReadSubmarineData();
    SubmarineModel submarineModel = new SubmarineModel(0,0);

    submarineMovement(submarineModel, readSubmarineData.getData());
  }

  public static void submarineMovement(SubmarineModel submarine,
                                    ArrayList<List<String>> movementData) {

    if(movementData.isEmpty()) System.out.println("Movement Data unavailable..");

    for (List<String> movement: movementData) {
      int position = parseInt(movement.get(1));

      switch(movement.get(0)) {
        case "forward":
          submarine.setForwardPos(position);
          break;
        case "up":
          submarine.setUpDepthPos(position);
          break;
        case "down":
          submarine.setDownDepthPos(position);
          break;
      }
    }

    long total = submarine.getHorizontalPos() * submarine.getDepthPos();

    System.out.println("Submarines Horizontal Pos: " + submarine.getHorizontalPos());
    System.out.println("Submarine Depth Pos: " + submarine.getDepthPos());
    System.out.println("Mulitplied together it is: " + total);
  }
}
