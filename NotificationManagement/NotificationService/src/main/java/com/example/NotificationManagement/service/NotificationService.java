package com.example.NotificationManagement.service;

//import com.example.NotificationManagement.model.Notification;
import com.example.NotificationManagement.model.Notifications;
import com.example.NotificationManagement.model.Students;

public interface NotificationService
{
    void sendNotification(String notificationType, Students student);
    Notifications getNotificationById(int notificationId);
}