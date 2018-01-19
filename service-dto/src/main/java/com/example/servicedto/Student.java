package com.example.servicedto;

/**
 * 学生
 *
 * @author HT
 * @date 2018 -01-16 16:13:11
 */
public class Student extends BaseDto{

    /**
     * 学号
     */
    private String number;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;

    /**
     * Instantiates a new Student.
     */
    public Student() {
        super();
    }

    /**
     * Gets number.
     *
     * @return the number
     * @author HT
     * @date 2018 -01-16 16:13:11
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param number the number
     * @author HT
     * @date 2018 -01-16 16:13:11
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Gets name.
     *
     * @return the name
     * @author HT
     * @date 2018 -01-16 16:13:11
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     * @author HT
     * @date 2018 -01-16 16:13:11
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     * @author HT
     * @date 2018 -01-16 16:13:11
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     * @author HT
     * @date 2018 -01-16 16:13:11
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}
