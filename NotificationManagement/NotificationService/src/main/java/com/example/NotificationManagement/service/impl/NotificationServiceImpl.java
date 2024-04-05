package com.example.NotificationManagement.service.impl;

import com.example.NotificationManagement.model.Notifications;
import com.example.NotificationManagement.model.Students;
import com.example.NotificationManagement.repository.NotificationRepository;
import com.example.NotificationManagement.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService
{
    @Autowired
    private NotificationRepository notificationRepository;
    @Override
    public void sendNotification(String notificationType, Students student)
    {
        Notifications notification = new Notifications();
        notification.setNotificationId(1);
        notification.setNotificationType(notificationType);
        notification.setPayload(student);
        notification.setCreatedOn(LocalDate.now());
        notificationRepository.save(notification);
    }

    public Notifications getNotificationById(int notificationId)
    {
        Optional<Notifications> notification = notificationRepository.findById(notificationId);
        if (notification.isPresent())
        {
            return notification.get();
        }
        return null;
    }
}
