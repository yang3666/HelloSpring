package com.jy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Student {

    private static final Log LOGGER = LogFactory.getLog(Student.class);
    private int id;
    private String name;
    private Grade grade;

    /**
     * 无参构造方法，在没有其他带参构造方法的情况下，可以省略
     */
    public Student() {
    }

    /**
     * id 属性的 setter 方法
     */
    public void setId(int id) {
        LOGGER.info("正在执行 Student 类的 setId() 方法…… ");
        this.id = id;
    }

    /**
     * name 属性的 setter 方法
     */
    public void setName(String name) {
        LOGGER.info("正在执行 Student 类的 setName() 方法…… ");
        this.name = name;
    }

    public void setGrade(Grade grade) {
        LOGGER.info("正在执行 Student 类的 setGrade() 方法…… ");
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
