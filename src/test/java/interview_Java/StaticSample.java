package interview_Java;

public class StaticSample {
    String instanceVariable = "Instance Variable";

    public static void staticMethod() {
        // System.out.println(instanceVariable); // Compilation Error: Non-static variable cannot be referenced from a static context
    }

    public static void main(String[] args) {
        staticMethod();
    }
}




