/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Owner
 */
public class UIMenu extends MenuBar {
    
    private final Stage window;
    
    private HBox menubars;
    
    private MenuItem open, export, save;
   
    private String file_name;
    private File selected_file;
    
    private boolean user_saved = false;
    
    private Image image;
            
    public UIMenu(Stage window) {
        this.window = window;

        Menu file = createMenuFile();
        
        /*open.setOnAction((ActionEvent event) -> {
            fh.showExitWarning(false);
        });*/
        
        getMenus().addAll(file);
    }
    
    /**
     * 
     * @return file Menu
     */
    private Menu createMenuFile() {        
        Menu file = new Menu("File");
        
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        export = new MenuItem("Export");
        file.getItems().addAll(open, save, export);
        
        open.setOnAction((ActionEvent event) -> {
            open();
        });
        
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
    
    /**
     * Allows the user to pick an image file from their local directory for 
     * analysis.
     */
    private void open() {
        try {
            FileChooser file_chooser = new FileChooser();
            file_chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PNG Files", "*.png"),
                new FileChooser.ExtensionFilter("JPG Files", "*jpg")
            );
            
            File file = file_chooser.showOpenDialog(window);
            
            try {
                selected_file = file;
                FileInputStream input_stream = new FileInputStream(selected_file);
                Image image = new Image(input_stream);
                
                System.out.println("Opened file " + selected_file.toString());
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e);
        }
    }
}
