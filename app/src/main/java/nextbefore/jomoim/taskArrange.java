package nextbefore.jomoim;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class TaskArrange extends ActionBarActivity {

    private ListView userTaskList;
    private ArrayList<UserTask> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_arange);

        /* ~~~~~~~ 테스트용 가상 데이터 삽입 ~~~~~~~~~~ */
        UserTask task = new UserTask("first");
        UserTask task2 = new UserTask("second");
        taskList = new ArrayList<UserTask>();

        taskList.add(0,task);
        taskList.add(1,task2);
        /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

        userTaskList = (ListView)findViewById(R.id.taskArrange_listView);
        userTaskList.setAdapter(new TaskArrangeListAdapter(this,R.layout.view_task_arange,taskList));

    }
}
