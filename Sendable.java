@FunctionalInterface

public interface Sendable {
    String send();

    public static void main(String[] args) {
        Sendable s = () -> {
            return "Hello World!";
        };

        System.out.println(s.send());
    }

}