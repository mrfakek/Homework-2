public class Main {
    public static void main(String[] args)
    {
        int[] array = new int[]{-132231, 6789, -1, 32230, 6, -426460, -51434, -11110, -10010, -3210, 426459};
        int number= 1012310456;
      /*  FindInArr myFinder = new ArrFindImpl();

        //1. Ищем Максимальное и Минимальное число массива
        myFinder.extremum(array);

        //2. Выведем четные и нечетные числа массива
        myFinder.evenOrNot(array);

        //3. Выведем самое длинное и короткое число массива
        myFinder.longerOrShorter(array);

        //4. Выведем те числа массива в которых цифры идут в порядке возрастания
        myFinder.numSequence(array);

        //5. Выведем числа массива являющиеся Палиндромами
        myFinder.palendrome(array);
*/
        FindInNum anotherFinder = new NumFindImpl();
        //1.Выведем число в обратном порядке

        //2.Ищем Максимальную и Минимальную цифру в числе
        anotherFinder.extremum(number);


    }
}