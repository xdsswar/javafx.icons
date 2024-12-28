
package icons.material.utils;

import xss.it.icons.GlyphsFactory;
import xss.it.icons.material.MaterialIcon;

/**
 *
 * @author XDSSWAR
 */
public class MaterialIconFactory extends GlyphsFactory {

    private static MaterialIconFactory me;

    private MaterialIconFactory() {
        super(MaterialIcon.class);
    }

    public static MaterialIconFactory get() {
        if (me == null) {
            me = new MaterialIconFactory();
        }
        return me;
    }

}
