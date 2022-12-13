package academy.everyonecodes.java.race;

public class DamagePowerUp extends PowerUp{
	
	public DamagePowerUp(int intensity) {
	    super(intensity);
	  }

	  @Override
	  public void apply(RaceCar car) {
	   
	    car.setDamage(car.getDamage() + getIntensity());
	  }


	}


