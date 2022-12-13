package academy.everyonecodes.java.race;

public class SpeedPowerUp extends PowerUp {
	public SpeedPowerUp(int intensity) {
	super(intensity);
	}


		@Override
		  public void apply(RaceCar car) {
			car.setSpeed(car.getSpeed()+getIntensity());
		   // car.setDamage(car.getDamage() + this.getIntensity());
		  }

	
		}





