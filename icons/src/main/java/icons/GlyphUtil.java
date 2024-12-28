package icons;

import javafx.scene.text.Font;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GlyphUtil {

    private static final double DEFAULT_SIZE = 12.0;

    private static final Pattern PATTERN = Pattern.compile("(?<number>([\\d]+(\\.\\d+)?))(?<unit>[a-z]*|%)");

    public static Number convert(String sizeString, Font font) {
        /*
         * CSS absolute scaling values
         *
         * source: https://drafts.csswg.org/css-fonts-3/
         *
         * CSS absolute-size values | xx-small |  x-small |    small |   medium |    large |  x-large | xx-large |          |
         * scaling factor           |      3/5 |      3/4 |      8/9 |        1 |      6/5 |      3/2 |      2/1 |      3/1 |
         */
        return switch (sizeString) {
            /*
             * CSS absolute scaling values
             *
             * source: https://drafts.csswg.org/css-fonts-3/
             *
             * CSS absolute-size values | xx-small |  x-small |    small |   medium |    large |  x-large | xx-large |          |
             * scaling factor           |      3/5 |      3/4 |      8/9 |        1 |      6/5 |      3/2 |      2/1 |      3/1 |
             */
            case "" -> DEFAULT_SIZE;
            case "xx-small" -> DEFAULT_SIZE * 3 / 5;
            case "x-small" -> DEFAULT_SIZE * 3 / 4;
            case "small" -> DEFAULT_SIZE * 8 / 9;
            case "medium" -> DEFAULT_SIZE;
            case "large" -> DEFAULT_SIZE * 6 / 5;
            case "x-large" -> DEFAULT_SIZE * 3 / 2;
            case "xx-large" -> DEFAULT_SIZE * 2;
            /*
             * relative sizes are computed relative to the supplied refernce font.
             * values are taken from the same specification as above.
             */
            case "smaller" -> font.getSize() * 8 / 9;
            case "larger" -> font.getSize() * 6 / 5;
            /*
             * Relative sizes with different length units are parsed accordingly.
             */
            default -> parseRelativeSize(sizeString, font);
        };
    }

    private static Number parseRelativeSize(String sizeString, Font font) {
        // get size of base font
        double baseSize = font.getSize();

        // extract number and unit
        Matcher matcher = PATTERN.matcher(sizeString);

        if (!matcher.matches()) {
            return DEFAULT_SIZE;
        }

        String numberString = matcher.group("number");
        double sz = Double.parseDouble(numberString);

        String unit = matcher.group("unit");

        // do the conversion
        return switch (unit) {
            case "em" -> baseSize * sz;        // relative to base font size
            case "%" -> baseSize * sz / 100.0; // relative to base font size (percent)
            // treat as px
            case "", "px" -> sz;                   // absolute
            case "pt" -> sz * 16 / 12;             // 1 pt = 1/72 inch - the exact factor depends on display resolution!
            case "pc" -> sz * 16;                // 1 pica is 12 points
            default ->
                    // Maybe  this should be: throw new IllegalArgumentException("unknown size unit: '"+unit+"'");
                    DEFAULT_SIZE;
        };
    }
}