package com.company.task021;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task021 {

    public static class LetterFrequency {
        public char symbol;
        public int freq;

        public LetterFrequency(char symbol) {
            this.symbol = symbol;
            this.freq = 1;
        }

        @Override
        public String toString() {
            return "symbol: " + symbol + "; freq = " + freq;
        }
    }

    public static void run() {
        String text = "Постройте частотный словарь букв русского (или английского) алфавита. Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).";

        List<LetterFrequency> dictionary = new ArrayList<>();
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            boolean contains = false;
            char symbol = text.charAt(i);

            if ((symbol < 'а' || symbol > 'я') && (symbol < 'a' || symbol > 'z'))
                continue;

            for (LetterFrequency letterFreq : dictionary)
                if (letterFreq.symbol == symbol) {
                    letterFreq.freq += 1;
                    contains = true;
                    break;
                }
            if (!contains)
                dictionary.add(new LetterFrequency(symbol));
        }

        System.out.println("Output: ");
        for (LetterFrequency lf : dictionary)
            System.out.println(lf);

    }
}
