package com.kunlun.baize.web.model;

/**
 * @Author 18555
 * @Date 2019/11/1 21:47
 * @Since 1.0.0
 */
public class PageResult<T> {

    private Integer currentPage;

    private Integer totalCount;

    private Integer totalPage;

    private Integer size;

    private T data;

    private Boolean isSuccess;

    private String errorMessage;

    public PageResult() {
        this.isSuccess = true;
    }

    public PageResult(Integer currentPage, Integer size, Integer totalCount, T data) {
        this.size = size;
        this.currentPage = currentPage;
        this.totalCount = totalCount;
        this.data = data;
        this.totalPage = (int) Math.ceil(Double.valueOf(totalCount) / Double.valueOf(size));
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        this.isSuccess = false;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
