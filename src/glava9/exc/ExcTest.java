package glava9.exc;
//Генерация исключения
public class ExcTest {
    public static void genException() {
        int nums[] = new int [4];

        System.out.println("До генерации исключения");

        //выход за пределы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}
