
package xss.it.icons.octicons.utils;

import xss.it.icons.octicons.Oct;

import java.util.Comparator;

/**
 *
 * @author XDSSWAR
 */
public class OctIconNameComparator implements Comparator<Oct> {

    @Override
    public int compare(Oct o1, Oct o2) {
        if(o1 != null && o2 != null){
            return o1.name().compareTo(o2.name());
        }
        return 0;
    }
}
