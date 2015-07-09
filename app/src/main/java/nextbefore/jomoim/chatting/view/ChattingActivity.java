package nextbefore.jomoim.chatting.view;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import nextbefore.jomoim.R;
import nextbefore.jomoim.chatting.entity.Message;
import nextbefore.jomoim.chatting.model.DAO;

public class ChattingActivity extends ActionBarActivity {

    /*
        Listener 인터페이스
        Bussiness로직은 Controller에 구현하기 위해 필요한 인터페이스만을 정의해 둠.
        Controller에서 본 인터페이스를 구현함.
     */

    interface Listener{
        void sendMessage();
        void receiveMessage();
    }


    private Listener listener;
    /*
     * topic변수는 이전 Activity에서 받아와 이 topic을 이용해 mqtt로 채팅을 구현.
     */
    private String topic;
    private DAO dao;
    private ArrayList<Message> messages;
    private ListView listView;

    public void setListener(Listener listener){
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);

        showChattingHistory();
    }

    /*
     * showChattingHistory메소드
     * 역할 : ListView에 Adpater를 이용하여 채팅 기록을 띄워줌
     */
    private void showChattingHistory(){
        listView = (ListView)findViewById(R.id.chatting_list_view);
        messages = getChattingHistory();
        ChattingAdapter chattingAdapter = new ChattingAdapter(this, R.layout.chatting_row, messages);
        listView.setAdapter(chattingAdapter);
    }


    private ArrayList<Message> getChattingHistory(){
        topic = getIntent().getExtras().getString("Topic");
        dao = DAO.getInstance(topic);
    }


}
