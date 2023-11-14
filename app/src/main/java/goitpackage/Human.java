package goitpackage;
public class Human {
    public String name;
    public String lastname;
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}


