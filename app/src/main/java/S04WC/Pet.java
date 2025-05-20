package S04WC;

/**
 * @author Arvan Kadkol
 * @since 4/9/25
 */

class Pet {
    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;

    public Pet(String name, int age, double weight, String type, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Pet:\n\t";
        res += "Name: " + name;
        res += "\n\tAge: " + age;
        res += "\n\tWeight: " + weight;
        res += "\n\tType: " + type;
        res += "\n\tBreed: " + breed;
        return res;
    }

}

class TesterClass2 {
    public static void main(String[] args) {
        Pet pet1 = new Pet("bob", 30, 0.05, "dog", "german shepard");
        Pet pet2 = new Pet("Bobby", 50, 35.02, "cat", "Calico");

        System.out.println(pet1);
        System.out.println(pet2);

        pet1.setAge(pet2.getAge());
        pet1.setBreed(pet2.getBreed());
        pet1.setName(pet2.getName());
        pet1.setType(pet2.getType());
        pet1.setWeight(pet2.getWeight());
    }
}