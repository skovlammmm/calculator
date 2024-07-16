package ru.krista.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число, операцию (+, -, *, /) и второе число через пробел:");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("Неверный ввод. Пожалуйста, введите данные в формате: <число> <операция> <число>");
            return;
        }

        int num1;
        int num2;

        try {
            num1 = Integer.parseInt(parts[0]);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: " + parts[0]);
            return;
        }

        try {
            num2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: " + parts[2]);
            return;
        }

        char operation = parts[1].charAt(0);

        if (parts[1].length() != 1 || "+-*/".indexOf(operation) == -1) {
            System.out.println("Неверная операция. Используйте +, -, * или /.");
            return;
        }

        float result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: Деление на ноль.");
                    return;
                }
                result = (float) num1 / num2;
                break;
            default:
                System.out.println("Неверная операция. Используйте +, -, * или /.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}