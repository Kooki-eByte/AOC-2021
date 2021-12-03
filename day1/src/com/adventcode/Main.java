package com.adventcode;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        MeasurementData measurementData = new MeasurementData();
        MeasurementFunctionality measurementFunctionality = new MeasurementFunctionality();

        List<Integer> inputArray = measurementData.getData();
        System.out.printf("there are %d measurements that are larger than the previous " +
                "measurement.", measurementFunctionality.compareGroupedMeasurements(inputArray));
    }

}
