import controller.RoverController;
import models.Direction;
import models.Grid;
import models.Position;
import models.Rover;
import commands.Command;
import commands.MoveCommand;
import commands.TurnLeftCommand;
import commands.TurnRightCommand;

import java.util.Arrays;
import java.util.List;

public class MarsRoverRunner {

    public static void main(String[] args) {

        Grid grid = new Grid(10, 10);
        grid.addObstacle(new Position(2, 2));
        grid.addObstacle(new Position(3, 5));

        Rover rover = new Rover(new Position(0, 0), Direction.NORTH);

        RoverController controller = new RoverController(rover, grid);

        List<Command> commands = Arrays.asList(
                new MoveCommand(),       // M
                new MoveCommand(),       // M
                new TurnRightCommand(),  // R
                new MoveCommand(),       // M
                new TurnLeftCommand(),   // L
                new MoveCommand()        // M
        );

        controller.executeCommands(commands);
        System.out.println(controller.getStatusReport());
        System.out.println("No Obstacles detected.");
    }
}
