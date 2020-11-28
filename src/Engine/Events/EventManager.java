package Engine.Events;

import Engine.Controller.Controller;
import Engine.Events.Enumerations.EventType;

import java.util.List;

public abstract class EventManager {

    private List<Controller> controllers;

    /**
     * Create a Controller with the Event type necessary
     * Add it to his list of controllers
     * And return the controller
     */
    public abstract Controller createController(EventType type);

    public List<Controller> getControllers(){ return controllers; }

}
