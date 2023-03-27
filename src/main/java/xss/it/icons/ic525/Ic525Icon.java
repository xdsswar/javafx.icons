
package xss.it.icons.ic525;

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
public class Ic525Icon extends GlyphIcon<Ic525> {

    public final static String TTF_PATH = "/fonts/525icons.ttf";

    static {
        try {
            Font.loadFont(Res.load(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            Logger.getLogger(Ic525Icon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Ic525Icon(Ic525 icon, String iconSize) {
        super(Ic525.class);
        setIcon(icon);
        setStyle(String.format("-fx-font-family: %s; -fx-font-size: %s;", icon.fontFamily(), iconSize));
    }

    public Ic525Icon(Ic525 icon) {
        this(icon, "1em");
    }

    public Ic525Icon() {
        this(Ic525.ACCESS);
    }

    @Override
    public Ic525 getDefaultGlyph() {
        return Ic525.ACCESS;
    }

}
