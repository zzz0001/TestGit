package pojo;

/**
 *
 */
public class People {

    private String name;
    private int age;
    private int sex;

    public People() {
    }

    public People(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void work(){
        System.out.println("步骤一");
        System.out.println("步骤二");
        System.out.println("步骤三");
        System.out.println("master 操作");
    }


}
