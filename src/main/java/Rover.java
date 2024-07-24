import java.util.logging.Logger;

public class Rover{
    private static final Logger logger = Logger.getLogger(Rover.class.getName());

    private Position position;
    private Direction direction;

    public Rover(Position position, Direction direction){
        this.position = position;
        this.direction = direction;
    }

    public Position getPosition(){
        return position;
    }

    public Direction getDirection(){
        return direction;
    }

    public void move(){
        switch (direction) {
            case NORTH: position.setY(position.getY() + 1);
                break;
            case EAST:  position.setX(position.getX() + 1);
                break;
            case SOUTH: position.setY(position.getY() - 1);
                break;
            case WEST:  position.setX(position.getX() - 1);
                break;
        }
        logger.info("Rover moved to " + position.getX() + ", " + position.getY());
    }

    public void turnLeft() {
        direction = direction.turnLeft();
        logger.info("Rover turned left, now facing " + direction);
    }

    public void turnRight() {
        direction = direction.turnRight();
        logger.info("Rover turned right, now facing " + direction);
    }

    public String getStatusReport() {
        return String.format("Rover is at (%d, %d) facing %s.",
                position.getX(), position.getY(), direction);
    }

}
