package com.adventcode.day_three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDiagnosticsData {

  public List<String> getDataArray() throws FileNotFoundException {
    // creating file instance to grab the text file
    File binaryData = new File("./aoc_days/src/com" +
            "/adventcode/day_three/data/inputDay3.txt");

    // scanning the file instance to read the contents
    Scanner scanner = new Scanner(binaryData);

    //Reading each line of the file using Scanner to turn the input data into an array of integers
    ArrayList<String> listOfBinary = new ArrayList();
    while(scanner.hasNextLine()){
      String inputString = scanner.nextLine();
      listOfBinary.add(inputString);
    }

    return listOfBinary;
  }

}
