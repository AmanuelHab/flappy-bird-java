import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Pipe {
    private int x;
    private int topY;
    private int width;
    private int height;
    private Image topImage;
    private Image bottomImage;
    private boolean passed;

    private static final int VELOCITY_X = -4;
    private static final int GAP = 150;

    /**
     * Constructor for Pipe pair.
     *
     * startX     initial x position (starts from the right)
     * topY       initial y position of the top pipe
     * width      width of the pipe image
     * height     height of the pipe image
     * topImage    image for the top pipe
     * bottomImage image for the bottom pipe
     */
    public Pipe(int startX, int topY, int width, int height, Image topImage, Image bottomImage) {
        this.x = startX;
        this.topY = topY;
        this.width = width;
        this.height = height;
        this.topImage = topImage;
        this.bottomImage = bottomImage;
        this.passed = false;
    }

    public void move() {
        x += VELOCITY_X;
    }

    /**
     * Draws both the top and bottom pipe on screen.
     *
     * g the Graphics context
     */
    public void draw(Graphics g) {
        g.drawImage(topImage, x, topY, width, height, null);
        int bottomY = topY + height + GAP;
        g.drawImage(bottomImage, x, bottomY, width, height, null);
    }
    public Rectangle getTopBounds() {
        return new Rectangle(x, topY, width, height);
    }

    /**
     * Gets the bounding rectangle of the bottom pipe for collision detection.
     *
     * @return bounding Rectangle for bottom pipe
     */
    public Rectangle getBottomBounds() {
        int bottomY = topY + height + GAP;
        return new Rectangle(x, bottomY, width, height);
    }

    // Getter methodss
    public int getX() {
        return x;
    }

    public int getWidth() {
        return width;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
