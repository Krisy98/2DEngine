package Engine.Graphics;

import Engine.Events.EventManager;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Graphics extends EventManager {

    private Stage stage;
    private Group root;

    public Graphics(Stage stage){
        this.stage = stage;
        this.root = new Group();

        super.setRoot(this.root);
    }

    /**
     * Initialisation of the graphic scene with params
     * @param title of the window
     * @param width of the scene
     * @param height of the scene
     */
    public void initiation(String title, Double width, Double height){
        Scene scene = new Scene(this.root);

        this.stage.setScene(scene);

        //Node node = this.root.getChildren().get(0);
        //node.getParent();
    }

    /**
     * Add a ImageView to the graphic scene
     * @param imageView is the element to add
     */
    public void addImage(ImageView imageView){
        this.root.getChildren().add(imageView);
    }

    /**
     * Open a window to show the graphic scene
     */
    public void display(){ this.stage.show(); }

    protected Group getRoot(){ return this.root; }

}
