package ru.netlogy.domain;

public class PostSource {
    private int id;
    private String type; //Тип источника. Возможные значения: vk, widget, api, rss, sms
    private String platform; // Название платформы, если оно доступно. Возможные значения: android; iphone; wphone
    private String data; // Тип действия (только для type = vk или widget)
    private String url; // URL ресурса, с которого была опубликована запись

    // + get/set на все поля
}
