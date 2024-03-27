package com.example.methodiainternship.exercises;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadDataFromExcel {

    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(new File("C:\\Users\\katev\\OneDrive\\Documents\\TestExcel.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheetAt(0);

        Map<Integer, List<String>> data = new HashMap<>();
        int i = 0;
        for (Row row : sheet) {
            data.put(i, new ArrayList<String>());
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        data.get(i).add(cell.getRichStringCellValue().getString());
                        break;
                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            data.get(i).add(cell.getDateCellValue() + "");
                        } else {
                            data.get(i).add(cell.getNumericCellValue() + "");
                        }
                        break;
                    case BOOLEAN:
                        data.get(i).add(cell.getBooleanCellValue() + "");
                        break;
                    case FORMULA:
                        data.get(i).add(cell.getCellFormula() + "");
                        break;
                    default:
                        data.get(i).add(" ");
                }
            }
            i++;
        }

        for (Map.Entry<Integer, List<String>> entry : data.entrySet()) {
            System.out.println("Row " + entry.getKey() + ": " + entry.getValue());
        }

        workbook.close();
        file.close();
    }
}

/* Задача номер 5.
В pom.xml добавих Apache POI зависимостта.
Програмата чете всеки cell имайки предвид неговия вид (STRING, NUMERIC, BOOLEAN или FORMULA).
 */
