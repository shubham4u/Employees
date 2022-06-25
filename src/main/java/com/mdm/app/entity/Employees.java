package com.mdm.app.entity;


import javax.persistence.*;


@Entity
@Table(name = "EMPLOYEES")
public class Employees {

    @Id
    @Column(name = "EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EMPLOYEE_ID;

    @Column(name = "FIRST_NAME")
    private String FIRST_NAME;
    @Column(name = "LAST_NAME")
    private String LAST_NAME;
//    @Column(name = "EMAIL")
//    private String EMAIL;
//    @Column(name = "PHONE_NUMBER")
//    private String PHONE_NUMBER;
//    @Column(name = "HIRE_DATE")
//    private Date HIRE_DATE;
//    @Column(name = "JOB_ID")
//    private int JOB_ID;
//    @Column(name = "SALARY")
//    private double SALARY;
//    @Column(name = "COMMISSION_PCT")
//    private String COMMISSION_PCT;
//    @Column(name = "MANAGER_ID")
//    private int MANAGER_ID;
//    @Column(name = "DEPARTMENT_ID")
//    private int DEPARTMENT_ID;


    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public void setEMPLOYEE_ID(int EMPLOYEE_ID) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

//    public String getEMAIL() {
//        return EMAIL;
//    }
//
//    public void setEMAIL(String EMAIL) {
//        this.EMAIL = EMAIL;
//    }
//
//    public String getPHONE_NUMBER() {
//        return PHONE_NUMBER;
//    }
//
//    public void setPHONE_NUMBER(String PHONE_NUMBER) {
//        this.PHONE_NUMBER = PHONE_NUMBER;
//    }
//
//    public Date getHIRE_DATE() {
//        return HIRE_DATE;
//    }
//
//    public void setHIRE_DATE(Date HIRE_DATE) {
//        this.HIRE_DATE = HIRE_DATE;
//    }
//
//    public int getJOB_ID() {
//        return JOB_ID;
//    }
//
//    public void setJOB_ID(int JOB_ID) {
//        this.JOB_ID = JOB_ID;
//    }
//
//    public double getSALARY() {
//        return SALARY;
//    }
//
//    public void setSALARY(double SALARY) {
//        this.SALARY = SALARY;
//    }
//
//    public String getCOMMISSION_PCT() {
//        return COMMISSION_PCT;
//    }
//
//    public void setCOMMISSION_PCT(String COMMISSION_PCT) {
//        this.COMMISSION_PCT = COMMISSION_PCT;
//    }
//
//    public int getMANAGER_ID() {
//        return MANAGER_ID;
//    }
//
//    public void setMANAGER_ID(int MANAGER_ID) {
//        this.MANAGER_ID = MANAGER_ID;
//    }
//
//    public int getDEPARTMENT_ID() {
//        return DEPARTMENT_ID;
//    }
//
//    public void setDEPARTMENT_ID(int DEPARTMENT_ID) {
//        this.DEPARTMENT_ID = DEPARTMENT_ID;
//    }


    @Override
    public String toString() {
        return "Employees{" +
                "EMPLOYEE_ID=" + EMPLOYEE_ID +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                '}';
    }
}
