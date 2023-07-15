package Rethrow;

public class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            //повторный перехват исключения
            System.out.println("ФАТАЛИТИ ошибка - " + "выполнение программы прервано!");
        }
    }
}
