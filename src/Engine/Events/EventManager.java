package Engine.Events;

import Engine.Controller.Controller;
import java.util.List;

public abstract class EventManager {

    List<Controller> controllers;

    public abstract void createKeyEvent(KeyEventType type);

    public abstract void createMouseEvent(MouseEventType type);

}
