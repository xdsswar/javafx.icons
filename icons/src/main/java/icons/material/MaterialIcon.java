
package icons.material;

import javafx.scene.text.Font;
import xss.it.icons.GlyphIcon;
import xss.it.icons.Res;
import xss.it.icons.material.Material;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XDSSWAR
 */
public class MaterialIcon extends GlyphIcon<Material> {

    public final static String TTF_PATH = "/fonts/MaterialIcons-Regular.ttf";

    static {
        try {
            Font.loadFont(Res.load(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            Logger.getLogger(MaterialIcon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public MaterialIcon(Material icon, String iconSize) {
        super(Material.class);
        setIcon(icon);
        setStyle(String.format("-fx-font-family: %s; -fx-font-size: %s;", icon.fontFamily(), iconSize));
    }

    public MaterialIcon(Material icon) {
        this(icon, "1em");
    }
    
    public MaterialIcon() {
        this(Material.ANDROID);
    }

    @Override
    public Material getDefaultGlyph() {
        return Material.ANDROID;
    }

}
