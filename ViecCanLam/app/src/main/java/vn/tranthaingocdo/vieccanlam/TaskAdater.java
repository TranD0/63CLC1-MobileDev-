package vn.tranthaingocdo.vieccanlam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TaskAdater extends BaseAdapter {
    private List<TASKS> lsTask;
    private LayoutInflater inflater;
    private Context context;

    public TaskAdater(List<TASKS> lsTask, Context context) {
        this.lsTask = lsTask;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }
    public class TaskItemViewHolde{
        TextView Name, date;
    }
    @Override
    public int getCount() {
        return lsTask.size();
    }

    @Override
    public Object getItem(int position) {
        return lsTask.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TaskItemViewHolde taskItemViewHolde;
        if(convertView==null){
            convertView = inflater.inflate(R.layout.task_item,null);
            taskItemViewHolde = new TaskItemViewHolde();
            taskItemViewHolde.Name = convertView.findViewById(R.id.editTextName);
            taskItemViewHolde.date = convertView.findViewById(R.id.editTextDate);
            convertView.setTag(taskItemViewHolde);
        } else
        {
            taskItemViewHolde = (TaskItemViewHolde) convertView.getTag();
        }
        TASKS tasksitem =lsTask.get(position);
        taskItemViewHolde.Name.setText(tasksitem.getName());
        taskItemViewHolde.date.setText(tasksitem.getDate());
        return convertView;
    }
}
