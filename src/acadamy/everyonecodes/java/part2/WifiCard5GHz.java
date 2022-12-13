package acadamy.everyonecodes.java.part2;

public class WifiCard5GHz implements WifiCard{
	private final int frequency = 5000;
	
	@Override
	public int getFrequency() {
	    return frequency;
	}

}
