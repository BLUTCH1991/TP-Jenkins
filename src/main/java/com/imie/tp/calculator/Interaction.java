/**
 * @author thomas
 */

package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.operation.DivisionOperation;
import com.imie.tp.calculator.operation.MultiplicationOperation;
import com.imie.tp.calculator.operation.SubstractionOperation;
import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 * @author thomas
 *
 */
public class Interaction {

	public void redirectToOperation(final int calcul, final int firstNb, final int secondNb) {
	    switch(calcul) {
	        case 1:
	            final AdditionOperation add = new AdditionOperation(firstNb);
	            add.make(secondNb);
	            System.out.println("Le résultat est : " + add.getCurrentValue());
	            break;
	        case 2:
	            final SubstractionOperation sub = new SubstractionOperation(firstNb);
	            sub.make(secondNb);
	            System.out.println("Le résultat est : " + sub.getCurrentValue());
	            break;
	        case 3:
	            final DivisionOperation div = new DivisionOperation(firstNb);
	            div.make(secondNb);
	            System.out.println("Le résultat est : " + div.getCurrentValue());
	            break;
	        case 4:
	            final MultiplicationOperation mult = new MultiplicationOperation(firstNb);
	            mult.make(secondNb);
                System.out.println("Le résultat est : " + mult.getCurrentValue());
	            break;
	        case 5:
	            System.out.println("History of all operations available soon !");
	            break;
	    }
	}

	/**
	 *
	 * @param order
	 * @return
	 */
	public int getUserNumber(final String order) {
        boolean isNb = false;
        String answer = "";
        int nb = 0;

        do {
            answer = KeyboardUtils.readFromKeyboard(order);
            nb = Integer.parseInt(answer);
            if (nb > Float.MIN_VALUE && nb < Float.MAX_VALUE){
                isNb = true;
            }
        } while (!isNb);

        return nb;
    }

	/**
	 *
	 * @param order
	 * @return
	 */
	public int getUserChoice(final String order) {
	    boolean isNb = false;
        String answer = "";
        int operationChoose = 0;

        do {
            answer = KeyboardUtils.readFromKeyboard(order);
            operationChoose = Integer.parseInt(answer);
            if ((operationChoose > 0 && operationChoose < 6) || operationChoose == 9){
                isNb = true;
            }
        } while (!isNb);

	    return operationChoose;
	}

	/**
	 *
	 */
	public void askOperation() {
	    int firstNb;
	    int secondNb;
	    int choice;

	    choice = getUserChoice("Type of Operation \":\n" +
	            "- 1 : Addition\n" +
	            "- 2 : Subtraction\n" +
	            "- 3 : Diviside\n" +
	            "- 4 : Multiplication\n" +
	            "- 5 : Display History\n" +
	            "- 9 : Quit\n");

	    if (choice == 9) {
	        System.out.println("Bye bye !");
            System.exit(0);
	    }
	    firstNb = getUserNumber("Entrez le premier nombre : ");
	    secondNb = getUserNumber("Entrez le deuxième nombre : ");

	    this.redirectToOperation(choice, firstNb, secondNb);
	}
}






