package dev.drf.java15.test.sealed;

/**
 * https://openjdk.java.net/jeps/360
 */
public sealed abstract class AbstractShape
        implements Shape
        permits SphereShape, TriangleShape {
}
