package nextbefore.jomoim.chatting.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

import nextbefore.jomoim.R;
import nextbefore.jomoim.chatting.entity.Message;

/**
 * Created by Henry on 15. 7. 9..
 *
 * ChattingAdpater 클래스
 * 역할 : Chatting기능에서 Listview에 각각의 채팅 데이터를 삽입하는 기능
 *
 */
public class ChattingAdapter extends ArrayAdapter<Message>{

    private Context context;
    private int layoutResourceId;
    private ArrayList<Message> messages;
    private LayoutInflater inflater;


    /*
     * ViewHolder패턴을 이용해 뷰 재활용
     */
    public class ViewHolder{
        public ImageView profileImage;
        public TextView sender;
        public TextView time;
        public TextView message;
    }

    public ChattingAdapter(Context context, int layoutResourceId, ArrayList<Message> messages){
        super(context, layoutResourceId, messages);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.messages = messages;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView == null){
            convertView = inflater.inflate(layoutResourceId, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.profileImage = (ImageView) convertView.findViewById(R.id.row_profile_image);
            viewHolder.message = (TextView) convertView.findViewById(R.id.row_message);
            viewHolder.sender = (TextView) convertView.findViewById(R.id.row_sender);
            viewHolder.time = (TextView) convertView.findViewById(R.id.row_time);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.message.setText(messages.get(position).getMessage());
        viewHolder.sender.setText(messages.get(position).getSender());
        viewHolder.time.setText(messages.get(position).getTime());

        //프로필 이미지 부분은 차후 구현

        return convertView;
    }
}
