/**
 * @author thomas
 */

package com.imie.tp.calculator.utils;

import java.util.Locale;
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
        keyboard.useLocale(Locale.ENGLISH);

        System.out.println(displayAsk);

        return keyboard.nextLine();

    }
}
