package db;

import org.litepal.crud.DataSupport;

/**
 * Created by 裴哥 on 2018/1/3.
 */

public class Province extends DataSupport {
    private  int    id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private  String provinceName;
    private  int provinceCode;
}