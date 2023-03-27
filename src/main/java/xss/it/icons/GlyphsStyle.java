
package xss.it.icons;

/**
 * @author XDSSWAR
 */
public enum GlyphsStyle {

    DEFAULT("/styles/glyphs.css"),
    DARK("/styles/glyphs_dark.css"),
    LIGHT("/styles/glyphs_light.css"),
    BLUE("/styles/glyphs_blue.css"),
    RED("/styles/glyphs_red.css");
    
    private final String stylePath;

    private GlyphsStyle(String stylePath) {
        this.stylePath = stylePath;
    }

    public String getStylePath() {
        return stylePath;
    }

    @Override
    public String toString() {
        return stylePath;
    }
}
