package com.kb5012.timetable;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Ronald on 14-12-2015.
 */
public class DBHelper {
    // alleen gebruikt voor demo
    private ArrayList<Group> groups = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    //ToDo database connection maken..
    public DBHelper() {
    }

    public static User userInlog(String username, String password) {
        // demofwefeee
        if (username.equals("username") && password.equals("password")) {
            User user = new User();
            user.setId(14);
            user.setFirstName("test");
            user.setLastName("testen");
            return user;
        }
        // TODO hier user ophalen met wachtwoord en username van db als er geen is word er niks teruggegeven.
        return null;
    }

    public static User findUserById(int id) {
        //TODO hier de user uithalen
        //demo test
        User user = new User();
        user.setId(16);
        user.setFirstName("test");
        user.setLastName("testen");
        return user;
    }

    public static ArrayList<Task> findAllTaskByUserId(int userId) {
        //TODO hier uit db halen alle taken van user.
        // demo code hier
        ArrayList<Task> tasks = new ArrayList<>();
        Task task;
        for (int i = 0; i < 10; i++) {
            task = new Task();
            task.setID(i);
            task.setName("taak " + i);
            task.setTaskMaker("maker " + i);
            task.setTaskUser("user " + i);
            tasks.add(task);
        }
        return tasks;
    }
    public static ArrayList<Group>findAllGroupByUserId(int userId){
        //TODO hier uit db halen alle groupen van user
        ArrayList<Group> groups=new ArrayList<>();
        Group group;
        User user=new User();
        user.setId(userId);
        for (int i = 0; i <10 ; i++) {
            group=new Group(user);
            group.setId(i);
            if(group.getId()==4){
                group.setTasks(DBHelper.findAllTaskByUserId(0));
            }
            group.setName("group "+i);
            groups.add(group);
        }

        return groups;
    }
}
