package org.example.notification;

import lombok.extern.slf4j.Slf4j;
import org.example.NotificationInfo;
import org.example.NotificationType;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class WhatsAppNotification implements Notification {
    @Override
    public void send(NotificationInfo info) {
        log.info("Отправляем в WhatsApp: {}", info.getMessage());       // log.info() - Регистрирует сообщение на информационном уровне и делает запись в лог
        log.info("1");
        log.info("1");
        log.info("1");
        log.info("1");
        log.info("1");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.WHATSAPP;
    }
}
