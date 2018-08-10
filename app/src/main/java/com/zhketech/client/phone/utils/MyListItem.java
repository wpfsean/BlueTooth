package com.zhketech.client.phone.utils;

/**
 * Created by Root on 2018/7/31.
 */

public class MyListItem {

    /**
     * 数据id
     */
    private int    dataId;
    /**
     * 数据
     */
    private String data;

    public int getPosition()
    {
        return dataId;
    }

    public void setPosition(int position)
    {
        this.dataId = position;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }
}
