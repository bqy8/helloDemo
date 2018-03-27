package com.example.user.domain;


public class Result {

    private String code, message;
    private Object data;

    Result(Object data) {
        this.code = "0";
        this.data = data;
    }

    Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result build(Object data) {
        return new Result(data);
    }

    public static Result build(String code, String msg) {
        return new Result(code, msg);
    }

    public static Result build(String code, String msg, Object object) {
        return new Result(code, msg, object);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
