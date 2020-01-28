package describe_obj;

import java.util.Objects;

public class Pets {
    private String name;
    private int age;
    private String breed;

    public Pets(){}

    public Pets(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pets pets = (Pets) o;
        return age == pets.age &&
                Objects.equals(name, pets.name) &&
                Objects.equals(breed, pets.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed);
    }
}
