package ru.netlogy.domain;

public class CommentsInfo {
    private int id;
    private int userId;
    private boolean canComment;
    private int counter;
    private boolean groupsCanPost; // Информация о том, могут ли сообщества комментировать запись
    private boolean canClose; // Может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen; // Может ли текущий пользователь открыть комментарии к записи
    // private String time;  Вероятно, менеджер поста присваивает время комментарию

    // + get/set на все поля
}
