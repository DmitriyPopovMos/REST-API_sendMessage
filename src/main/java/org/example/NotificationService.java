package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.notification.Notification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j                                         // @Slf4j — (Simple Logging Facade for Java) аннотация для логирования. При применении к классу она автоматически создаёт статический экземпляр логгера SLF4J по имени log.
@Service                                       // @Service - Указывает, что класс содержит бизнес-логику, вычисления или вызовы внешних API
public class NotificationService {

    private final Map<NotificationType, Notification> notificationMap;

    public NotificationService(List<Notification> list) {
        this.notificationMap = list.stream()
                .collect(Collectors.toMap(Notification::getType, Function.identity()));
    }

    public void send(NotificationInfo info) {
        Notification notification = notificationMap.get(info.getType());
        notification.send(info);
    }
}
