package org.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController                                 // @RestController - Обрабатывает ВСЕ входящие HTTP запросы (например от Postman).
public class NotificationController {

    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @PostMapping                            // @PostMapping("/Путь") — Обрабатывает HTTP POST-запросы и возвращает ответ (Аналог INSERT INTO)
    public void sendNotification(@RequestBody NotificationInfo info) {            // @RequestBody - извлекает данные ВСЕГО ТЕЛА HTTP-запроса (часто в формате JSON или XML), для десериализации их в объект Java (в объект entity)
        service.send(info);
    }
}
