import java.util.logging.Logger;

public class MoveCommand implements Command{

    private static final Logger logger = Logger.getLogger(MoveCommand.class.getName());

    @Override
    public void execute(Rover rover, Grid grid){
        Position newPosition = calculateNewPosition(rover);
        if (grid.isValidPosition(newPosition)) {
            rover.move();
        } else {
            logger.warning("Failed: Obstacle detected or out of bounds");
        }
    }

    private Position calculateNewPosition(Rover rover){
        Position currentPosition = rover.getPosition();
        int x = currentPosition.getX();
        int y = currentPosition.getY();

        switch (rover.getDirection()) {
            case NORTH: y++;
                break;
            case EAST:  x++;
                break;
            case SOUTH: y--;
                break;
            case WEST:  x--;
                break;
        }

        return new Position(x, y);
    }
}
