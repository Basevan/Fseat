package com.van.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author TangFuwan
 * @date 2019-08-28 20:11
 * @package com.van.model
 */

/**
 * @ConfigurationProperties(prefix = "person")默认从全局配置文件中获取值
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private int age;
    private boolean boos;
    private String birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoos() {
        return boos;
    }

    public void setBoos(boolean boos) {
        this.boos = boos;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boos=" + boos +
                ", birth='" + birth + '\'' +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
