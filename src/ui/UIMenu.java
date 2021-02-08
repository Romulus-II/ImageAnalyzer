/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;

/**
 *
 * @author Owner
 */
public class UIMenu extends MenuBar {
    
    private HBox menubars;
    
    private MenuItem open, export, save;
   
    public UIMenu() {
        Menu file = createMenuFile();
        
        /*open.setOnAction((ActionEvent event) -> {
            fh.showExitWarning(false);
        });*/
        
        getMenus().addAll(file);
    }
    
    
    private Menu createMenuFile() {
        Menu file = new Menu("File");
        
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        export = new MenuItem("Export");
        file.getItems().addAll(open, save, export);
        
        /*open.setOnAction((ActionEvent event) -> {
            fh.showExitWarning(false);
        });*/
        
        return file;
    }
    
    /**
     * Returns the physical menu component that will be used in the ui.
     * 
     * @return menubars HBox
     */
    /*public HBox getDisplay(){
        return menubars;
    }*/
}
