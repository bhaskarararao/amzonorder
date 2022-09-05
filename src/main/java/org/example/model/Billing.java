package org.example.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

@AttributeOverrides({
              @AttributeOverride(name = "billingName",
                      column = @Column(name = "billing_name")),
               @AttributeOverride(name = "billingStore",
                column = @Column(name = "billing_store"))
      })
public class Billing {
    private String billingName;
    private String billingStore;

    public Billing() {

    }

    public Billing(String billingName, String billingStore) {
        this.billingName = billingName;
        this.billingStore = billingStore;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getBillingStore() {
        return billingStore;
    }

    public void setBillingStore(String billingStore) {
        this.billingStore = billingStore;
    }
}
