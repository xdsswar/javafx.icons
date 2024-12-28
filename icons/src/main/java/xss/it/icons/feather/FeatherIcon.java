/*
 * Copyright © 2024. XTREME SOFTWARE SOLUTIONS
 *
 * All rights reserved. Unauthorized use, reproduction, or distribution
 * of this software or any portion of it is strictly prohibited and may
 * result in severe civil and criminal penalties. This code is the sole
 * proprietary of XTREME SOFTWARE SOLUTIONS.
 *
 * Commercialization, redistribution, and use without explicit permission
 * from XTREME SOFTWARE SOLUTIONS, are expressly forbidden.
 */

package xss.it.icons.feather;

import javafx.scene.text.Font;
import xss.it.icons.GlyphIcon;
import xss.it.icons.Res;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author XDSSWAR
 * Created on 12/27/2024
 */
public class FeatherIcon extends GlyphIcon<Feather> {
    public final static String TTF_PATH = "/fonts/feather.ttf";

    static {
        try {
            Font.loadFont(Res.load(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            Logger.getLogger(FeatherIcon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public FeatherIcon(Feather icon, String iconSize){
        super(Feather.class);
        setIcon(icon);
        setStyle(String.format("-fx-font-family: %s; -fx-font-size: %s;", icon.fontFamily(), iconSize));
    }

    public FeatherIcon(Feather icon){
        this(icon, "1em");
    }

    public FeatherIcon(){
        this(Feather.HOME);
    }

    @Override
    public Feather getDefaultGlyph() {
        return Feather.HOME;
    }
}
