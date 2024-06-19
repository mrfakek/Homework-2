public class Main {
    public static void main(String[] args)
    {
        int[] array = new int[]{-132231, 6789, -1, 32230, 6, -426460, -51434, -11110, -10010, -3210, 426459};
        MySearch search = new MySearch(array);

        //1. Ищем Максимально и Минимальное число
        search.extremum();

        //2. Выведем четные и нечетные числа массива
        search.evenOrNot();

        //3. Выведем самое длинное и короткое число массива
        search.longerOrShorter();

        //4. Выведем те числа массива в которых цифры идут в порядке возрастания
        search.numSequence();

        //5. Выведем числа являющиеся Палиндромами
        search.palendrome();
    }
}