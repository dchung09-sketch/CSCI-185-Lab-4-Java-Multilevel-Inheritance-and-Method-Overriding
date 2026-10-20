/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 185 Programming 2
Section: M03
Lab 4
*/

package vehiclefiles;// all the class files are within this package

public class Vehicle {// introduction of the public class
    private String vehiclemodel;// string variable for the vehicle model
    private int vehicleyear;// string integer for the year
    private String vehiclebrand;// string variable for the brand

    public Vehicle() {// introduction of the vehicle class of parameters
        this.vehiclemodel = "480I Coupe";// setting the vehicle model
        this.vehicleyear = 2014;// setting the vehicle year
        this.vehiclebrand = "Bayerische Motoren Werke (BMW)";// setting the vehicle brand
    }

    public Vehicle(String vehiclemodel, String vehiclebrand, int vehicleyear) {// constructive statements throughout the code
        this.vehiclemodel = vehiclemodel;// assigning the parameter to the instance variable
        this.vehiclebrand = vehiclebrand;// assigning the parameter to the instance variable
        this.vehicleyear = vehicleyear;// assigning the parameter to the instance variable
    }

    public String getVehiclemodel() {// getter method for the model
        return vehiclemodel;// returning the variable
    }
    public String getVehiclebrand() {// getter method for the vehicle brand
        return vehiclebrand;// returning the brand
    }
    public int getVehicleyear() {// getter method for the year number
        return vehicleyear;// returning the variable for the year
    }
    public void setVehiclemodel(String vehiclemodel) {// setting the model
        this.vehiclemodel = vehiclemodel; //assigning the parameter to the instance variable
    }
    public void setVehicleyear(int vehicleyear) {// setting the year number
        this.vehicleyear = vehicleyear;// assigning the parameter to the instance variable
    }
    public void setVehiclebrand(String vehiclebrand) {// setting the brand
        this.vehiclebrand = vehiclebrand;// assigning the parameter to the instance variable
    }
    @Override
    public String toString() {// utilizing the toString method to print out all of the parameter results
        return "The official vehicle model is " + vehiclemodel + "\n" +
                ", and the vehicle brand is " + vehiclebrand + "\n" +
                ", the vehicle year is " + vehicleyear + "\n";
    }
}
