
package xss.it.icons.ic525.utils;

import xss.it.icons.GlyphsFactory;
import xss.it.icons.ic525.Ic525Icon;

/**
 *
 * @author XDSSWAR
 */
public class Icon525Factory extends GlyphsFactory {

    private static Icon525Factory me;

    private Icon525Factory() {
        super(Ic525Icon.class);
    }

    public static Icon525Factory get() {
        if (me == null) {
            me = new Icon525Factory();
        }
        return me;
    }

}
