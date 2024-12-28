
package icons.emoji.utils;

import xss.it.icons.GlyphsFactory;
import xss.it.icons.emoji.EmojiIcon;

/**
 *
 * @author XDSSWAR
 */
public class EmojiOneFactory extends GlyphsFactory {

    private static EmojiOneFactory me;

    private EmojiOneFactory() {
        super(EmojiIcon.class);
    }

    public static EmojiOneFactory get() {
        if (me == null) {
            me = new EmojiOneFactory();
        }
        return me;
    }

}
