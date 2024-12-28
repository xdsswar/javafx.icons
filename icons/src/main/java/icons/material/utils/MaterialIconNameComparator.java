
package icons.material.utils;

import xss.it.icons.material.Material;

import java.util.Comparator;

/**
 *
 * @author XDSSWAR
 */
public class MaterialIconNameComparator implements Comparator<Material> {

    @Override
    public int compare(Material o1, Material o2) {
        if(o1 != null && o2 != null){
            return o1.name().compareTo(o2.name());
        }
        return 0;
    }
}
