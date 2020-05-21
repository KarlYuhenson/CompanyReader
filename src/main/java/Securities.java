import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Securities {


    @Override
    public String toString ( ) {
        return "Securities{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameFull='" + nameFull + '\'' +
                ", cfi='" + cfi + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", stateRegDate='" + stateRegDate + '\'' +
                '}';
    }

    int id;
    String code;
    @SerializedName("name_full")
    String nameFull;
    String cfi;
    @SerializedName("date_to")
    String dateTo;
    @SerializedName("state_reg_date")
    String stateRegDate;


}
