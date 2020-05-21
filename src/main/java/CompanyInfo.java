import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyInfo< dateVlaue > {

    int id;
    String code;
    @SerializedName( "name_full" )
    String nameFull;
    @SerializedName( "name_short" )
    public String nameShort;
    String inn;
    String ogrn;
    @SerializedName( "egrul_date" )
    public String egrulDate;
    @SerializedName( "fio_head" )
    String fioHead;
    String address;
    String phone;
    @SerializedName( "e_mail" )
    String eMail;
    String www;
    @SerializedName( "is_resident" )
    boolean isResident;




    @Override
    public String toString ( ) {
        return "CompanyInfo{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameFull='" + nameFull + '\'' +
                ", nameShort='" + nameShort + '\'' +
                ", inn='" + inn + '\'' +
                ", ogrn='" + ogrn + '\'' +
                ", egrulDate='" + egrulDate + '\'' +
                ", fioHead='" + fioHead + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", eMail='" + eMail + '\'' +
                ", www='" + www + '\'' +
                ", isResident=" + isResident +
                '}';
    }
}
