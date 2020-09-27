package dev.drf.java15.test.instanceofjep;

/**
 * https://openjdk.java.net/jeps/375
 */
public final class InstanceOfJep {
    private InstanceOfJep() {
    }

    public static <T> void print(T value) {
        if (value instanceof String str && str.startsWith("pom")) {
            System.out.println(str.substring(3));
        } else {
            System.out.println("not string");
        }
    }
}
