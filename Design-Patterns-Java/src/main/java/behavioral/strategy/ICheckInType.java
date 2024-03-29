package behavioral.strategy;

/*
 * this acts as main mechanism to achieve decoupling and there 
 * by enables us to use the strategy pattern efficiently
 * 
 * It is better to maintain interface simple which focuses on 
 * Single Responsibility principle in SOLID
 */
public interface ICheckInType {
	
	public void checkIn(String credentials);

}
