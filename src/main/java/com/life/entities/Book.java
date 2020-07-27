package com.life.entities;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

public class Book {
    private Integer id;
    private String name;
    private String desc;
    private String category;

    public Book() {
    }

    public Book(Integer id, String name, String desc, String category){
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
