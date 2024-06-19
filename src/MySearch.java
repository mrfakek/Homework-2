public class MySearch {
    int[] Array;
    MySearch (int[] _Array){
        Array = _Array;
    }
    void Extremum(){
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
    }
    void Even_ornot(){
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
        System.out.println();
    }
    void Num_Sequence(){
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
        System.out.println();
    }

    void Longer_orShorter(){
        int Longer =Array[0] <0 ? Array[0]*-1 : Array[0];
        int Short =Array[0] <0 ? Array[0]*-1 : Array[0];
        int numLong =0;
        int numShort =0;
        for (int i =0, temp; i < Array.length; i++) {
            temp = Array[i]<0 ? Array[i]*-1 : Array[i];
            if (Longer < temp){
                Longer = temp;
                numLong =i;
            }
            if (Short > temp){
                Short = temp;
                numShort =i;
            }
        }
        System.out.println("Самое длинное число массива : "+Array[numLong]);
        System.out.println("Самое короткое число массива : "+Array[numShort]);
    }

    void Palendrome(){
        System.out.print("Числа массива являющиеся Палиндромами : ");
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
