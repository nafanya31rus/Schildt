package ExcTest;
//использование методов класса Throwable
public class ExcTest {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("До генерации исключения");

        //генерирование исключения в связи с
        //выходом индекса за пределы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}
