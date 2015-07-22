package nextbefore.jomoim.chatting.model;

import java.util.ArrayList;

import nextbefore.jomoim.chatting.entity.Message;

/**
 * Created by Henry on 15. 7. 9..
 */
public class ChattingDataAccessor {

    public static ChattingDataAccessor dao = new ChattingDataAccessor();

    private ArrayList<Message> messages;
    private ChattingDataAccessor(){}

    public static ChattingDataAccessor getInstance(){
        return dao;
    }

    public ArrayList<Message> getMessages(String topic){
        return messages;
    }
}
