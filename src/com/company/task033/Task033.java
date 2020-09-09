package com.company.task033;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.InvalidParameterException;
import java.text.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task033 {
    public static void run(String[] args) {

        //receive console arguments

        String filePath = null;
        Date date = null;
        if (args.length == 2) {
            filePath = args[0];
            SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy");
            try {
                date = sf.parse(args[1]);
            } catch (ParseException e) {
                System.out.println("Date format was wrong");
                return;
            }
        } else {
            throw new InvalidParameterException("args length was not 2");
        }


        try {
            System.out.println("Number of restrictions on " + date + ": " + findNumberOfRestrictionsByDate(date, filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
    }

    private static int findNumberOfRestrictionsByDate(Date date, String filePath) throws FileNotFoundException {
        FileReader fileReader = fileReader = new FileReader(filePath);

        Scanner scanner = new Scanner(fileReader);
        SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy");

        while (scanner.hasNext()) {
            String[] split = scanner.nextLine().split("\t");

            if (split.length == 0) continue;

            Date tableDate = null;
            try {
                tableDate = sf.parse(split[0]);
            } catch (ParseException e) {
                System.out.println("Invalid date format.. skip.");
                continue;
            }

            if (tableDate.equals(date)) {
                if (split.length > 1) {
                    String[] restrictions = split[1].split(", ");
                    return restrictions.length;
                }
                break;
            }
        }

        return 0;
    }
}
