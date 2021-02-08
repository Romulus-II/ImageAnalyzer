/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageanalyzer;

import java.util.ArrayList;
import javafx.scene.paint.Color;

/**
 *
 * @author Owner
 */
public class Palette {
    
    
    private final ArrayList<Color> colors;
    
    private boolean saved;
    
    private String file_location;
    
    public Palette() {
        colors = new ArrayList<Color>();
        saved = false;
    }
    
    /**
     * @param color Color
     * 
     * Adds the color to the palette's internal list of stored colors (only if 
     * not already stored)
     */
    public void addColor(Color color) {
        if (colors.contains(color)) {
            colors.add(color);
        }
    }
}
