package com.app.test.app.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CHEQUE")
public class ChequePayment extends Payment{
    protected String chequeNo;
    protected String chequeType;

    public ChequePayment() {
    }

    public ChequePayment(Double amount, String description, String chequeNo, String chequeType) {
        super(amount, description);
        this.chequeNo = chequeNo;
        this.chequeType = chequeType;
    }

    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public String getChequeType() {
        return chequeType;
    }

    public void setChequeType(String chequeType) {
        this.chequeType = chequeType;
    }
}
