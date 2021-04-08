package cn.zheng.IOC;

public class Order {
    private String name;
    private String address;

    public Order() {
        System.out.println("第一步：执行无参数构造方法创建bean实例");
    }

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步：调用set方法设置属性值");
    }

    public void initMethod() {
        System.out.println("第三步：执行初始化的方法");
    }

    public void destoryMethod() {
        System.out.println("第五步：执行销毁的方法");
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
