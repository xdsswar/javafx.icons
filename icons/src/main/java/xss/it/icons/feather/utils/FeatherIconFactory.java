
package xss.it.icons.feather.utils;


import xss.it.icons.GlyphsFactory;
import xss.it.icons.feather.Feather;

/**
 *
 * @author XDSSWAR
 */
public class FeatherIconFactory extends GlyphsFactory {

    private static FeatherIconFactory me;

    private FeatherIconFactory() {
        super(Feather.class);
    }

    public static FeatherIconFactory get() {
        if (me == null) {
            me = new FeatherIconFactory();
        }
        return me;
    }

}
