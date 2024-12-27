package org.example.notification;

import lombok.extern.slf4j.Slf4j;
import org.example.NotificationInfo;
import org.example.NotificationType;
import org.springframework.stereotype.Component;

@Slf4j                                  // @Slf4j — (Simple Logging Facade for Java) аннотация для логирования. При применении к классу она автоматически создаёт статический экземпляр логгера SLF4J по имени log.
@Component                              // @Component — указывает, что класс является компонентом и рассматривается как кандидат для автоматического обнаружения и сканирования пути к классам.
public class TelegramNotification implements Notification {
    @Override
    public void send(NotificationInfo info) {
        log.info("Отправляем в TELEGRAM: {}", info.getMessage());   // log.info() - Регистрирует сообщение на информационном уровне и делает запись в лог
        log.info("1");
        log.info("1");
        log.info("1");
        log.info("1");
        log.info("1");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.TELEGRAM;
    }
}
