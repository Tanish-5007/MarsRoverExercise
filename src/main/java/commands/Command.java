package commands;

import models.Grid;
import models.Rover;

public interface Command {
    void execute(Rover rover, Grid grid);
}
