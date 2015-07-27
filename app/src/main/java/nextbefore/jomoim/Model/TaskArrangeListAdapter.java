package nextbefore.jomoim.model;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import nextbefore.jomoim.R;

/**
 * Created by JaeBong on 15. 7. 8..
 */
public class TaskArrangeListAdapter extends ArrayAdapter<User>{

    private Context context;
    private int resourceId;
    private ArrayList<User> UserList;

    public TaskArrangeListAdapter(Context context, int resource, ArrayList<User> UserList) {
        super(context, resource, UserList);

        this.context = context;
        this.resourceId = resource;
        this.UserList = UserList;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;

        if(row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(resourceId,parent,false);
        }
        ImageView profileImage = (ImageView)row.findViewById(R.id.image_student);

        return row;

    }


}
