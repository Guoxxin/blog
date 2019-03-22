package com.example.demo.entity;
import javax.persistence.*;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="ID_SEQ")
    @SequenceGenerator(name = "ID_SEQ",sequenceName="user_idauto",initialValue=170005,allocationSize=1)
    @Column(name = "userid")
    private Integer userId;
    @Column(name = "username")
    private String userName;
    @Column(name = "nickname")
    private String nickName;
    @Column(name = "password")
    private String passWord;
    @Column(name = "phone")
    private String phone;
    @Column(name = "userimg")
    private String userImg;
    @Column(name = "age")
    private Integer age;
    @Column(name = "sex")
    private String sex;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

