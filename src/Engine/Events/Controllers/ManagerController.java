package Engine.Events.Controllers;

import java.util.ArrayList;
import java.util.List;

public class ManagerController {

    private List<Controller> controllers;

    public ManagerController(){
        controllers = new ArrayList<>();
    }

    /**
     * Add the controller to the list controllers
     * @param controller is the element to add
     */
    public void addController(Controller controller){
        controllers.add(controller);
    }

    public List<Controller> getControllers(){ return controllers; }



}
