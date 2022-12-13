package acadamy.everyonecodes.java.part2;

public class WifiCard2_4GHz implements WifiCard{
	
	private final int frequency = 2400;

	@Override
	public int getFrequency() {
	    return frequency;
	}

}
