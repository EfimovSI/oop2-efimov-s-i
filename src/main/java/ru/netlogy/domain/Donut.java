package ru.netlogy.domain;

public class Donut {
    private int id;
    private boolean isDonut; // запись доступна только платным подписчикам (VK Donut)
    private int paidDuration; // время, в течение которого запись будет доступна только платным подписчикам (VK Donut)
    private String placeholder; // заглушка для пользователей, которые не оформили подписку.
                                // Отображается вместо содержимого записи
    private boolean canPublishFreeCopy; // можно ли открыть запись для всех пользователей, а не только донатеров
    private String editMode; // информация о том, какие значения VK Donut можно изменить в записи

    // + get/set на все поля
}
