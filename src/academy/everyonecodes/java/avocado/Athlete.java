package academy.everyonecodes.java.avocado;

class Athlete {
private String firstName;
private String lastName;
private double height;
private boolean suspended;

public Athlete(String firstName, String lastName, double height, boolean suspended) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.height = height;
    this.suspended = suspended;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public double getHeight() {
    return height;
}

public boolean isSuspended() {
    return suspended;
}

}