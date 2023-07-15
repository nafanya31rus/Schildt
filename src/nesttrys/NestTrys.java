package nesttrys;
//использование вложенных блоков try
public class NestTrys {
    public static void main(String[] args) {
        //длина массива numer превышает длину массива denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        try {   //Внешнй блок try
            for(int i = 0; i < numer.length; i++) {
                try {   //внутренний блок try
                    System.out.println(numer[i] + " / " + denom[i] + " равно " + numer[i] / denom[i]);
                }

                catch (ArithmeticException exc) {
                    //перехват исключения
                    System.out.println("Попытка деления на нуль");
                }
            }
        }

        catch(ArrayIndexOutOfBoundsException exc) {
            //Перехват исключения
            System.out.println("Соответсвующий элемент не найден");
            System.out.println("Фатальная ошибка - выполнение программы прервано!");
        }
    }
}
