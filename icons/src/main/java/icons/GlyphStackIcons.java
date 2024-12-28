
package icons;

import xss.it.icons.GlyphIcons;

/**
 *
 * @author XDSSWAR
 */
public interface GlyphStackIcons<T extends Enum<T> & GlyphIcons> {

    String name();

    T[] getGlyphs();

}
