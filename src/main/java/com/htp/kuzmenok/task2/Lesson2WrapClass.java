package com.htp.kuzmenok.task2;

public class Lesson2WrapClass {
    public static void main(String[] args) {
        // byte data type
        byte a = 1;

        // wrapping around byte
        Byte byteobj = new Byte(a);

        // Integer
        int b = 4;
        Integer intobj = new Integer(b);

        // Float
        float c = 4.5f;
        Float floatobj = new Float(c);

        // double data type
        double d = 250.5;

        // wrapping aroun double
        Double doubleobj = new Double(d);

        // Charecter
        char e = 'x';
        Character charobj = new Character(e);

        System.out.println("Byte object byteobj " + byteobj);

        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value, bv: " + bv);
        System.out.println("int value, iv: " + iv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);

    }
}
