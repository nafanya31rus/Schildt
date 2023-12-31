package excdemo5;
//В инструкциях catch исключения подкалсса должны
//предшествовать исключениям подкласса
public class ExcDemo5 {
    public static void main(String[] args) {
        //длина массива numer первышает длину массива denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i = 0; i<numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " равно " + numer[i] / denom[i]);
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                //перехват исключения
                System.out.println("Соответствующий элемент не найден");
            }
            catch (Throwable exc) {
                System.out.println("Возникло исключение");
            }
        }
    }
}
