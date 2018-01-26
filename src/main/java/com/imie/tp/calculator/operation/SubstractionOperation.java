/**
 *
 */
package com.imie.tp.calculator.operation;

/**
 * @author thomas
 *
 */
public class SubstractionOperation extends OperationCommandBase {

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
	public SubstractionOperation(final float baseValue) {
		super(baseValue);
		this.baseValue = baseValue;
	}

	/**
	 *
	 */
	@Override
    public void make(final float value) {
		this.result = this.baseValue - value;
		this.getCurrentValue();
    }

	/**
	 *
	 */
    public float getCurrentValue() {
        return this.result;
    }
}

