import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Bird {
    private int x;
    private int y;
    private int width;
    private int height;
    private Image img;
    private int velocityY;
    private static final int GRAVITY = 1;
    private static final int JUMP_FORCE = -7;

    /**
     * Constructor for Bird.
     *
     * @param x      initial x position
     * @param y      initial y position
     * @param width  width of the bird image
     * @param height height of the bird image
     * @param img    the image of the bird
     */

    public Bird(int x, int y, int width, int height, Image img) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.img = img;
        this.velocityY = 0;
    }
    public void move() {
        velocityY += GRAVITY;
        y += velocityY;
        if (y < 0) {
            y = 0;
            velocityY = 0;
        }
    }

    public void jump() {
        velocityY = JUMP_FORCE;
    }

    /**
     * Draws the bird on the screen.
     *
     * @param g the Graphics context
     */
    public void draw(Graphics g) {
        g.drawImage(img, x, y, width, height, null);
    }

    /**
     * Resets the bird to the given position and stops vertical movement.
     *
     * @param newX new x position
     * @param newY new y position
     */
    public void reset(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        this.velocityY = 0;
    }

    /**
     * Gets the bounding rectangle of the bird for collision detection.
     *
     * @return the bounding Rectangle of the bird
     */
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }
}
