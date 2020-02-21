package com.app.test.app.model;

/*
The Single Table strategy creates one table for each class hierarchy. This is also the default strategy chosen by JPA if we don't specify one explicitly.
Payment(id, amount)
    /               \
   /                 \
 Card(card_no, type)  Cheque(cheque_no, type)
 */

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PAYMENT_TYPE", discriminatorType = DiscriminatorType.STRING)
public class Payment {

    @Id
    @GeneratedValue
    private Long id;

    private Double amount;

    private String description;

    public Payment() {
    }

    public Payment(Long id, Double amount, String description) {
        this.id = id;
        this.amount = amount;
        this.description = description;
    }

    public Payment(Double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
