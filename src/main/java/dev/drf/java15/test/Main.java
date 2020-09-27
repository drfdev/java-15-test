package dev.drf.java15.test;

import dev.drf.java15.test.instanceofjep.InstanceOfJep;
import dev.drf.java15.test.sealed.SphereShape;
import dev.drf.java15.test.sealed.TriangleShape;
import dev.drf.java15.test.textblocks.TextBlocks;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.runtime.version"));

        // Text Blocks:
        System.out.println(TextBlocks.TEXT_BLOCK);

        // Sealed classes:
        SphereShape sphereShape = new SphereShape();
        TriangleShape triangleShape = new TriangleShape();

        // Instance Of:
        InstanceOfJep.print("pom123");
        InstanceOfJep.print(25);
    }
}
