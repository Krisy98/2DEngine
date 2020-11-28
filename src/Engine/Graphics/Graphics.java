package Engine.Graphics;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Graphics {

    private Stage stage;
    private Group root;

    public Graphics(Stage stage){
        this.stage = stage;
        this.root = new Group();
    }

    public Graphics(){}

    public void initiation(String title, Double width, Double height){
        Scene scene = new Scene(this.root);

        this.stage.setScene(scene);
    }

    public void addImage(ImageView imageView){
        this.root.getChildren().add(imageView);
    }

    //public void addEvent();

    public void display(){ this.stage.show(); }

    protected Group getRoot(){ return this.root; }

}
