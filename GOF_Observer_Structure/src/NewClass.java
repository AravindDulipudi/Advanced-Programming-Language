// Define the states as constants
enum PlayerState {
    UNKNOWN, OPENED, PLAYING, STOPPED
}

// Custom exception class for BasicPlayer
class BasicPlayerException extends Exception {
    public BasicPlayerException(String message) {
        super(message);
    }
}

// Mock BasicPlayer class
public class BasicPlayer {
    private PlayerState state;
    private double gain;

    // Constructor
    public BasicPlayer() {
        this.state = PlayerState.UNKNOWN;
        this.gain = 0.5; // Default gain value
    }

    // Method to simulate opening a file
    public void open(String filePath) throws BasicPlayerException {
        System.out.println("MBP - Opening URL file:" + filePath);
        this.state = PlayerState.OPENED;
    }

    // Method to simulate playing a file
    public void play() throws BasicPlayerException {
        if (this.state == PlayerState.OPENED || this.state == PlayerState.STOPPED) {
            System.out.println("MBP - Playing...");
            this.state = PlayerState.PLAYING;
        } else {
            throw new BasicPlayerException("Invalid state for play: " + this.state);
        }
    }

    // Method to simulate stopping playback
    public void stop() throws BasicPlayerException {
        if (this.state == PlayerState.PLAYING) {
            System.out.println("MBP - Stopping play");
            this.state = PlayerState.STOPPED;
        } else {
            throw new BasicPlayerException("Invalid state for stop: " + this.state);
        }
    }

    // Method to simulate setting the gain (volume)
    public void setGain(double gain) {
        this.gain = gain;
        System.out.printf("MBP - Setting gain to %.2f%n", this.gain);
    }

    // Getter for the player's current state
    public PlayerState getStatus() {
        System.out.println("MBP - Getting status - status is " + this.state.ordinal());
        return this.state;
    }
}

// Mock PlayStopListener class
class PlayStopListener {
    private BasicPlayer player;

    public PlayStopListener(BasicPlayer player) {
        this.player = player;
    }

    // Method to simulate play button action
    public void playButtonPressed(String filePath) {
        try {
            if (player.getStatus() == PlayerState.PLAYING) {
                player.stop();
            } else {
                player.open(filePath);
                player.play();
            }
        } catch (BasicPlayerException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to simulate stop button action
    public void stopButtonPressed() {
        try {
            player.stop();
        } catch (BasicPlayerException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to simulate volume control action
    public void volumeChanged(double newGain) {
        player.setGain(newGain);
    }
}

// Main class to run the mock player (for testing)
public class MockPlayerTest {
    public static void main(String[] args) {
        BasicPlayer mockPlayer = new BasicPlayer();
        PlayStopListener listener = new PlayStopListener(mockPlayer);

        // Simulate user interactions
        listener.playButtonPressed("C:\\javaMP\\01 Carry On.mp3");
        listener.volumeChanged(0.75);
        listener.stopButtonPressed();
        // Add more tests as needed
    }
}

