/**
 * @author thomas
 */

package com.imie.tp.calculator.operation;

/**
 *
 * @author thomas
 */
public class AdditionOperation extends OperationCommandBase {

	/**
	 *
	 */
	protected float baseValue;

	/**
	 *
	 */
	protected float result;

    /**
	 * @param baseValue
	 */
	public AdditionOperation(final float baseValue) {
		super(baseValue);
		this.baseValue = baseValue;
	}

	/**
	 *
	 */
	@Override
    public void make(final float value) {
		this.result = this.baseValue + value;
    }

	/**
	 *
	 */
    public float getCurrentValue() {
        return this.result;
    }

}
