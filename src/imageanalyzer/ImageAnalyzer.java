/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageanalyzer;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import ui.UIMenu;

/**
 *
 * @author Owner
 */
public class ImageAnalyzer extends Application {
    
    private UIMenu menu;
    
    @Override
    public void start(Stage primaryStage) {
        
        // Create various ui-components from their respective classes
        menu = new UIMenu();
        menu.getStyleClass().add("menu");
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        
        VBox root = new VBox();
        
        // Add ui components to main application
        root.getChildren().add(menu);
        
        // Set Window Dimensions
        Scene scene = new Scene(root, 500, 500);
        
        scene.getStylesheets().clear();
        scene.getStylesheets().add("/stylesheets/styles.css");
        
        primaryStage.setTitle("Image Analyzer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void styleGUI() {
        menu.applyCss();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
