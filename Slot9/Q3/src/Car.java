/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Car {
    protected String maker;
    protected int rate;

    public Car() {
    }

    public Car(String maker, int rate) {
        this.maker = maker;
        this.rate = rate;
    }

    public String getMaker() {
        return maker;
    }

    public int getRate() {
        return rate;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
}
