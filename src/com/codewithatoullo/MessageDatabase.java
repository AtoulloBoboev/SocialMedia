package com.codewithatoullo;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс MessageDatabase должен иметь следующую структуру:
 * <p>
 * Поля:
 * Статическое поле “сообщения” (англ. messages), которое будет хранить список из сообщений (объектов класса Message).
 * Это поле должно инициализироваться пустым списком.
 * Этот список и есть наша условная “база данных”, которая хранит все сообщения в соц. сети.
 * <p>
 * Конструктор:
 * Нет конструктора.
 * Объекты класса MessageDatabase создаваться не будут (все методы и поля статические).
 * <p>
 * Методы:
 * public static void addNewMessage(User u1, User u2, String text) - этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text. Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
 * public static List<Message> getMessages() - возвращает список всех сообщений в “базе данных”.
 * public static void showDialog(User u1, User u2) - этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:
 * -user1: Привет!
 * -user2: Привет, user1!
 * -user1: Как у тебя дела?
 * -user2: Все ок, спасибо :)
 */
public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    //public static void addNewMessage(User u1, User u2, String text) - этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.
    // Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    //public static void showDialog(User u1, User u2) - этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2.
    // Формат вывода должен быть таким:

    /**
     * -user1: Привет!
     * -user2: Привет, user1!
     * -user1: Как у тебя дела?
     * -user2: Все ок, спасибо :)
     */
    public static void showDialog(User Atoullo, User Azam) {
        for (Message message : messages) {
            if (message.getSender() == Atoullo && message.getReceiver() == Azam || message.getSender() == Azam && message.getReceiver() == Atoullo) {

                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}
