package es.unileon.prg1.wordle;

public class Wordle {

    public String source;
    public Source fuente;
    public int wordLength;
    public int numTries;

    public Wordle(Source fuente, int wordLength, int numTries) {
        this.source = fuente.toString();
        this.wordLength = wordLength;
        this.numTries = numTries;
    }

}
