package cn.zheng.IOC;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] courses;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
