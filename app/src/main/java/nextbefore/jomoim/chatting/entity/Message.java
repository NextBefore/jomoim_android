package nextbefore.jomoim.chatting.entity;

/**
 * Created by Henry on 15. 7. 9..
 */
public class Message {
    private String sender;
    private String topic;
    private String message;
    private String time;

    public Message(String sender, String topic, String message, String time) {
        this.sender = sender;
        this.topic = topic;
        this.message = message;
        this.time = time;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time = time;
    }
}
