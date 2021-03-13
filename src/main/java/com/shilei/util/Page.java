package com.shilei.util;

import java.util.List;

public class Page<T> {
    /*当前页*/
    private int page;
    /*总页数*/
    private int total;
    /*每页显示条数*/
    private int size;
    /*对象列表*/
    private List<T> rows;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
