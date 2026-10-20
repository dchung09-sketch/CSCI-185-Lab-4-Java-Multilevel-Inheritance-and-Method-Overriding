/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 185 Programming 2
Section: M03
Lab 4
*/

package vehiclefiles;// all classes are within vehicle files

public class Motorcycle extends Vehicle {// creating a motorcycle class while ineriting information from the vehicle class
    private String motorcycleofficialColor;// setting the string variable for the color
    private boolean doesthebikehaveasidecar;// setting the boolean method for the side car

    public Motorcycle(String vehiclebrand, String vehiclemodel, int vehicleyear, String motorcycleofficialColor, boolean doesthebikehaveasidecar) {// inheriting previous variables and constructing new ones
        super(vehiclemodel, vehiclebrand, vehicleyear);// inheriting previously used vairbales from other classes
        this.motorcycleofficialColor = motorcycleofficialColor;// assigning the parameter to the instance variable
        this.doesthebikehaveasidecar = doesthebikehaveasidecar;// assigning the parameter to the instance variable
    }
    public String getMotorcycleofficialColor() { // getter method for the motorclycle official color
        return motorcycleofficialColor;// returning the variable
    }
    public boolean getDoesthebikehaveasidecar() {// getter method for the side car boolean variable
        return doesthebikehaveasidecar;// returning the variable
    }
    public void setMotorcycleofficialColor(String motorcycleofficialColor) {// setter method for the official color
        this.motorcycleofficialColor = motorcycleofficialColor;// assigning the parameter to the instance variable
    }
    public void setDoesthebikehaveasidecar(boolean doesthebikehaveasidecar) {// setting the method questioning if there is a side car
        this.doesthebikehaveasidecar = doesthebikehaveasidecar;// assigning the parameter to the instance variable
    }
    @Override
    public String toString() {// we are utilizing a toString method to print out all of the parameters on display in a faster way
        return super.toString() + ", The color of the bike is " + motorcycleofficialColor + "\n" +
                " , and the bike's sidecar is " + doesthebikehaveasidecar + "\n";
    }
}
