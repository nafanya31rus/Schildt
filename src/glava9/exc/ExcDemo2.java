package glava9.exc;

public class ExcDemo2 {
    public static void main(String[] args) {

        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Выход за пределы массива!");
        }
        System.out.println("После инструкции catch");
    }
}
