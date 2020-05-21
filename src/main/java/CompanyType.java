import com.google.gson.annotations.SerializedName;

public class CompanyType {
    int id;
    @SerializedName("name_short")
    String nameShort;
    @SerializedName("name_full")
    String nameFull;

    @Override
    public String toString ( ) {
        return "CompanyType{" +
                "id=" + id +
                ", nameShort='" + nameShort + '\'' +
                ", nameFull='" + nameFull + '\'' +
                '}';
    }
}
