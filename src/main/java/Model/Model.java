package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Model {
    private List<WordImagePair> availablePairs;
    private WordImagePair currentPair;
    private int totalGuesses;
    private int correctGuesses;
    private int incorrectGuesses;

    public Model(List<WordImagePair> wordImagePairs) {
        // Überprüfen Sie hier die Gültigkeit der übergebenen Liste
        if (wordImagePairs == null || wordImagePairs.isEmpty()) {
            throw new IllegalArgumentException("Die Liste der Wort-Bild-Paare ist ungültig.");
        }

        this.availablePairs = new ArrayList<>(wordImagePairs);
        this.currentPair = null;
        this.totalGuesses = 0;
        this.correctGuesses = 0;
        this.incorrectGuesses = 0;
    }

    public WordImagePair selectPair(int index) {
        if (index < 0 || index >= availablePairs.size()) {
            throw new IllegalArgumentException("Ungültiger Index.");
        }

        currentPair = availablePairs.get(index);
        return currentPair;
    }

    public WordImagePair selectRandomPair() {
        Random random = new Random();
        int randomIndex = random.nextInt(availablePairs.size());
        return selectPair(randomIndex);
    }

    public boolean guessWord(String guessedWord) {
        if (currentPair == null) {
            throw new IllegalStateException("Es wurde kein Wort-Bild-Paar ausgewählt.");
        }

        totalGuesses++;

        if (guessedWord.equalsIgnoreCase(currentPair.getWord())) {
            correctGuesses++;
            availablePairs.remove(currentPair);
            currentPair = null;
            return true;
        } else {
            incorrectGuesses++;
            return false;
        }
    }

    public int getTotalGuesses() {
        return totalGuesses;
    }

    public int getCorrectGuesses() {
        return correctGuesses;
    }

    public int getIncorrectGuesses() {
        return incorrectGuesses;
    }
}
