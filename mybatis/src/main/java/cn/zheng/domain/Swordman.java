package cn.zheng.domain;

public class Swordman {
    private Integer id;
    private String name;
    private Gender gender;
    private int age;
    private String job;

    public enum Gender {
        男, 女
    }

    public Swordman() {
    }

    public Swordman(Integer id, String name, Gender gender, int age, String job) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.job = job;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Swordman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}