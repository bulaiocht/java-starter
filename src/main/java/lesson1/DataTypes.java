package lesson1;

public class DataTypes {

    public static void main(String[] args) {

        // 8-bit -128 -> 127  !!! byte aByte2 = 129;
        byte aByte = 12;

        System.out.println(aByte);

        // 16-bit	-32768	-> 32767 !!! short aShort2 = 32800;
        short aShort = 256;

        //32-bit	-2147483648	2147483647
        int anInt = 128;

        System.out.println((byte)anInt);

        //64-bit	-9223372036854775808	9223372036854775807
        long aLong = 10000000000L;

        //32-bit	-3.4E+38	3.4E+38 (3.4 * 10 в 38-ой степени)
        float aFloat = 23.45f;

//        // 64-bit	-1.7E+308	1.7E+308
        double aDouble = 23434.434;

//        // System.out.println(3.4 * Math.pow(10, 38));

        int x;
        x = 10;

        int y, z, t;

        y = 12;
        z = 10;
        t = 43;

        char aChar = 'Q';

        // 0 до 65536
        char aCharNumber = 116;

        System.out.println(aCharNumber);

        boolean bool = true;
        boolean bool2 = false;

        System.out.println(bool2);

        int X = 50000;

        short Y = (short)X;
        byte Z = (byte)Y;
        System.out.println(" A short variable now is: " + Y + " and this is a byte variable: " + Z );

        String str = "Hello World";
        System.out.println(str);

        Integer ok = new Integer(10);
        Integer ko = new Integer(12);

         HelloWorld hello = new HelloWorld(4);

         String[] args1 = {"Hello", "Good Bye"};

        HelloWorld.main(args1);

        System.out.println(ok);
        ok = 125;
        System.out.println(ok);

        Long longer = 122L;
        System.out.println(longer);

       System.out.println(ok.compareTo(longer.intValue()));




    }

}
