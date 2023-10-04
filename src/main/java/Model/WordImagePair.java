package Model;

public class WordImagePair {
    private String word;
    private String imageUrl;

    public WordImagePair(String word, String imageUrl) {
        if (word == null || imageUrl == null || word.isEmpty() || imageUrl.isEmpty()) {
            throw new IllegalArgumentException("Ungültige Werte für Wort oder Bild-URL.");
        }

        this.word = word;
        this.imageUrl = imageUrl;
    }

    public String getWord() {
        return word;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
