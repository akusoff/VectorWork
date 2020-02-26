package com.company;

public class VectorTools {
    public static Vector sum(Vector a, Vector b) {
        return new Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }
}
