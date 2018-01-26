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
	protected float baseValue = 0;

	/**
	 *
	 */
	protected float result = 0;

   /**
	 * @param baseValue
	 */
	public DivisionOperation(float baseValue) {
		super(baseValue);
		this.baseValue = baseValue;
	}

	/**
	 *
	 */
	@Override
   public void make(float value) {
		if(value == 0) {
			this.result = 1;
		}else {
			this.result = this.baseValue / value;
		}
		this.getCurrentValue();
   }

	/**
	 *
	 */
   public float getCurrentValue() {
       return this.result;
   }

}
