package DZ;

public class Patient {
    private int SNILS;
    private String surName;
    private Dept dept;


    public Patient(int SNILS, String surName, Dept dept) {
        this.SNILS = SNILS;
        this.surName = surName;
        this.dept = dept;
    }

    public int getSNILS() {
        return SNILS;
    }

    public String getSurName() {
        return surName;
    }

    public Dept getDept() {
        return dept;
    }
}
