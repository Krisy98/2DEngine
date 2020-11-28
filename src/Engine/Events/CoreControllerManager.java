package Engine.Events;

import Engine.Events.Controller.Controller;

import java.util.List;

public abstract class CoreControllerManager {

    private List<Controller> controllers;

    /**
     * Add the controller to the list controllers
     * @param controller is the element to add
     */
    public abstract void addController(Controller controller);

    public List<Controller> getControllers(){ return controllers; }

}
