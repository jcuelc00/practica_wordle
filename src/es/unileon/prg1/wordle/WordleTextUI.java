package es.unileon.prg1.wordle;

public class WordleTextUI {

    Keyboard keyboard = new Keyboard();
    Source source;
    Wordle wordle;
    Word word;

    String dictionary;
    int tries;
    int wordSize;

    public void init() {

        System.out.println("What dictionary do you want to use?");
        System.out.println(
                "Options: [badDictionary] [tinyDictionary] [smallDictionary] [fullDictionary] [weekDictionary]");
        dictionary = keyboard.readString();

        System.out.println("How many tries do you want?");
        tries = keyboard.readInteger();
        System.out.println("What word size do you want?");
        wordSize = keyboard.readInteger();

        this.dictionary = dictionary;
        this.tries = tries;
        this.wordSize = wordSize;

        source = new Source("./etc/" + this.dictionary + ".txt");
        wordle = new Wordle(source, this.wordSize, this.tries);
        word = new Word(wordle, this.wordSize);

        System.out.println("La palabra elegida es " + word.selectedWord);

        System.out.println("Escribe una palabra: ");
        play(word.selectedWord);

    }

    int numeroIntentos = 0;

    public int intentos(int num) {

        return (this.tries - num);

    }

    public void createMatrix() {

        System.out.println("Bienvenido a WORDLE.");

        char[][] matrix = new char[this.tries][this.tries];

        System.out.print("Te quedan " + this.intentos(0) + " intentos restantes.");

        for (int i = 0; i < this.tries; i++) {

            for (int j = 0; j < this.tries; j++) {

                if (i == numeroIntentos) {

                    matrix[i][j] = word.selectedWord.charAt(j);

                    if (j == 0) {

                        System.out.println();
                        System.out.print("[" + matrix[i][j] + "]");

                    } else {

                        System.out.print("[" + matrix[i][j] + "]");

                    }

                } else {

                    if (j == 0) {

                        System.out.println();
                        System.out.print("[ ]");

                    } else {

                        System.out.print("[ ]");

                    }

                }

            }
        }

    }

    public void play(String selectedWord) {

        boolean done = false;
        String str;

        str = keyboard.readString();

        word.selectColor(str);

        while (!done) {

            if (str.equals(selectedWord)) {

                done = true;

            } else {

                System.out.println("");
                str = keyboard.readString();

                word.selectColor(str);

            }

        }
        ;

    }

}
