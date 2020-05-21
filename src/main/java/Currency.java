import com.google.gson.annotations.SerializedName;

public class Currency {
    @Override
    public String toString ( ) {
        return "Currency{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameShort='" + nameShort + '\'' +
                ", nameFull='" + nameFull + '\'' +
                '}';
    }

    int id;
    String code;
    @SerializedName("name_short")
    String nameShort;
    @SerializedName("name_full")
    String nameFull;
}
