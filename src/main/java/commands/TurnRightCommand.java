package commands;

import models.Grid;
import models.Rover;

public class TurnRightCommand implements Command{

    @Override
    public void execute(Rover rover, Grid grid){
        rover.turnRight();
    }

}
