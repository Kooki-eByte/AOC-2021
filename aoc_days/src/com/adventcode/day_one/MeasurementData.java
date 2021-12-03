package com.adventcode.day_one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeasurementData {

  public List<Integer> getData() throws FileNotFoundException {
    // creating file instance to grab the text file
    File measurementData = new File("./aoc_days/src/com" +
            "/adventcode/day_one/data/inputDay1.txt");

    // scanning the file instance to read the contents
    Scanner scanner = new Scanner(measurementData);

    //Reading each line of the file using Scanner to turn the input data into an array of integers
    ArrayList<Integer> listOfInputs = new ArrayList();
    while(scanner.hasNextLine()){
      String inputString = scanner.nextLine();
      int inputInteger = Integer.parseInt(inputString);
      listOfInputs.add(inputInteger);
    }

    return listOfInputs;
  }

}
