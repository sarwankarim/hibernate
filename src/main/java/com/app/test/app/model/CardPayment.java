package com.app.test.app.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CARD")
public class CardPayment extends Payment{

    protected String cardNo;
    protected String cardType;

    public CardPayment() {
    }

    public CardPayment(Double amount, String description, String cardNo, String cardType) {
        super(amount, description);
        this.cardNo = cardNo;
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
