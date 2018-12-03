
package com.gurcanataman.retrofitinlocal.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseCRUD {

    @SerializedName("hata")
    @Expose
    private Boolean hata;
    @SerializedName("mesaj")
    @Expose
    private String mesaj;
    @SerializedName("code")
    @Expose
    private Integer code;

    @SerializedName("checkData")
    @Expose
    private Boolean checkData;

    public Boolean getHata() {
        return hata;
    }

    public void setHata(Boolean hata) {
        this.hata = hata;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getCheckData() {
        return checkData;
    }

    public void setCheckData(Boolean checkData) {
        this.checkData = checkData;
    }
}
