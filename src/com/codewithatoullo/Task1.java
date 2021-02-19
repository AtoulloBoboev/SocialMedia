package com.codewithatoullo;

/**
 * Нам необходимо создать свою небольшую социальную сеть на Java.
 * <p>
 * Для этого мы должны реализовать следующие классы:
 * User - сущность “Пользователь”
 * Message - сущность “Сообщение”
 * MessageDatabase - класс, который будет заниматься хранением сообщений
 * Task1 - класс, где в методе main() мы будем тестировать нашу соц. сеть
 */

public class Task1 {

    public static void main(String[] args) {
        User Atoullo = new User("Atoullo");
        User Azam = new User("Azam");
        User Amin = new User("Amin");

        Atoullo.sendMessage(Azam, "Hello Atoullo!");
        Atoullo.sendMessage(Azam, "How are you?");

        Azam.sendMessage(Atoullo, "Hi, Atoullo!");
        Azam.sendMessage(Atoullo, "I'm Azam. Nice to meet you.");
        Azam.sendMessage(Atoullo, "I'm fine, how about you?");

        Amin.sendMessage(Atoullo, "Hi, my name is Amin.");
        Amin.sendMessage(Atoullo, "Do you remember me?");
        Amin.sendMessage(Atoullo, "We worked to the same company");

        Atoullo.sendMessage(Amin, "Hi Amin! Of course I remember you!");
        Atoullo.sendMessage(Amin, "So nice to see you again.");
        Atoullo.sendMessage(Amin, "Let's meet up. Are you free tomorrow?");

        Amin.sendMessage(Atoullo, "Yep, I'm free tomorrow. Let's go");

        MessageDatabase.showDialog(Atoullo, Amin);


    }
}
