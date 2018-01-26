/**
 * @author thomas
 */

package com.imie.tp.calculator.operation;

/**
 *
 * @author thomas
 *
 */
public interface OperationCommand {

	/**
	 *
	 * @param value
	 */
    void make(float value);

    /**
     *
     * @return
     */
    float getCurrentValue();
}
