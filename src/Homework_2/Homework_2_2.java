package Homework_2;

import java.math.BigDecimal;
import java.time.Instant;

public class Homework_2_2 {
    public static void main(String[] args) {

        String str_main = """
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                00001 0001 200020 0220 100002310 000210 10200120
                dvzxv;asd asdf;laskdf';as asdl;fkasd;flk
                asdfl;aksfl;ksmsadfl;kasdfkasl;dfkasdf asdfl;kasfl;kasfkam asdfl;kasdf;
                ывадфываждфлыалд фывладфыдвлажьфыжбвфыждфы фылдофыдвафыа фдылаофыджаофыбюта""";

        long start = System.nanoTime();

        String str_1= str_main.replace("0", "йцуйфсячсячсяч");

        long finish = System.nanoTime();
        long delta_time = finish - start;
        System.out.println("Прошло времени у ментода стринг для подстрок, нс: " + delta_time );



        StringBuilder builder = new StringBuilder(str_main);
        start = System.nanoTime();

        builder.toString().replace("0", "йцуйфсячсячсяч");

        finish = System.nanoTime();
        delta_time = finish - start;

        System.out.println("Прошло времени у ментода стрингбилдер для подстрок, нс: " + delta_time );

    }
}

