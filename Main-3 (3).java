/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 185 Programming 2
Section: M03
Lab 4
*/


import vehiclefiles.Car;// this is an inheritance, inheriting the files from the car class
import vehiclefiles.ElectricCar;// inheriting all of the electric car files
import vehiclefiles.Motorcycle;// inheriting all of the motorcycle car files
import vehiclefiles.Vehicle;// inheriting all of the vehicle car files

public class Main {// introduction of the main class
    public static void main(String[] args) {// statement for setting and creating arguments
        Vehicle vehicle = new Vehicle();// setting vehicle as a new variable
        Car car = new Car("BMW", 2022, "M5", "Petrol", 4);// setting all of the parameters for the car variable
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "FatBoy", 2016, "Blue", false);// setting the parameters for the motorcycle through inheritance
        ElectricCar electricCar = new ElectricCar("i8", "BMW", 2018, 250, 390, 2, "Electric");// setting parameters for the electric vehicles

        System.out.println(vehicle);// printing all of the parameters for the vehicle
        System.out.println(car);// printing all of the parameters for the car
        System.out.println(motorcycle);// printing all of the parameters for the motorcycle
        System.out.println(electricCar);// printing all of the parameters for the electric car
    }
}
