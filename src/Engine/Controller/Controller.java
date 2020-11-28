package Engine.Controller;

import javafx.event.EventHandler;

public abstract class Controller {

    private EventHandler eventHandler;

    /**
     * Initialize the type of the Event of the attribute EventHandler
     */
    public abstract void init();

    public EventHandler getEventHandler(){ return eventHandler; }

}
