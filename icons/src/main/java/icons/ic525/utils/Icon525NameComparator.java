
package icons.ic525.utils;

import xss.it.icons.ic525.Ic525;

import java.util.Comparator;

/**
 *
 * @author XDSSWAR
 */
public class Icon525NameComparator implements Comparator<Ic525> {

    @Override
    public int compare(Ic525 o1, Ic525 o2) {
        if(o1 != null && o2 != null){
            return o1.name().compareTo(o2.name());
        }
        return 0;
    }
}
