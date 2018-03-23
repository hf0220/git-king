package com.hjl.entity;

public class school {

    private Integer id;
    private String schoolName;
    private Integer tel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "school{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                ", tel=" + tel +
                '}';
    }
}
