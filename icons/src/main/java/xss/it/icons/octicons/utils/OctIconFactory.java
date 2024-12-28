
package xss.it.icons.octicons.utils;

import xss.it.icons.GlyphsFactory;
import xss.it.icons.octicons.OctIcon;

/**
 *
 * @author XDSSWAR
 */
public class OctIconFactory extends GlyphsFactory {

    private static OctIconFactory me;

    private OctIconFactory() {
        super(OctIcon.class);
    }

    public static OctIconFactory get() {
        if (me == null) {
            me = new OctIconFactory();
        }
        return me;
    }

}
