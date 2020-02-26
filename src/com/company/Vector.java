package com.company;

public class Vector {
    public float x, y, z;
    public void show(String name){
        System.out.println(name + " = {" + this.x + ", " + this.y + ", " + this.z + "}");
    }
    public Vector (float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
