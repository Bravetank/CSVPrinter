package com.bravetank.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord(
                    "Michelle",
                    "Slee",
                    4,
                    "Loved It!");
            printer.printRecord(
                    "Demi",
                    "Slee",
                    5,
                    "The best ever!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
