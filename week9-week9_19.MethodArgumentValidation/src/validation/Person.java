package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("name can't be null, empty or more than 40 char's");
        }
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age can't be less than 0 or more than 120 yrs");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
