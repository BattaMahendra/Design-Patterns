package Design.Patterns.behavioral.strategy;

/*
 * this acts as main mechanism to achieve decoupling and there 
 * by enables us to use the strategy pattern efficiently
 * 
 * It is better to maintain interface simple which focuses on 
 * Single Responsibility principle in SOLID
 */

// this is the abstract strategy
public interface ICheckInType {
	
	public void checkIn(String credentials);

}
