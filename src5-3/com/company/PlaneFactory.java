package com.company;

public class PlaneFactory {
    public static Plane getPlane(int c)
    {
        switch (c)
        {
            case 1:
                return new Boeing ();
            case 2:
                return new Airbus ();
            case 3:
                return new BAE ();
            default:
                return null;
        }
    }
}
