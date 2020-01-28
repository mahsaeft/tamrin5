package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        String str=scanner.nextLine ();
        int afrad=Integer.parseInt (str);
        Form.getInstance ().frm (afrad);
        Form.getInstance ().shoghl (afrad);
    }
}
