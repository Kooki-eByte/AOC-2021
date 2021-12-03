package com.adventcode.day_one;

import java.util.ArrayList;
import java.util.List;

public class MeasurementFunctionality {

  public int compareMeasurements(List<Integer> measurements) {
    int count = 0;
    if(measurements.isEmpty()) return 0;

    for (int i=0; i < measurements.size()-1; i++) {
      int currentPos = measurements.get(i);
      int nextPos = measurements.get(i+1);
      if(nextPos > currentPos) count++;
    }

    return count;
  }

  public int compareGroupedMeasurements(List<Integer> measurements) {
    ArrayList<Integer> addedGroupArray = new ArrayList();
    if(measurements.isEmpty()) return 0;

    for (int i=0; i < measurements.size()-1; i++) {
      int sumAmt = 0;

      for (int j=i; j < i+3; j++) {
        if (j > measurements.size()-1) break;
        sumAmt += measurements.get(j);
      }

      addedGroupArray.add(sumAmt);
    }

    int count = compareMeasurements(addedGroupArray);
    return count;
  }
}
