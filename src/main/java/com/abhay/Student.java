package com.abhay;

public class Student {
    private int id;

    private String usn;
    private String address;

    public Student() {
    }

    public Student(int id, String usn, String address) {
        this.id = id;
        this.usn = usn;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "com.abhay.Student{" +
                "id=" + id +
                ", usn='" + usn + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
