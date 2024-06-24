public class NumFindImpl implements FindInNum {
    int number;
    public void extremum(int _number){
        int temp = _number;
        int max = temp %10;
        int min = temp %10;
        temp /=10;
        for (int lastDigit =temp %10; temp!=0; temp /=10, lastDigit =temp %10){

            if (min > lastDigit){
                min =lastDigit;
            }
            if (max < lastDigit){
                max = lastDigit;
            }
        }
        System.out.println("Максимальная цифра числа :"+_number);
        System.out.println("max: "+max);
        System.out.println("Минимальная цифра числа :"+_number);
        System.out.println("min: "+min);
    }
   public void inverted(int _number){
        number = _number;
        if (number < 0){
            System.out.print("Исходное число : "+_number+" наоборот : -");
            number = -number;
        }
        else {
            System.out.print("Исходное число : " + _number + " наоборот : ");
        }
        for (int temp=number; temp!=0;temp /=10){
           System.out.print(temp %10);
        }
        System.out.println();
    }
    public void noRepeatingNum(int _number){
        int temp = _number;
        int tempTwo;
        for (int lastDigit =temp %10; temp!=0; temp /=10, lastDigit =temp %10) {
            tempTwo = temp / 10;
            for (int penultimateDigit = tempTwo % 10; tempTwo != 0; tempTwo /= 10, penultimateDigit = tempTwo % 10) {
                if (lastDigit == penultimateDigit) {
                    return;
                }
            }
        }
        System.out.println("true");
    }
    public void sequenceDESC(int _number){
        int temp = _number;
        int tempTwo = _number /10;
        int i =0, count =0;
        boolean countZero = false;
        int sequence =0;
        System.out.println("Последовательноти цифр в числе :"+_number);
        for (int lastDigit, penultimateDigit; tempTwo!=0; temp /=10, tempTwo = temp /10) {
            lastDigit =temp %10;
            penultimateDigit =tempTwo %10;
                if (lastDigit == penultimateDigit +1) {
                    count++;
                    countZero = count == 1 ? (lastDigit == 0 ? true : false):countZero;
                    sequence = count == 1 ? lastDigit : sequence;
                    sequence = sequence *10 + penultimateDigit;
                } else if (count >0) {
                    count =0;
                    if(countZero && _number <0){
                        sequence = -sequence;
                        System.out.print("-0"+sequence+" ");
                    }else {
                        System.out.print(" " + sequence + " ");
                    }
                    i++;
                    countZero = false;
                }
                if(count >0 && tempTwo/10 == 0){
                    if(countZero && _number <0){
                        sequence = -sequence;
                        System.out.print("-0"+sequence+" ");
                    }else {
                        System.out.print(" " + sequence + " ");
                    }
                    i++;
                }
        }
        if (i == 0){
            System.out.print("Последовательностей в числе : "+_number+" не найдено");
        }
        System.out.println();
    }
}
