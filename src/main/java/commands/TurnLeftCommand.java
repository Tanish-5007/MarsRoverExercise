package commands;

import models.Grid;
import models.Rover;

public class TurnLeftCommand implements Command{

    @Override
    public void execute(Rover rover, Grid grid){
        rover.turnLeft();
    }

}