package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Integer integer = new Integer(54);
	    Double db = new Double(12.215);
/*
        ArrayList<Integer> intArrayList = new ArrayList<Integer>(20);

        for (int i = 0; i < intArrayList.size(); i++) {
            intArrayList.add(Integer.valueOf(i));       //autoboxing!! <-- int to Integer
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());       //from the class to primitive value!
        }
*/
        Integer myIntvalue = 56;        //Integer.valueOf(56);

        //int myInt = myIntvalue.intValue();      //boxing --> autoboxing
        int myInt = 56;      //boxing --> autoboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl < 11.0; dbl+= 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (double dbl = 0.0; dbl < 11.0; dbl+= 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));        //autobox --> primitive to class object
        }

        for (int i =0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();     //unbox --> from object to primitive type

        }

        //.doubleValue nélkül is működik.
        for (int i =0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);     //unbox --> from object to primitive type
            System.out.println(i + " -> " + value);
        }

    }
}
