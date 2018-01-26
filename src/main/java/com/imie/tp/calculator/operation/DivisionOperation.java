/**
 * @author thomas
 */

package com.imie.tp.calculator.operation;

/**
 * @author thomas
 *
 */
public class DivisionOperation extends OperationCommandBase {

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
	public DivisionOperation(final float baseValue) {
		super(baseValue);
		this.baseValue = baseValue;
	}

	/**
	 *
	 */
	@Override
   public void make(final float value) {
		if (value == 0) {
			this.result = 1;
		} else {
			this.result = this.baseValue / value;
		}
   }

	/**
	 *
	 */
   public float getCurrentValue() {
       return this.result;
   }

}
