package com.kodilla.stream.testing.shape;
class Squared implements Shape {
    private final static String name= " Squared";
    private int side;
    public Squared(int side) {
        this.side= side;
    }
    @Override
    public String getShapeName() {
        return name;}
    @Override
    public double getFieldName() {
        return Math.PI*(Math.pow(side,2));
    }public int getSide() {
        return side;
    }@Override
    public boolean equals(Object o) {
        if( this==o) return true;
        if (o == null || getClass() !=o.getClass()) return false;
        Squared squared =  (Squared) o;
        return side== squared.side;}
    @Override
    public int hashCode() {
        return side;
    }

}
