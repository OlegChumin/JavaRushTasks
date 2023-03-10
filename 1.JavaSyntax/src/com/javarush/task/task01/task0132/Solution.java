package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        // выводим на экран значение - результат вызова метода sumDigitsInNumber
        // со значением аргумента 546
        System.out.println(sumDigitsInNumber(546));
    }

    // метод sumDigitsInNumber принимает в качестве аргумента число, считает
    // сумму его цифр и возвращает это значение в качестве результата
    public static int sumDigitsInNumber(int number) {
        // создаем переменную sum типа int, в которой будем хранить сумму цифр
        // и присваиваем ей начальное значение 0
        int sum = 0;
        // number % 10 дает остаток от деления number на 10, а это и будет
        // последняя (третья) цифра числа number, прибавляем ее к сумме
        sum = sum + number % 10;
        // number / 10 дает целочисленное деление number на 10 (результат целое
        // число, дробная часть отбрасывается), то есть в number будет записано
        // число, состоящее из первой и второй цифры изначального числа
        number = number / 10;
        // number % 10 дает остаток от деления number на 10, а это и будет вторая
        // цифра числа number, прибавляем ее к сумме
        sum = sum + number % 10;
        // number / 10 дает целочисленное деление number на 10 (результат целое
        // число, дробная часть отбрасывается), то есть в number будет записано
        // число, состоящее из первой цифры изначального числа
        number = number / 10;
        // number % 10 дает остаток от деления number на 10, а это и будет первая
        // цифра числа number, прибавляем ее к сумме
        sum = sum + number % 10;
        // возращаем значение переменной sum как результат работы метода
        return sum;
    }
}
