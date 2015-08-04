package nextbefore.jomoim.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import nextbefore.jomoim.R;
import nextbefore.jomoim.model.Task;
import nextbefore.jomoim.model.User;

public class TaskDetail extends Activity {
    private ImageView profileImageView;
    private TextView sumOfTaskCountTextView;
    private TextView todoCountTextView;
    private TextView doneCountTextView;

    private ListView taskDetailListView;

    public ArrayList<Task> taskArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        profileImageView = (ImageView)findViewById(R.id.imageView_taskDetail_profile);
        sumOfTaskCountTextView = (TextView)findViewById(R.id.textView_taskDetail_sumOfTask_count);
        todoCountTextView = (TextView)findViewById(R.id.textView_taskDetail_todo_count);
        doneCountTextView = (TextView)findViewById(R.id.textView_taskDetail_done_count);

        taskDetailListView = (ListView)findViewById(R.id.listView_taskDetail);

        //test를 위한 가짜 데이터 생성
        Task test1 = new Task("제목","테스트를 위한 가짜 데이터 1",System.currentTimeMillis(),new User("JaeBong"));
        Task test2 = new Task("제목","테스트를 위한 가짜 데이터 2",System.currentTimeMillis(),new User("JaeBong"));
        test2.setTaskStatus("DONE");

        taskArrayList = new ArrayList<Task>();
        taskArrayList.add(test1);
        taskArrayList.add(test2);

    }


    public String makeLongTimeToDateString(Long time){
        DateFormat df = new SimpleDateFormat("HH:mm:ss"); // HH=24h, hh=12h
        String dateString = df.format(time);

        return dateString;

    }

    //ArrayList에서 TODO의 개수를 가져오기 위한 함수
    public int getTODOCount(ArrayList<Task> taskArrayList){
        int TODOcount = 0;
        for (Task task : taskArrayList){
            if(task.getTaskStatus().equals("TODO")){
                TODOcount++;
            }

        }
        return TODOcount;
    }

    //ArrayList에서 DONE의 개수를 가져오기 위한 함수
    public int getDONECount(ArrayList<Task> taskArrayList){
        int DONEcount = 0;
        for (Task task : taskArrayList){
            if(task.getTaskStatus().equals("DONE")){
                DONEcount++;
            }

        }
        return DONEcount;
    }


}
