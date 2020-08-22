package entity;

import java.io.Serializable;

/**
 * @author Ying
 */

public class Student implements Serializable {
    private String name;
    private  Integer id;
    private String sex;

    public Student(String name, Integer id, String sex) {
        this.name = name;
        this.id = id;
        this.sex = sex;
    }

    public Student (){}




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sex='" + sex + '\'' +
                '}';
    }
}
