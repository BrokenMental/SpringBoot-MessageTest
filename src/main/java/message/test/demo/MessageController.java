package message.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping("/send")
    public void sendPrivateMessage(String username, String message) {
        this.template.convertAndSendToUser(username, "/queue/messages", message);
    }
}