package academy.everyonecodes.java.race;



	public abstract class PowerUp {
	private int intensity;

	public PowerUp(int intensity) {
	    this.intensity = intensity;
	}

	public int getIntensity() {
	    return intensity;
	}

	public abstract void apply(RaceCar car);

	}

