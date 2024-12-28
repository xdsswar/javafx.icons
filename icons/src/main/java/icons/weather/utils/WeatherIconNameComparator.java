
package icons.weather.utils;

import xss.it.icons.weather.Weather;

import java.util.Comparator;

/**
 *
 * @author XDSSWAR
 */
public class WeatherIconNameComparator implements Comparator<Weather> {

    @Override
    public int compare(Weather o1, Weather o2) {
        if(o1 != null && o2 != null){
            return o1.name().compareTo(o2.name());
        }
        return 0;
    }
}
