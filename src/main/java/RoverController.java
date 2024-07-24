import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RoverController{
    private Rover rover;
    private Grid grid;
    private static final Logger logger = Logger.getLogger(RoverController.class.getName());

    public RoverController(Rover rover, Grid grid) {
        this.rover = rover;
        this.grid = grid;
    }

    public void executeCommands(List<Command> commands) {
        for (Command command : commands) {
            try {
                command.execute(rover, grid);
            } catch (Exception e) {
                logger.warning("Error executing command");
            }
        }
    }

    public String getStatusReport() {
        return rover.getStatusReport();
    }
}
