public class Main {

    private static class ConsolePrinter implements Runnable {

        private final String text = "my text";
        private ConsolePrinter(String text) {
            this.text = text;
        }

        @Override
        public void run() {
            System.out.print(text);
        }

    }

    public static void main(String... args) {
        new Thread(new ConsolePrinter(args[0])).start();
    }

}