public class Main {
    public static void main(String[] args)
    {
        int[] Array = new int[]{-132231, -2120, -1, 32230, 6, -426460, -51434, -11110, -10010, -3210, 426459};

        //1. Ищем Максимально и Минимальное число
        int Max = Array[0];
        int Min = Array[0];
        for (int i =0; i < Array.length; i++){
            if (Min > Array[i]){
                Min = Array[i];
            }
            if (Max < Array[i]){
                Max = Array[i];
            }
        }
        System.out.println("Максимальное число массива : "+Max);
        System.out.println("Минимальное число массива : "+Min);

        //2. Выведем четные и нечетные числа массива
        System.out.print("Четные числа массива : ");
        for (int i =0; i < Array.length; i++){
            if (Array[i] % 2 == 0){
                System.out.print(Array[i]+" ");
            }
        }
        System.out.println(); // выведем нечетные с новой строки

        System.out.print("Нечетные числа массива : ");
        for (int i =0; i < Array.length; i++){
            if (Array[i] % 2 != 0){
                System.out.print(Array[i]+" ");
            }
        }
        //3. Выведем самое длинное и короткое число массива
        System.out.println();
        int Longer =Array[0] <0 ? Array[0]*-1 : Array[0];
        int Brief =Array[0] <0 ? Array[0]*-1 : Array[0];
        int numLong =0;
        int numBrief =0;
        for (int i =0, temp; i < Array.length; i++) {
            temp = Array[i]<0 ? Array[i]*-1 : Array[i];
            if (Longer < temp){
                Longer = temp;
                numLong =i;
            }
            if (Brief > temp){
                Brief = temp;
                numBrief =i;
            }
        }

        System.out.println("Самое длинное число массива : "+Array[numLong]);
        System.out.println("Самое короткое число массива : "+Array[numBrief]);

        //4. Выведем те числа массива в которых цифры идут в порядке возрастания
        System.out.print("Последовательные числа: ");
        for (int i =0; i < Array.length; i++) {
            int future=Array[i]/10; // Переменная которая будет на шаг впереди=)
            int count=1;
            int newCount=1;
            if (future == 0){ //пропустим натуральные числа
                continue;
            }
            for (int present = Array[i]; future != 0; present /= 10, future /= 10,count++) {

                if (present % 10 == future % 10 +1){ //сравниваем остатки переменных настоящего и будущего добавляя шаг+1 =)
                    newCount++;
                }
            }
            if (count == newCount){ //Если кол-во выполнений цикла for равно количеству выполненных условий if наше число последовательно  \^,^/
                System.out.print(Array[i]+" ");
            }
        }
//5. Выведем числа являющиеся Палиндромами
        System.out.println();
        System.out.print("Числа являющиеся Палиндромами : ");
        for (int i =0, count =0; i< Array.length; i++){
            int buff =0;
            for (int temp =Array[i]; temp != 0; temp /= 10){
                buff=buff*10+temp%10; //собираю число в обратном порядке
            }
            if (Array[i] == buff){
                count++;
                System.out.print(Array[i]+" ");
            }
            else if (i == Array.length-1 && count == 0) {
                System.out.println("Чисел Палиндромов в массиве не найдено =(");
            }
        }
    }
}