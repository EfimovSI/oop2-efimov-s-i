package ru.netlogy.domain;

public class LikesInfo {
    private int id;
    private int userId;
    private boolean isLiked;
    private int counter;
    private boolean canLike; // Информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private boolean canPublish; // Информация о том, может ли текущий пользователь сделать репост записи

    // + get/set на все поля
}
