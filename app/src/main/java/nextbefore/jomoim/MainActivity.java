package nextbefore.jomoim;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private LinearLayout taskArrangeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskArrangeLayout = (LinearLayout)findViewById(R.id.layout_taskArange);
        taskArrangeLayout.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.layout_taskArange :
                Intent intent = new Intent(this,TaskArrange.class);
                startActivity(intent);
                break;
        }
    }
}
