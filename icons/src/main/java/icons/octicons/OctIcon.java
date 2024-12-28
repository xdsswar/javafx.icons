
package icons.octicons;

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
public class OctIcon extends GlyphIcon<Oct> {

    public final static String TTF_PATH = "/fonts/octicons.ttf";

    static {
        try {
            Font.loadFont(Res.load(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            Logger.getLogger(OctIcon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public OctIcon(Oct icon, String iconSize) {
        super(Oct.class);
        setIcon(icon);
        setStyle(String.format("-fx-font-family: %s; -fx-font-size: %s;", icon.fontFamily(), iconSize));
    }

    public OctIcon(Oct icon) {
        this(icon, "1em");
    }

    public OctIcon() {
        this(Oct.MARK_GITHUB);
    }

    @Override
    public Oct getDefaultGlyph() {
        return Oct.MARK_GITHUB;
    }

}
