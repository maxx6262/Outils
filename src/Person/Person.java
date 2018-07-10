package Person;

import Date.Date;

public class Person {
    private String name;
    private Date birthday;
    private int id;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public Person(String name, Date birthday, int id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", id=" + id +
                '}';
    }
}
