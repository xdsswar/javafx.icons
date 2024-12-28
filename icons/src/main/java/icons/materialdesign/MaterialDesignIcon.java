
package icons.materialdesign;

import javafx.scene.text.Font;
import xss.it.icons.GlyphIcon;
import xss.it.icons.Res;
import xss.it.icons.materialdesign.MaterialDesign;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XDSSWAR
 */
public class MaterialDesignIcon extends GlyphIcon<MaterialDesign> {

    public final static String TTF_PATH = "/fonts/m-webfont.ttf";

    static   {
        try {
            Font.loadFont(Res.load(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            Logger.getLogger(MaterialDesignIcon.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public MaterialDesignIcon(MaterialDesign icon, String iconSize) {
        super(MaterialDesign.class);
        setIcon(icon);
        setStyle(String.format("-fx-font-family: %s; -fx-font-size: %s;", icon.fontFamily(), iconSize));
    }

    public MaterialDesignIcon(MaterialDesign icon) {
        this(icon, "1em");
    }
    
    public MaterialDesignIcon() {
        this(MaterialDesign.ANDROID);
    }

    @Override
    public MaterialDesign getDefaultGlyph() {
        return MaterialDesign.ANDROID;
    }

}
