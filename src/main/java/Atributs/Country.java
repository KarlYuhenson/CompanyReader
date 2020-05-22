package Atributs;

public class Country {
    public int id;
    public String code;
    public String name;

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
