package org.example.notification;

import org.example.NotificationInfo;
import org.example.NotificationType;

public interface Notification {

    void send(NotificationInfo info);
    NotificationType getType();
}
