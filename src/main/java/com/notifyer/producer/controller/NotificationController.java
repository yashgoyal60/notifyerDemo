package com.notifyer.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("notification")
public class NotificationController {


    @GetMapping("/healthcheck")
    public String healthCheck(){
        return "OK";
    }

//    @GetMapping("listing")
//    public Object healthCheck2(){
//        return whatsAppNotificationService.getListing();
//    }

    //Mobile Notification types -> Whatsapp, mail, msg

    //Non quick-response time
    //Notification types
    //Bill payment
    //Stock availability
    //Promotional Emails

    //quick response time
    //Complete bill with code
    //Promotional Emails

//    @PostMapping("/whatsapp")
//    public void sendWhatsappNotification(@RequestBody Object object) {
//        whatsAppNotificationService.publishWhatsAppNotificationEvent();
//        return;
//    }

}
