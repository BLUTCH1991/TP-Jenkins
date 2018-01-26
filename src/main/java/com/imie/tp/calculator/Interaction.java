/**
 * @author thomas
 */

package com.imie.tp.calculator;

import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 * @author thomas
 *
 */
public class Interaction {

	/**
	 *
	 */
	public Interaction() {
		// Auto-generated constructor stub
	}

	/**
	 *
	 */
	public void askOperation() {
		boolean isNb = false;
		String answer = "";
		int operationChoose = 0;

	    do {
	    	answer = KeyboardUtils.readFromKeyboard("Type of operation : ");
	    	operationChoose = Integer.parseInt(answer);
	    	if (operationChoose > 0 && operationChoose < 10){
                isNb = true;
	    	}
	    } while (!isNb);

	    System.out.println("Le nombre choisi est : " + operationChoose);
	}
}
