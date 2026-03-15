package Module.Basics;

import javax.lang.model.SourceVersion;

public class VariableExample {
    static void main() {
        /*Datatypes in java*/
        //Integers-> byte,short,int ,long
        byte byte_value=122;
        System.out.println("byte_Value = " + byte_value);
        short shot_value=6767;
        System.out.println("shot_value = " + shot_value);
        int integer_value=232424542;
        System.out.println("integer_value = " + integer_value);
        long long_value=235457898;
        System.out.println("long_value = " + long_value);
        //Boolean Data
        boolean is_true=false;
        System.out.println("is_true = " + is_true);
        //Real Numbers
        float float_value= 23.1232f;
        System.out.println("float_value = " + float_value);
        double double_value=23424.232242;
        System.out.println("double_value = " + double_value);
        //Character values
        char char_Value='a';
        char char_Value1='2';
        System.out.println("char_Value = " + char_Value);
        System.out.println("char_Value = " + char_Value1);
        /*we also provide binary octal and hexadecimal values inside these datatypes
        * Note: As a developer we hardly use that numbers always work with DecimalNumbers*/
        /** @see
         */
        int  binaryValue= 0b101 ;//->binary of 5 but without the predefined keyword for binary(0b)
        System.out.println("binaryValue = " + binaryValue);
        byte octal_value=05;//range{0-7 after use conversion processes}
        System.out.println("octal_value = " + octal_value);
        long hexadecimal_value = 0xC;//0x for hexadecimal in range {0-9 to A-F}
        System.out.println("hexadecimal_value = " + hexadecimal_value);//output:hexadecimal_value = 12





    }
}
