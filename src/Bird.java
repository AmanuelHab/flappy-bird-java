package src;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Rectangle;
/**
 * Bird class manages the bird's position, movement, and drawing.
 */
public class Bird {
    private int x;
    private int y;
    private int width;
    private int height;
    private BufferedImage img = Assets.BIRD;
    private int velocityY;
    private int gravity = 1;
    private static final int JUMP_FORCE = -9;

    public Bird(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        // this.img = Assets.BIRD; Avoid loading images in constructor
        this.velocityY = 0;
    }

    /**
     * Updates the bird's position by applying gravity.
     */
    public void move() {
        velocityY += gravity;
        y += velocityY;
        // Prevent the bird from moving above the top of the panel
        if (y < 0) {
            y = 0;
            velocityY = 0;
        }
    }
    /**
     * Causes the bird to jump by setting its vertical velocity.
     */
    public void jump() {
        velocityY = JUMP_FORCE;
    }

    // Draws the bird on the screen
    public void draw(Graphics g) {
        g.drawImage(img, x, y, width, height, null);
    }

      //Resets the bird to the given position and stops vertical movement.
    public void reset(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        this.velocityY = 0;
    }
    
     //Gets the bounding rectangle of the bird for collision detection.
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

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }
}
