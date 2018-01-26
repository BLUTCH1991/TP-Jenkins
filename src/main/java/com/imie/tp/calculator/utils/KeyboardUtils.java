/**
 * @author thomas
 */

package com.imie.tp.calculator.utils;

import java.util.Scanner;

/**
 *
 * @author thomas
 *
 */
public final class KeyboardUtils {

    /**
     *
     * @param displayAsk
     * @return
     */
    public static String readFromKeyboard(final String displayAsk) {
        final Scanner keyboard = new Scanner(System.in);

        System.out.println(displayAsk);

        keyboard.close();

        return keyboard.nextLine();

    }
}
