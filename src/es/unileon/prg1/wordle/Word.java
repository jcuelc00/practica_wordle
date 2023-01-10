package es.unileon.prg1.wordle;

import java.lang.Math;

public class Word {

    String selectedWord;
    int WordLength;

    public Word(Wordle wordle, int WordLength) {
        this.selectedWord = setWord(wordle, WordLength);
    }

    public String setWord(Wordle wordle, int WordLength) {

        String allWords[] = wordle.source.split("\n");
        String selectedWords = "";

        for (String string : allWords) {

            if (string.trim().length() == WordLength) {

                selectedWords += (" " + string.trim());

            }

        }

        String chosenOnes[] = selectedWords.split(" ");

        int randomNumber = (int) Math.round(Math.random() * (chosenOnes.length - 1));

        return (chosenOnes[randomNumber]);

    }

    public boolean isCorrect(String str) {

        if (str.equals(this.selectedWord)) {

            return (true);

        } else {

            return (false);

        }

    }

    public void selectColor(String str) {
        char strChar;

        for (int i = 0; i < str.trim().length(); i++) {

            strChar = str.charAt(i);
            Letter letter = new Letter(strChar);
            char selectedWordChar = this.selectedWord.charAt(i);

            Character c1 = new Character(selectedWordChar);
            Character c2 = new Character(strChar);

            if (isCorrect(str)) {

                System.out.print(letter.getGreenLetter());

            } else if (c1.equals(c2)) {

                System.out.print(letter.getGreenLetter());

            } else if (selectedWord.contains(Character.toString(strChar))) {

                System.out.print(letter.getYellowLetter());

            } else {

                System.out.print(letter.getNoColorLetter());

            }

        }

    }
}
