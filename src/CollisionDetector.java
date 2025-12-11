import java.awt.Rectangle;

public class CollisionDetector {

    /**
     * Checks if the bird collides with the given pipe (either top or bottom).
     *
     * @param bird the Bird object
     * @param pipe the Pipe object (pair of top and bottom)
     * @return true if there is a collision, false otherwise
     */
    public static boolean isColliding(Bird bird, Pipe pipe) {
        Rectangle birdBounds = bird.getBounds();

        if (birdBounds.intersects(pipe.getTopBounds()) || birdBounds.intersects(pipe.getBottomBounds())) {
            return true;
        }
        return false;
    }
}
