/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 185 Programming 2
Section: M03
Lab 4
*/

package vehiclefiles;

public class Car extends Vehicle {// creating a new car class while inheriting data from the vehicle class
    private String carcombusttionType;// setting the string variable for engine type
    private int caramountofDoors;// setting the doors as intgers

    public Car() {// creating the car class
        super();// super method to inheriit other class information
        this.carcombusttionType = "Diesel";// setting parameters for the combustion type
        this.caramountofDoors = 2;// setting the intger amount of doors
    }

    public Car(String vehiclebrand, int vehicleyear, String vehiclemodel, String carcombusttionType, int caramountofDoors) {// constructors to set the variables
        super(vehiclemodel, vehiclebrand, vehicleyear);// inheriting previous variables from other classes
        this.carcombusttionType = carcombusttionType;// assigning the parameter to the instance variable
        this.caramountofDoors = caramountofDoors;// assigning the parameter to the instance variable
    }

    public int getCaramountofDoors() {// getter method for the amount of doors
        return caramountofDoors;// returning the variable
    }
    public String getCarcombusttionType() {// getter method for the combustion type
        return carcombusttionType;// returnig the variable
    }
    public void setCarcombusttionType(String carcombusttionType) {// setter method for the combustion type
        this.carcombusttionType = carcombusttionType;// assigning the parameter to the instance variable
    }
    public void setCaramountofDoors(int caramountofDoors) {// setter method for the amount of car doors
        this.caramountofDoors = caramountofDoors;// assigning the parameter to the instance variable
    }
    @Override
    public String toString() {// using a toString method to print and display all of the parameters displayed
        return super.toString() + "The Bayerische Motoren Werke uses " + carcombusttionType + "\n" +
                ", also, the amount of car doors are: " + caramountofDoors + "\n";
    }
}
