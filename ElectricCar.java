/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 185 Programming 2
Section: M03
Lab 4
*/

package vehiclefiles;// all of the classes for this lab are within this package

public class ElectricCar extends Car {// creating a new public class electric car that would be able to inherit information from the car class
    private int electricrangespercharge;// setting a private integer for the range per speed
    private int electricitybattrerycap;// setting the private integer for the electic battery cap

    public ElectricCar(String vehiclemodel, String vehiclebrand, int vehicleyear, int electricitybattrerycap, int electricrangespercharge, int caramountofdoors, String carcombusttionType) {// inheriting newvariables and setting new constructors
        super(vehiclebrand, vehicleyear, vehiclemodel, carcombusttionType, caramountofdoors);// utilizing the super method to inherit other variables from other classes
        this.electricitybattrerycap = electricitybattrerycap;// assigning the parameter to the instance variable
        this.electricrangespercharge = electricrangespercharge;// assigning the parameter to the instance variable
    }
    public int getElectricrangespercharge() {// using a getter method for the integer range per charge
        return electricrangespercharge;// returning the integer variable
    }
    public int getElectricitybattrerycap() {// using a getter method for the electricity battery cap
        return electricitybattrerycap;// returning the variable
    }
    public void setElectricrangespercharge(int electricrangespercharge) {// using a setter method as a integer for the range per charge
        this.electricrangespercharge = electricrangespercharge;// assigning the parameter to the instance variable
    }
    public void setElectricitybattrerycap(int electricitybattrerycap) {// using a setter method as a integer for the battery cap
        this.electricitybattrerycap = electricitybattrerycap;// assigning the parameter to the instance variable
    }
    @Override
    public String toString() {// we are utilizing a toString method to print out all of the parameters on a display in a much shorter way
        return super.toString() + ", The official range per charge is " + electricrangespercharge + "\n" +
                ", the capacity is " + electricitybattrerycap + "\n";
    }
}
