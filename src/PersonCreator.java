public class PersonCreator {
    public static void main(String[] args) {
        Person person1 = new Person("James Peterson", 35,179,73.5);
        Person person2 = new Person("Bob Thornley", 25,171,68.2);

        System.out.println("In 2022, "+ person1.getName()+" was "+ person1.getAge()+". "+ person1.getName()+" was "+person1.getHeight() +"cms tall " +
                "and weighed "+ person1.getWeight() +"kgs" );
        System.out.println("In 2022, "+person2.getName()+" was "+ person2.getAge()+". "+ person2.getName()+" was "+person2.getHeight() +"cms tall " +
                "and weighed "+ person2.getWeight() +"kgs" );
        person1.growOlder();
        person2.growOlder();
        System.out.println("In 2023, "+ person1.getName()+" is now "+ person1.getAge()+". "+ person1.getName()+" is now "+person1.getHeight() +"cms tall " +
                "and currently weighs "+ person1.getWeight() +"kgs" );
        System.out.println("In 2023, "+ person2.getName()+" is now "+ person2.getAge()+". "+ person2.getName()+" is now "+person2.getHeight() +"cms tall " +
                "and currently weighs "+ person2.getWeight() +"kgs" );


    }
}
