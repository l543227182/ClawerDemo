package com.lc.utils;

/**
 * Created by luochao.byron on 2017/11/9.
 */
public class person {
    private Long id;
    private String name;

    public person(Long id, String name, byte gender, short age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public person() {
        this(1l, "jack", (byte) 1, (short) 18);
    }

    private byte gender;        // 性别 1：男 2：女
    private short age;          // 年龄

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte getGender() {
        return gender;
    }

    public short getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void SayHello(){
        System.out.print("hello people");
    }

}
