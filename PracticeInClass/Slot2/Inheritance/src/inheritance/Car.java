/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author admin
 */
public class Car {
    public String wheelStatus;
    public int noOfWheels;

    public Car(String wheelStatus, int noOfWheels) {
        this.wheelStatus = wheelStatus;
        this.noOfWheels = noOfWheels;
    }
    
    public void appleBrake() {
        wheelStatus = "Stop";
        System.out.println("Stop the car using break");
    }
   
    public String toString() {
        return "No of wheels in car " + noOfWheels + "\n" + "Status of the wheels " + wheelStatus;
    
}
