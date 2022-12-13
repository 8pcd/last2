package acadamy.everyonecodes.java.assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Optional;

public class NumberNameShifter {

	private NumberNamesDictionary dictionary;

	public NumberNameShifter(NumberNamesDictionary dictionary) {
	    this.dictionary = dictionary;
	}

	public List<String> shift(List<String> numberNames) {
	    return numberNames.stream()
	                     .filter(n -> !dictionary.contains(n))
	                     .map(n -> dictionary.getName(n))
	                     .map(n -> dictionary.get(n) + 1)
	                     
	                     .collect(Collectors.toList());
	    
	}
}
