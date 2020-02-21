package com.app.test.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String cnic;

    @ManyToMany
    private List<Task> tasks;

    public Employee() {
    }

    public Employee(Long id, String name, String cnic, List<Task> tasksList) {
        this.id = id;
        this.name = name;
        this.cnic = cnic;
        this.tasks = tasksList;
    }

    public Employee(String name, String cnic, List<Task> tasksList) {
        this.name = name;
        this.cnic = cnic;
        this.tasks = tasksList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public List<Task> getTasksList() {
        return tasks;
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasks = tasksList;
    }
}
