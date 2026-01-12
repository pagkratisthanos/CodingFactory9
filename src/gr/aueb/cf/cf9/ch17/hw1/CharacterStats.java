package gr.aueb.cf.cf9.ch17.hw1;

public class CharacterStats {

    private char character;
    private int frequency;
    private double percentage;

    public CharacterStats() {};

    public CharacterStats(char character, int frequency, double percentance) {
        this.character = character;
        this.frequency = frequency;
        this.percentage = percentance;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Character Stats: {Character: " + character + ", " +
                "Frequency: " + frequency + ", " +
                "Percentance: " + percentage + "}";
    }
}
