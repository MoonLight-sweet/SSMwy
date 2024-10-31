package com.property.management.giveserviceutil;

import java.util.ArrayList;


public class ParamDTO {
    private ArrayList<Integer> ids;

    public ArrayList<Integer> getIds() {
        return ids;
    }

    public void setIds(ArrayList<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "ParamDTO{" +
                "ids=" + ids +
                '}';
    }
}
