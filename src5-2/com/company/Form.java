package com.company;

public class Form {
    private static Form form=new Form ();
    public static Form getInstance(){return form;}
    private Form(){}
    public void frm(int fard){
        System.out.println (" tedade forme estekhdami "+fard);
    }
    public void shoghl(int fard){
        System.out.println ("tedade shoghl "+fard);
    }
}
