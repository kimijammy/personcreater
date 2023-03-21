public class Person {
    private String name;
    private int age;
    double height;
    double weight;

    public Person(String name, int age, double height, double weight){
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void growOlder(){
        age++;
        height--;
    }

}
