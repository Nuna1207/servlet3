package ru.mirea;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 19.04.2018.
 */
public class MyTodoModel implements TodoModel {
    private List<TodoItem>items=new ArrayList<>();
    private int count=1;

    public MyTodoModel() {
        add("oooo");
        add("pppp");
    }

    @Override
    public List<TodoItem> getItems() {
        return items;
    }

    @Override
    public void add(String text) {
       items.add(new TodoItem(count,text));
       count++;

    }

    @Override
    public void delete(int id) {
        for (int i=0;i<items.size();i++){
            TodoItem list=items.get(i);
            if (list.getId()==id){
                items.remove(i);
                return;
            }

        }


    }
}
