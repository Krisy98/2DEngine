package Engine.Events.Controllers;

import Engine.Events.Enumerations.KeyEventType;

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

    /**
     * Get every controllers are of the specific KeyEventType type
     * @param type
     * @return controllers of type type
     */
    public List<Controller> getControllers(KeyEventType type){
        List<Controller> temp = new ArrayList<>();

        for (Controller controller : controllers) {
            if (controller.getName() == type.name()) temp.add(controller);
        }
        return temp;
    }

}
