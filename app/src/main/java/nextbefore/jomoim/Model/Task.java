package nextbefore.jomoim.model;

/**
 * Created by JaeBong on 15. 7. 27..
 */
public class Task {
    public String taskTitle;
    public String taskDetail;
    public long   taskDueDate;
    public User   taskArrangedUser;
    public String taskStatus;

    public Task(String taskTitle, String taskDetail, long taskDueDate, User taskArrangedUser) {
        this.taskTitle = taskTitle;
        this.taskDetail = taskDetail;
        this.taskDueDate = taskDueDate;
        this.taskArrangedUser = taskArrangedUser;
        this.taskStatus = "TODO";
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public long getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(long taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public User getTaskArrangedUser() {
        return taskArrangedUser;
    }

    public void setTaskArrangedUser(User taskArrangedUser) {
        this.taskArrangedUser = taskArrangedUser;
    }
}
