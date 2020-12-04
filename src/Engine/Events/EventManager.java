package Engine.Events;

import Engine.Events.Controllers.Controller;
import Engine.Events.Enumerations.KeyEventType;
import Engine.Events.Enumerations.MouseEventType;
import javafx.scene.Group;
import javafx.scene.Node;

public abstract class EventManager {

    private Group root;

    protected void setRoot(Group root){ this.root = root; }

    /**
     * Add a event to the graphic scene of type KeyEventType
     * @param controller contains operations for each event released
     * @param type define the event action
     */
    public void addEvent(Controller controller, KeyEventType type){
        switch (type){
            case PRESSED:
                this.root.getScene().setOnKeyPressed(controller.getEventHandler());
                break;
            case RELEASED:
                this.root.getScene().setOnKeyReleased(controller.getEventHandler());
                break;
        }
    }

    /**
     * Add a event to the graphic scene of type MouseEventType
     * @param controller contains operations for each event released
     * @param type define the event action
     */
    public void addEvent(Controller controller, MouseEventType type){
        switch (type){
            case RELEASED:
                this.root.getScene().setOnMouseReleased(controller.getEventHandler());
                break;
            case CLICKED:
                this.root.getScene().setOnMouseClicked(controller.getEventHandler());
                break;
            case MOVE:
                this.root.getScene().setOnMouseMoved(controller.getEventHandler());
                break;
        }
    }



}
