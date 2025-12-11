import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Input extends KeyAdapter {
    private GamePanel gamePanel;

    /**
     * Constructor that takes the GamePanel to control.
     *
     * @param gamePanel reference to the main game panel
     */
    public Input(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        // Space bar pressed: make bird jump or reset if game over
        if (key == KeyEvent.VK_SPACE) {
            if (gamePanel.isGameOver()) {
                gamePanel.resetGame();
            } else {
                gamePanel.getBird().jump();
            }
        }
    }
}

