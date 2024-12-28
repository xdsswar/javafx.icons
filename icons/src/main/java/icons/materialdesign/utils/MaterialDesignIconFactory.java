
package icons.materialdesign.utils;

import xss.it.icons.GlyphsFactory;
import xss.it.icons.materialdesign.MaterialDesignIcon;

/**
 *
 * @author XDSSWAR
 */
public class MaterialDesignIconFactory extends GlyphsFactory {

    private static MaterialDesignIconFactory me;

    private MaterialDesignIconFactory() {
        super(MaterialDesignIcon.class);
    }

    public static MaterialDesignIconFactory get() {
        if (me == null) {
            me = new MaterialDesignIconFactory();
        }
        return me;
    }

}
