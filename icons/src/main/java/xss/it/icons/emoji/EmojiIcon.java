
package xss.it.icons.emoji;

import javafx.scene.text.Font;
import xss.it.icons.GlyphIcon;
import xss.it.icons.Res;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XDSSWAR
 */
public class EmojiIcon extends GlyphIcon<Emoji> {

    public final static String TTF_PATH = "/fonts/emojione-svg.otf";

    static {
        try {
            Font.loadFont(Res.load(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            Logger.getLogger(EmojiIcon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public EmojiIcon(Emoji icon, String iconSize) {
        super(Emoji.class);
        setIcon(icon);
        setStyle(String.format("-fx-font-family: %s; -fx-font-size: %s;", icon.fontFamily(), iconSize));
    }

    public EmojiIcon(Emoji icon) {
        this(icon, "1em");
    }

    public EmojiIcon() {
        this(Emoji.GRINNING);
    }

    @Override
    public Emoji getDefaultGlyph() {
        return Emoji.GRINNING;
    }

}
