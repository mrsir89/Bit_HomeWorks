package com.example7.spring.model;

import java.util.Date;

public class Todo implements Cloneable {
    private String id;
    private String title;
    private String description;
    private ToDoStatus status;
    private Date fromPlanDate;;
    private Date toPlanDate;
    private Date cancelled;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Todo newTodo = new Todo();
        newTodo.id = this.id;
        newTodo.title = this.title;
        newTodo.description = this.description;
        newTodo.fromPlanDate = this.fromPlanDate;
        newTodo.toPlanDate = this.toPlanDate;
        newTodo.status = this.status;
        newTodo.cancelled = this.cancelled;

        return newTodo;
    }


    public static Todo copy(Todo todo)throws Exception{
        return (Todo)todo.clone();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ToDoStatus getStatus() {
        return status;
    }

    public void setStatus(ToDoStatus status) {
        this.status = status;
    }

    public Date getFromPlanDate() {
        return fromPlanDate;
    }

    public void setFromPlanDate(Date fromPlanDate) {
        this.fromPlanDate = fromPlanDate;
    }

    public Date getToPlanDate() {
        return toPlanDate;
    }

    public void setToPlanDate(Date toPlanDate) {
        this.toPlanDate = toPlanDate;
    }

    public Date getCancelled() {
        return cancelled;
    }

    public void setCancelled(Date cancelled) {
        this.cancelled = cancelled;
    }
}
