
package icons;

import javafx.scene.layout.StackPane;

import java.util.Collection;

/**
 *
 * @author XDSSWAR
 */
public class GlyphsStack extends StackPane {

    public static GlyphsStack create() {
        return new GlyphsStack();
    }


    public GlyphsStack add(GlyphIcon icon) {
        getChildren().add(icon);
        return this;
    }

    /**
     * Add all {@code icons} to this {@link GlyphsStack}. If the icons are {@code null} or empty,
     * nothing is performed.
     * @param icons The icons to add to this stack.
     * @return This instance of GlyphsStack.
     */
    public GlyphsStack addAll(GlyphIcon... icons) {
        if(icons != null && icons.length > 0) {
              this.getChildren().addAll(icons);
        }
        return this;
    }

    /**
     * Add all {@code icons} to this {@link GlyphsStack}. If the icons are {@code null} or empty,
     * nothing is performed.
     * @param icons The icons to add to this stack.
     * @return This instance of GlyphsStack.
     */
    public GlyphsStack addAll(Collection<? extends GlyphIcon> icons) {
        if(icons != null && !icons.isEmpty()) {
            this.getChildren().addAll(icons);
        }
        return this;
    }

    /**
     * Add all {@code icons} to this {@link GlyphsStack}. If the icons are {@code null} or empty,
     * nothing is performed.
     * @param index index at which to insert the first element from the specified collection.
     * @param icons The icons to add to this stack.
     * @return This instance of GlyphsStack.
     */
    public GlyphsStack addAll(int index, Collection<? extends GlyphIcon> icons) {
        if(icons != null && !icons.isEmpty()) {
            this.getChildren().addAll(index, icons);
        }
        return this;
    }

    public GlyphsStack remove(GlyphIcon icon) {
        getChildren().remove(icon);
        return this;
    }

}
