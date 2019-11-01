package com.kunlun.baize.sdk.page;

/**
 * @Author 18555
 * @Date 2019/11/1 19:20
 * @Since 1.0.0
 */
public class Page {

    private int currentPage;

    private int begin;

    private int size;

    public Page(int currentPage, int size) {
        this.currentPage = currentPage <= 0 ? 1 : currentPage;
        this.size = size <= 0 ? 10 : size;
        this.begin = (this.currentPage - 1) * this.size;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
