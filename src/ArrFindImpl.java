public class ArrFindImpl implements FindInArr {
    int[] array;

    public void extremum(int[] _array){
        array = _array;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Максимальное число массива : "+ max);
        System.out.println("Минимальное число массива : "+ min);
    }

   public void evenOrNot(int[] _array){
        array = _array;
        System.out.print("Четные числа массива : ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println(); // выведем нечетные с новой строки

        System.out.print("Нечетные числа массива : ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }
   public void numSequence(int[] _array){
        array = _array;
        System.out.print("Последовательные числа: ");
        for (int i = 0; i < array.length; i++) {
            int future= array[i]/10; // Переменная которая будет на шаг впереди=)
            int count=1;
            int newCount=1;
            if (future == 0){ //пропустим натуральные числа
                continue;
            }
            for (int present = array[i]; future != 0; present /= 10, future /= 10,count++) {

                if (present % 10 == future % 10 +1){ //сравниваем остатки переменных настоящего и будущего добавляя шаг+1 =)
                    newCount++;
                }
            }
            if (count == newCount){ //Если кол-во выполнений цикла for равно количеству выполненных условий if наше число последовательно  \^,^/
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }

    public void longerOrShorter(int[] _array){
        array = _array;
        int longer = array[0] <0 ? array[0]*-1 : array[0];
        int shorter = array[0] <0 ? array[0]*-1 : array[0];
        int numLong =0;
        int numShort =0;
        for (int i = 0, temp; i < array.length; i++) {
            temp = array[i]<0 ? array[i]*-1 : array[i];
            if (longer < temp){
                longer = temp;
                numLong =i;
            }
            if (shorter > temp){
                shorter = temp;
                numShort =i;
            }
        }
        System.out.println("Самое длинное число массива : "+ array[numLong]);
        System.out.println("Самое короткое число массива : "+ array[numShort]);
    }

    public void palendrome(int[] _array){
        array = _array;
        System.out.print("Числа массива являющиеся Палиндромами : ");
        for (int i = 0, count = 0; i< array.length; i++){
            int buff =0;
            for (int temp = array[i]; temp != 0; temp /= 10){
                buff=buff*10+temp%10; //собираю число в обратном порядке
            }
            if (array[i] == buff){
                count++;
                System.out.print(array[i]+" ");
            }
            else if (i == array.length-1 && count == 0) {
                System.out.println("Чисел Палиндромов в массиве не найдено =(");
            }
        }

    }
}
