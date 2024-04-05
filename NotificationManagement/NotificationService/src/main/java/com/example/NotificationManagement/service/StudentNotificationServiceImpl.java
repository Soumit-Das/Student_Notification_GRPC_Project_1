package com.example.NotificationManagement.service;

import com.example.NotificationManagement.model.Notifications;
import com.proto.NotificationRequest;
import com.proto.NotificationResponse;
import com.proto.StudentNotificationServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class StudentNotificationServiceImpl extends StudentNotificationServiceGrpc.StudentNotificationServiceImplBase
{
    Logger log = LoggerFactory.getLogger(StudentNotificationServiceImpl.class);
    @Autowired
    NotificationService notificationService;
    @Override
    public void getNotificationById(NotificationRequest request, StreamObserver<NotificationResponse> responseObserver) {

        int notificationId = request.getNotificationId();
        Notifications notification = notificationService.getNotificationById(notificationId);
        if(notification==null)
        {
            log.info("Notification doesn't exist");
        }
        else
        {
            log.info(notification.getNotificationId()+"");
        }
        NotificationResponse response = NotificationResponse.newBuilder().setNotificationId(notification.getNotificationId())
                .setStudentName(notification.getPayload().getName()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
