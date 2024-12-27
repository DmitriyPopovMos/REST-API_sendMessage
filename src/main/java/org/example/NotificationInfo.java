package org.example;

import lombok.Data;

@Data                                    // @Data — автоматически генерирует ГЕТТЕРЫ для всех полей, СЕТТЕРЫ для всех НЕ финальных полей, МЕТОДЫ equals() и hashCode() и МЕТОД toString().
public class NotificationInfo {

    private long id;
    private long userId;
    private String message;
    private NotificationType type;
}
