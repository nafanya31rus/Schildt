package throwdemo;
//генерирование исключения вручную
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("До инструкции throw");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            //перехват исключения
            System.out.println("Исключение перехвачено");

        }

        System.out.println("После блока try / catch");
    }
}
