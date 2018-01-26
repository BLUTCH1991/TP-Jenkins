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

    void make(float value);

    float getCurrentValue();
}
