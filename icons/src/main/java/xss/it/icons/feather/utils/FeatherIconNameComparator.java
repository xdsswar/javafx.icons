
package xss.it.icons.feather.utils;


import xss.it.icons.feather.Feather;

import java.util.Comparator;

/**
 *
 * @author XDSSWAR
 */
public class FeatherIconNameComparator implements Comparator<Feather> {

    @Override
    public int compare(Feather o1, Feather o2) {
        if(o1 != null && o2 != null){
            return o1.name().compareTo(o2.name());
        }
        return 0;
    }
}
