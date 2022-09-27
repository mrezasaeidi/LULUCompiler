package tablecreator;

import java.util.HashMap;
import java.util.List;

public class Utils {
    public static DataType getDataTypeFromString(String dataType, boolean isArray) {
        if (isArray) {
            switch (dataType) {
                case "integer":
                    return DataType.INTEGER_ARRAY;
                case "real":
                    return DataType.REAL_ARRAY;
                case "boolean":
                    return DataType.BOOLEAN_ARRAY;
            }
        } else {
            switch (dataType) {
                case "integer":
                    return DataType.INTEGER;
                case "real":
                    return DataType.REAL;
                case "boolean":
                    return DataType.BOOLEAN;
            }
        }
        return null;
    }

    public static String getExpression(String input, HashMap<String, TableVM> symbolTable, List<Exception> errors) {
        boolean isNumber = false;
        int start = -1;
        int end = -1;
        String output = input;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 48 && ch <= 57) {
                if (start != -1) {
                    end = i + 1;
                    isNumber = true;
                }
            } else {
                if (isNumber) {
                    isNumber = false;
                    i--;
                }
            }
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                if (start == -1) {
                    start = i;
                    end = i + 1;
                } else {
                    end = i;
                }
            } else {
                if (start != -1 && !isNumber) {
                    String temp = output.substring(start, end);
                    String val = symbolTable.get(temp).getValue();
                    if (val.equals("undefined")) {
                        val = temp;
                        errors.add(new Exception("\"" + val + "\" has no value."));
                    }
                    String t1 = output.substring(0, start);
                    String t2 = output.substring(end);
                    output = output.substring(0, start) + val + input.substring(end, input.length());
                    start = -1;
                    isNumber = false;
                }
            }
        }
        return output;
    }
}
