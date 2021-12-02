package com.adventcode;

import com.adventcode.MeasurementData;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        MeasurementData measurementData = new MeasurementData();

        List<Integer> inputArray = measurementData.getData();
        System.out.printf("there are %d measurements that are larger than the previous " +
                "measurement.", compareMeasurements(inputArray));
    }

    public static int compareMeasurements(List<Integer> measurements) {
        int count = 0;
        if(measurements.isEmpty()) return 0;

        for (int i=0; i < measurements.size()-1; i++) {
            int currentPos = measurements.get(i);
            int nextPos = measurements.get(i+1);
            if(nextPos > currentPos) count++;
        }
        
        return count;
    }
}
