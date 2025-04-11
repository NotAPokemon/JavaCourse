package Utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class StringUtils {

    private static DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(Locale.getDefault());
    private static DecimalFormatSymbols symbols = df.getDecimalFormatSymbols();
    static{
        symbols.setGroupingSeparator(',');
        df.setDecimalFormatSymbols(symbols);
    }
    public static String toCommaString(double value){
        String formattedNumber = df.format(value);
        return formattedNumber;
    }
    public static String toCommaString(int value){
        String formattedNumber = df.format(value);
        return formattedNumber;
    }

    public static String toCommaString(float value){
        String formattedNumber = df.format(value);
        return formattedNumber;
    }
}
