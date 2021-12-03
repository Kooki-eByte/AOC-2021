package com.adventcode.day_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadSubmarineData {

  public ArrayList<List<String>> getData() throws FileNotFoundException {
    File movementData = new File("./aoc_days/src/com" +
            "/adventcode/day_two/data/inputDay2.txt");

    Scanner scanner = new Scanner(movementData);

    ArrayList<List<String>> listOfMovements = new ArrayList();
    while(scanner.hasNextLine()){
      String inputString = scanner.nextLine();
      List<String> parsedMovementList = List.of(inputString.split(" "));
      listOfMovements.add(parsedMovementList);
    }

    return listOfMovements;
  }

}
