package com.adventcode.day_three;

import java.io.FileNotFoundException;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ConvertDiagnostics {

  public static void main(String[] args) throws FileNotFoundException {
    ReadDiagnosticsData readDiagnosticsData = new ReadDiagnosticsData();

    List<String> binaryArray = readDiagnosticsData.getDataArray();

    String gammaData = getGammaRate(binaryArray);
    String epsilonData = getEpsilonRate(gammaData);

    getSubmarinePowerConsumption(gammaData, epsilonData);
  }

  public static String getGammaRate(List<String> binaryList) {
    int ones = 0, zeroes = 0;
    String gamma = "";

    for(int j=0; j < binaryList.get(0).length(); j++) {

      for (int i=0; i < binaryList.size(); i++) {
        if (parseInt(String.valueOf(binaryList.get(i).charAt(j))) == 1) ones++;
        else zeroes++;
      }

      if (ones > zeroes) gamma += "1";
      else gamma += "0";

      ones = 0;
      zeroes = 0;
    }
    System.out.println(gamma);
    return gamma;
  }

  public static String getEpsilonRate(String gammaData) {
    String epsilon = "";
    for (byte i=0; i < gammaData.length(); i++) {
      if (parseInt(String.valueOf(gammaData.charAt(i)))  == 1) epsilon += "0";
      else epsilon += "1";
    }
    System.out.println(epsilon);
    return epsilon;
  }

  public static void getSubmarinePowerConsumption(String gammaRate, String epsilonRate) {
    int gammaDecimalForm=Integer.parseInt(gammaRate,2);
    int epsilonDecimalForm=Integer.parseInt(epsilonRate, 2);

    System.out.println(gammaDecimalForm * epsilonDecimalForm);
  }
}
