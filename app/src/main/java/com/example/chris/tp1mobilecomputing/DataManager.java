package com.example.chris.tp1mobilecomputing;

import java.util.ArrayList;
import java.util.List;

public class DataManager
{
    private static DataManager INSTANCE;

    private List<String> nameList;

    private DataManager()
    {
        nameList = new ArrayList<>();
    }

    public static DataManager getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new DataManager();
        }

        return INSTANCE;
    }

    public List<String> getName()
    {
        return nameList;
    }

    public void setName(List<String> name)
    {
        this.nameList = name;
    }

    public void addName(String name)
    {
        this.nameList.add(name);
    }
}
