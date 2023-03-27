
package xss.it.icons.weather;

import javafx.scene.text.Font;
import xss.it.icons.GlyphIcon;
import xss.it.icons.Res;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XDSSWAR
 */
public class WeatherIcon extends GlyphIcon<Weather> {

    public final static String TTF_PATH = "/fonts/weathericons-regular-webfont.ttf";

    static {
        try {
            Font.loadFont(Res.load(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            Logger.getLogger(WeatherIcon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public WeatherIcon(Weather icon, String iconSize) {
        super(Weather.class);
        setIcon(icon);
        setStyle(String.format("-fx-font-family: %s; -fx-font-size: %s;", icon.fontFamily(), iconSize));
    }

    public WeatherIcon(Weather icon) {
        this(icon, "1em");
    }

    public WeatherIcon() {
        this(Weather.CLOUD);
    }

    @Override
    public Weather getDefaultGlyph() {
        return Weather.CLOUD;
    }

}
