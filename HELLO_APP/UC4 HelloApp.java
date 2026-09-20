public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            StringBuilder names = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                if (i > 0) {
                    names.append(", ");
                }
                names.append(args[i]);
            }

            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
