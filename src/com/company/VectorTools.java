package com.company;

public class VectorTools {
    public static Vector sum(Vector a, Vector b) {
        return new Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }
    public static Vector dif(Vector a, Vector b) {
        return new Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }
    public static float mul(Vector a, Vector b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }
    public static double len(Vector a) {
        return Math.sqrt(a.x * a.x + a.y * a.y + a.z * a.z);
    }
    public static double cos(Vector a, Vector b) {
        return VectorTools.mul(a, b)/(VectorTools.len(a)*VectorTools.len(b));
    }
}
