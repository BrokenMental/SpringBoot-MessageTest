package message.test.demo;

import lombok.Data;

@Data
public class ChatMessage {
    private String from;
    private String text;
    private String recipient;
    private String time;

    // 기본 생성자
    public ChatMessage() {}

    // 메시지 생성자
    public ChatMessage(String from, String text, String recipient) {
        this.from = from;
        this.text = text;
        this.recipient = recipient;
        this.time = java.time.LocalTime.now().toString();
    }
}
