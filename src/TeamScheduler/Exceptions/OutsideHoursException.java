/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeamScheduler.Exceptions;

/**
 *
 * @author james.clair
 */
public class OutsideHoursException extends Exception{
	public OutsideHoursException(String message) {
		super(message);
	}
}
