
package icons.awesome.utils;


import xss.it.icons.GlyphsFactory;
import xss.it.icons.awesome.AwesomeIcon;

/**
 *
 * @author XDSSWAR
 */
public class FontAwesomeIconFactory extends GlyphsFactory {

    private static FontAwesomeIconFactory me;

    private FontAwesomeIconFactory() {
        super(AwesomeIcon.class);
    }

    public static FontAwesomeIconFactory get() {
        if (me == null) {
            me = new FontAwesomeIconFactory();
        }
        return me;
    }

}
