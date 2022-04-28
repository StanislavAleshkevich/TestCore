package random1;

import static util.Util.generateRandomArray;

public class TestRandom {
    /*
    Задача:
        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
     */

    public void findRandomNumber(){
        int amountNumber = 100;
        double[] numberArray = new double[amountNumber];
        numberArray = generateRandomArray(numberArray);

        double maxNumber = numberArray[0];
        double minNumber = numberArray[0];
        double middleNumber = 0;

        //ur code ->
        //....
    }
}
