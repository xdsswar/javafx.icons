
package xss.it.icons.weather.utils;

import xss.it.icons.GlyphsFactory;
import xss.it.icons.weather.WeatherIcon;

/**
 *
 * @author JXDSSWAR
 */
public class WeatherIconFactory extends GlyphsFactory {

    private static WeatherIconFactory me;

    private WeatherIconFactory() {
        super(WeatherIcon.class);
    }

    public static WeatherIconFactory get() {
        if (me == null) {
            me = new WeatherIconFactory();
        }
        return me;
    }

}
