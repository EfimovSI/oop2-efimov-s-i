package ru.netlogy.domain;

public class Post {
    private int id;
    private int ownerId; // Идентификатор владельца стены, на которой размещена запись
    private int fromId; // Идентификатор автора записи
    private int createdBy; // Идентификатор администратора, который опубликовал запись
    private String text;
    private int date; // Время публикации записи в формате unixtime. Приведено в соответствие с документацией
    private int replyOwnerId; // Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId; // Идентификатор записи, в ответ на которую была оставлена текущая.
    private boolean friendsOnly; // Запись была создана с опцией «Только для друзей».
    private String postType; // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private String multimediaUrl;
    private int signerId; // Идентификатор автора, если запись была опубликована
                          // от имени сообщества и подписана пользователем
    private boolean canPin; // Информация о том, может ли текущий пользователь закрепить запись
    private boolean canDelete; // Информация о том, может ли текущий пользователь удалить запись
    private boolean canEdit; // Информация о том, может ли текущий пользователь редактировать запись
    private boolean isPinned; // Информация о том, что запись закреплена
    private boolean markedAsAds; // Информация о том, содержит ли запись отметку «реклама»
    private boolean isFavorite; // true, если объект добавлен в закладки у текущего пользователя
    private int postponedId; // Идентификатор отложенной записи. Это поле возвращается тогда,
                             // когда запись стояла на таймере
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private Copyright copyright; // Добавлен по документации
    private PostSource postSource; // Добавлен по документации
    private Geo geo; // Добавлен по документации. Информация о местоположении
    private Donut donut; // Информация о записи (VK Donut)

    // + get/set на все поля
}
