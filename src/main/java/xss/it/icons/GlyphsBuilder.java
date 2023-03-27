
package xss.it.icons;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XDSSWAR
 */
@SuppressWarnings("deprecation")
public class GlyphsBuilder {

    private GlyphIcon glyphIcon;

    private GlyphsBuilder(Class<? extends GlyphIcon> clazz) {
        try {

            glyphIcon = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(GlyphsBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static GlyphsBuilder create(Class<? extends GlyphIcon> clazz) {
        return new GlyphsBuilder(clazz);
    }

    public GlyphsBuilder glyph(GlyphIcons glyph) {
        glyphIcon.setGlyphName(glyph.name());
        return this;
    }

    public GlyphsBuilder size(String size) {
        
        glyphIcon.setSize(size);
        return this;
    }

    public GlyphsBuilder style(String style) {
        glyphIcon.setGlyphStyle(style);
        return this;
    }

    public GlyphsBuilder styleClass(String styleClass) {
        glyphIcon.setStyleClass(styleClass);
        return this;
    }

    public GlyphIcon build() {
        return glyphIcon;
    }

}
