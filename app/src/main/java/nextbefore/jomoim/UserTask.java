package nextbefore.jomoim;

import java.util.ArrayList;

/**
 * Created by JaeBong on 15. 7. 8..
 */
public class UserTask {
    public String profileImage;
    public ArrayList<String> taskList;

    public UserTask(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public ArrayList<String> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<String> taskList) {
        this.taskList = taskList;
    }
}
