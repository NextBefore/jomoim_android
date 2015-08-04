package nextbefore.jomoim.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import nextbefore.jomoim.R;
import nextbefore.jomoim.controller.TaskArrangeListAdapter;
import nextbefore.jomoim.model.User;


public class TaskArrange extends Activity implements AdapterView.OnItemClickListener{

    private ListView userTaskList;
    private ArrayList<User> taskList;

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,TaskDetail.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_arange);

        /* ~~~~~~~ 테스트용 가상 데이터 삽입 ~~~~~~~~~~ */
        User task = new User("first");
        User task2 = new User("second");
        taskList = new ArrayList<User>();

        taskList.add(0,task);
        taskList.add(1,task2);
        /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

        userTaskList = (ListView)findViewById(R.id.taskArrange_listView);
        userTaskList.setAdapter(new TaskArrangeListAdapter(this,R.layout.view_task_arange,taskList));

        userTaskList.setOnItemClickListener(this);



    }
}
