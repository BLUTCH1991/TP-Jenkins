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
	protected float baseValue = 0;

	/**
	 *
	 */
	protected float result = 0;

    /**
	 * @param baseValue
	 */
	public SubstractionOperation(float baseValue) {
		super(baseValue);
		this.baseValue = baseValue;
	}

	/**
	 *
	 */
	@Override
    public void make(float value) {
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
