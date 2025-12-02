// ===============================================
// ScoreManager.java
// ===============================================


//================================================
// IScoreManager Interface
//================================================
interface IScoreManager {
    void incrementScore();
    int getScore();
    void resetScore();
}

//================================================
// Implementation of IScoreManager
//================================================
public class ScoreManager implements IScoreManager {

    private int score;

    // Constructor to initialize score
    public ScoreManager() {
        this.score = 0;
    }

    // Implementing interface methods
    @Override
    public void incrementScore() {
        score++;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void resetScore() {
        score = 0;
    }
    
    // Future methods for high score persistence can be added here
    // e.g., saveHighScore(), loadHighScore()

    // Method to draw score on screen can be added here
    // e.g., drawScore(Graphics g)
    // This would depend on the graphics library being used Javafx,

    // testing main method
    public static void main(String[] args) {
        ScoreManager sm = new ScoreManager();
        sm.incrementScore();
        sm.incrementScore();
        System.out.println("Current Score: " + sm.getScore()); // Should print 2
        sm.resetScore();
        System.out.println("Score after reset: " + sm.getScore()); // Should print 0
    }


}


// 5. Alehegne — ScoreManager.java

// Why? Scoring & persistence is clean and separate.
// Responsibilities:
// Increment score when bird passes pipe
// Draw score on screen
// Handle high score saving/loading later
// Provide final score on death
// Feature branch: feature/alehegne/scoremanager