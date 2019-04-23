package com.clouway;

public class Dog implements java.io.Serializable{
    private String name;
    private String breed;
    private Integer age;

    public Dog() {
    }

    public Dog(String name, String breed, Integer age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {return name;}
    public String getBreed() {return breed;}
    public Integer getAge() {return age;}

    public void setName(String name) {this.name = name;}
    public void setBreed(String breed) {this.breed = breed;}
    public void setAge(Integer age) {this.age = age;}

    @Override
    public String toString(){
        return this.name+" "+this.breed+" "+this.age;
    }
}
