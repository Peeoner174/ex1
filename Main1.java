//Конструктор с одним параметром типа String класса ConsolePrinter 
//позволяет создать новый объект этого класса и указать для него 
//новое значение переменной text.
//Ключесое слово final в 10 cтроке запрещает изменения значения 
//String text для всех объектов данного класса.
public class Main1 {

    private static class ConsolePrinter implements Runnable {

        private String text = "my text";      //Ошибка была здесь, а именно - ключевое слово final 
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
