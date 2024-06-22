public class NumFindImpl implements FindInNum {
    int number;
    public void extremum(int _number){
        _number=1;
        int temp = _number;
        int max = temp %10;
        int min = temp %10;
        for (int lastDigit =temp %10; temp!=0; temp=temp/10, lastDigit =temp %10){

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
    void inverted(int _number){
        number = _number;
        for (int i = 0; number!=0; i++) {}
    }
}
