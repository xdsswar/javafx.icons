
package xss.it.icons.awesome.utils;


import xss.it.icons.awesome.Awesome;

import java.util.Comparator;

/**
 *
 * @author XDSSWAR
 */
public class FontAwesomeIconNameComparator implements Comparator<Awesome> {

    @Override
    public int compare(Awesome o1, Awesome o2) {
        if(o1 != null && o2 != null){
            return o1.name().compareTo(o2.name());
        }
        return 0;
    }
}
