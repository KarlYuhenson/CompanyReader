public class State {

    int id;
    String name;
    State state;

    @Override
    public String toString ( ) {
        return "State{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
