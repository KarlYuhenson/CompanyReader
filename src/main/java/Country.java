public class Country {
    @Override
    public String toString ( ) {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    int id;
    String code;
    String name;
}
