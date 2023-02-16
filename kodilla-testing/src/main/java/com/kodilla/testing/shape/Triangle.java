//package com.kodilla.testing.shape;
//
//
//
//
//class Triangle implements Shape {
//    private final static String name= " Triangle";
//    private final int sideA;
//
//    public Triangle(int sideA) {
//        this.sideA= sideA;
//
//    }
//    @Override
//    public String getShapeName() {
//        return name;
//
//    }
//    @Override
//    public double getFieldName() {
//
//        return Math.PI*(Math.pow(sideA,3));
//    }
//
//    public int getSideA() {
//        return sideA;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if( this==o) return true;
//        if (o == null || getClass() !=o.getClass()) return false;
//        Triangle triangle =  (Triangle) o;
//        return sideA== triangle.sideA;
//
//    }
//    @Override
//    public int hashCode() {
//        return sideA;
//    }
//
//}