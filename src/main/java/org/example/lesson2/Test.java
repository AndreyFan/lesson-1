package org.example.lesson2;

public class Test {
    public static void main(String[] args) {
        byte byteValue = 50;
        short shortValue = 16500;
        int intValue = 60000000;
        long longValue = 15000000000000L;
        float floatValue = 4567.654f;
        double doubleValue = 123456.1239876;
        boolean boolValue1 = true;

        char charValue = 'b';
        String stringValue= "Hello word";
        //-----ссылочные типы  данных -------------------
        Byte byteObj = 1;
        Short shortObj = 600;
        Integer integerObj = 100000;
        Long longObj = 1_000_000_000L;

        Float floatObj = 15.1234f;
        Double doubleObj = 432.542;

        Character charObj = 'Y';
        Boolean booleanObj = true;

//        System.out.println(byteValue);
//        System.out.println(shortValue);
//        System.out.println(intValue);
//        System.out.println(longValue);
//        System.out.println(charValue);
//        System.out.println(floatValue);
//        System.out.println(doubleValue);
//        System.out.println(boolValue1);
//        System.out.println(string);
//        Дано: два целочисленных числа: 168 и 1500.
//        Примените все математические операторы, результат операций вывести в консоль.
//        Проанализировать результат.
        int firstNumber = 16;
          int secondNumber = 9;
                  double result = firstNumber*secondNumber/secondNumber-firstNumber+firstNumber%secondNumber;
        System.out.println(result);

        //-------------------------------------
        //В методе main инициализировать все примитивные типы и не примитивные типы.
        //2. Вывести их результат в консоль:
        //char: G
        //int: 89
        //byte: 4
        //short: 56
        //float: В методе main инициализировать все примитивные типы и не примитивные типы.
        //2. Вывести их результат в консоль:
        //char: G
        //int: 89
        //byte: 4
        //short: 56
        //float: 4.7333436
        //double: 4.355453532
        //long: 12121
        //
        //Character: G
        //Integer: 89
        //Byte: 4
        //Short: 56
        //Float: 4.7333436
        //Double: 4.355453532
        //Long: 12121
        //double: 4.355453532
        //long: 12121
        //
        //Character: G
        //Integer: 89
        //Byte: 4
        //Short: 56
        //Float: 4.7333436
        //Double: 4.355453532
        //Long: 12121

        char charVal = 'G';
        int intVal = 89;
        byte byteVal = 4;
        short shortVal = 56;
        float floatVal = 4.7333436F;
        //---------------------------------

    }
}