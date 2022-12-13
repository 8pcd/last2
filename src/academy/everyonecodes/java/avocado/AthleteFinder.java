package academy.everyonecodes.java.avocado;
import java.util.List;
import java.util.stream.Collectors;

public class AthleteFinder {
	
public List<Athlete> find(List<Athlete> athletes) {
	
    return athletes.stream()
                   .filter(athlete -> !athlete.isSuspended())
                   .filter(athlete -> athlete.getHeight() >= 1.75 && athlete.getHeight() <= 2.0)
                   .sorted((a1, a2) -> a1.getLastName().compareTo(a2.getLastName()))
                   .limit(5)
                  
                   .collect(Collectors.toList());
}
}