package com.van.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @Author TangFuwan
 * @date 2019-08-01 15:07
 * @package com.van.model
 */
public class User {

    @NotBlank(message = "用户名不能为空")
    @Length(min=6,max = 12,message="用户名长度必须位于6到12之间")
    private String userName;

    @NotBlank(message = "密码不能为空")
    @Length(min=6,message="密码长度不能小于6位")
    private String userPassword;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "请输入正确的邮箱")
    private String userMail;

    @Pattern(regexp = "^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$", message="请输入正确的11位手机号")
    private String phone;

    private double balance;

    private String userAddress;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", userPassword=" + userPassword + ", userMail=" + userMail + ", phone="
                + phone + ", balance=" + balance + ", userAddress=" + userAddress + "]";
    }
}
