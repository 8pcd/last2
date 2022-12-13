package acadamy.everyonecodes.java.part2;


public class Data {
	private String wifiMSG;
	private int freq;
	
	
	public Data(String content, int frequency) {
	    this.wifiMSG = content;
	    this.freq = frequency;
	}

	public String getContent() {
	    return wifiMSG;
	}

	public int getFrequency() {
	    return freq;
	}

}
