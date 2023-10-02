package seminar3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: (Фамилия Имя Отчество ДатаРождения НомерТелефона Пол):");
        System.out.print("фамилия, имя, отчество - строки\n" +
                "датарождения - строка формата dd.mm.yyyy\n" +
                "номертелефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m.\n" +
                "Ввоод: ");
        String input = scanner.nextLine();

        try {
            String[] userData = input.split(" ");
            if (userData.length != 6) {
                throw new IllegalArgumentException("Введено неверное количество данных.");
            }

            String lastName = userData[0];
            String firstName = userData[1];
            String middleName = userData[2];
            String birthDate = userData[3];
            String phoneNumber = userData[4];
            String gender = userData[5];

            validateData(lastName, firstName, middleName, birthDate, phoneNumber, gender);

            String fileName = lastName + ".txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                String userDataLine = lastName + firstName + middleName + birthDate + " " + phoneNumber + gender;
                writer.write(userDataLine);
                writer.newLine();
                System.out.println("Данные успешно записаны в файл " + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IllegalArgumentException | ValidationException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    private static void validateData(String lastName, String firstName, String middleName, String birthDate, String phoneNumber, String gender) throws ValidationException {
        validateName(lastName);
        validateName(firstName);
        validateName(middleName);
        validateBirthDate(birthDate);
        validatePhoneNumber(phoneNumber);
        validateGender(gender);
    }

    private static void validateName(String name) throws ValidationException {
        if (!name.matches("[A-Za-zА-Яа-я]+")) {
            throw new ValidationException("Неверный формат имени/фамилии/отчества.");
        }
    }

    private static void validateBirthDate(String birthDate) throws ValidationException {
        if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new ValidationException("Неверный формат даты рождения. Ожидается dd.mm.yyyy.");
        }
    }

    private static void validatePhoneNumber(String phoneNumber) throws ValidationException {
        if (!phoneNumber.matches("\\d+")) {
            throw new ValidationException("Неверный формат номера телефона. Ожидается целое число.");
        }
    }

    private static void validateGender(String gender) throws ValidationException {
        if (!gender.matches("[fmFM]")) {
            throw new ValidationException("Неверный формат пола. Ожидается 'f' или 'm'.");
        }
    }

    static class ValidationException extends Exception {
        public ValidationException(String message) {
            super(message);
        }
    }
}

