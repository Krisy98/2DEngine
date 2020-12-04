package Engine.Events.Controllers;

import javafx.event.EventHandler;

public class Controller {

    private EventHandler eventHandler;

    public EventHandler getEventHandler(){ return eventHandler; }

    public void setEventHandler(EventHandler eventHandler){ this.eventHandler = eventHandler; }

}
