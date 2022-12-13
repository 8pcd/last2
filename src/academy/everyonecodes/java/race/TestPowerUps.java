package academy.everyonecodes.java.race;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPowerUps {

	@Test
	public void testPowerUps() {
	    RaceCar car = new RaceCar(100, 10);

	    // Test speed power-up
	    SpeedPowerUp speedPowerUp = new SpeedPowerUp(10);
	    speedPowerUp.apply(car);
	    assertEquals(110, car.getSpeed());

	    // Test damage power-up
	    DamagePowerUp damagePowerUp = new DamagePowerUp(4);
	    damagePowerUp.apply(car);
	    assertEquals(14, car.getDamage());
	}

}
