package com.example.crudapp2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int SId;
    private String SFirstName;
    private String SLastName;
    private String SEmail;
    private String Standard;
    private int SDOB;


    public int getSId() {
        return SId;
    }

    public void setSId(int SId) {
        this.SId = SId;
    }

    public String getSFirstName() {
        return SFirstName;
    }

    public void setSFirstName(String SFirstName) {
        this.SFirstName = SFirstName;
    }

    public String getSLastName() {
        return SLastName;
    }

    public void setSLastName(String SLastName) {
        this.SLastName = SLastName;
    }

    public String getSEmail() {
        return SEmail;
    }

    public void setSEmail(String SEmail) {
        this.SEmail = SEmail;
    }

    public String getStandard() {
        return Standard;
    }

    public void setStandard(String standard) {
        Standard = standard;
    }

    public int getSDOB() {
        return SDOB;
    }

    public void setSDOB(int SDOB) {
        this.SDOB = SDOB;
    }
}
