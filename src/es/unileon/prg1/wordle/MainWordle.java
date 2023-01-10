package es.unileon.prg1.wordle;

import org.apache.logging.log4j.*;

public class MainWordle {

	public static void main(String[] args) {

		WordleTextUI ui = new WordleTextUI();
		Letter letter = new Letter('a');

		int wordLength = ui.wordSize;
		int numTries = ui.tries;

		ui.init();

		/*
		 * Wordle wordle;
		 * WordleTextUI ui;
		 * 
		 * wordle = new Wordle(source, longWord, numTries);
		 * ui = new WordleTextUI(wordle);
		 * ui.init();
		 */

		/*
		 * Source fuente = new Source("./etc/smallDictionary.txt");
		 * System.out.print(fuente);
		 */

	}

}