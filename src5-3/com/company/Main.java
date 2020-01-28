package com.company;

public class Main {

    public static void main(String[] args) {
	Plane plane=PlaneFactory.getPlane(Plane.BOEING);
	plane.fly();
    }
}
