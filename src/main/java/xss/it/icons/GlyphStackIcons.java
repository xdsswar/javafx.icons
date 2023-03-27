
package xss.it.icons;

/**
 *
 * @author XDSSWAR
 */
public interface GlyphStackIcons<T extends Enum<T> & GlyphIcons> {

    String name();

    T[] getGlyphs();

}
