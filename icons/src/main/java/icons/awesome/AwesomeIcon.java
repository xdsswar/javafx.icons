
package icons.awesome;

import javafx.scene.text.Font;
import xss.it.icons.GlyphIcon;
import xss.it.icons.Res;
import xss.it.icons.awesome.Awesome;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XDSSWAR
 */
public class AwesomeIcon extends GlyphIcon<Awesome> {

    public final static String TTF_PATH = "/fonts/fontawesome-webfont.ttf";

    static {
        try {
            Font.loadFont(Res.load(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            Logger.getLogger(AwesomeIcon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public AwesomeIcon(Awesome icon, String iconSize) {
        super(Awesome.class);
        setIcon(icon);
        setStyle(String.format("-fx-font-family: %s; -fx-font-size: %s;", icon.fontFamily(), iconSize));
    }

    public AwesomeIcon(Awesome icon) {
        this(icon, "1em");
    }

    public AwesomeIcon() {
        this(Awesome.ANCHOR);
    }

    @Override
    public Awesome getDefaultGlyph() {
        return Awesome.ANCHOR;
    }

}
