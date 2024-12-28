
package xss.it.icons.materialdesign.utils;

import xss.it.icons.materialdesign.MaterialDesign;

import java.util.Comparator;

/**
 *
 * @author XDSSWAR
 */
public class MaterialDesignIconNameComparator implements Comparator<MaterialDesign> {

    @Override
    public int compare(MaterialDesign o1, MaterialDesign o2) {
        if(o1 != null && o2 != null){
            return o1.name().compareTo(o2.name());
        }
        return 0;
    }
}
