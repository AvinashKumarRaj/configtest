package com.test.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name ="customer_alert_subscription", schema = "el")
public class CustomerAlertSubscription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String alertSubscriptionId;
    private String customerId;
    private String kpiId;
    private String appliedType;
    private String applyTypeValue;
    private String thresholdType;
    private Integer thresholdValue;
    private Boolean useSms;
    private Boolean usePush;
    private Boolean useEmail;
    private Boolean useWhatsapp;
    private Boolean useApp;
    private String subscriptionGroupId;

    public String getAlertSubscriptionId() {
        return alertSubscriptionId;
    }

    public void setAlertSubscriptionId(String alertSubscriptionId) {
        this.alertSubscriptionId = alertSubscriptionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getKpiId() {
        return kpiId;
    }

    public void setKpiId(String kpiId) {
        this.kpiId = kpiId;
    }

    public String getAppliedType() {
        return appliedType;
    }

    public void setAppliedType(String appliedType) {
        this.appliedType = appliedType;
    }

    public String getApplyTypeValue() {
        return applyTypeValue;
    }

    public void setApplyTypeValue(String applyTypeValue) {
        this.applyTypeValue = applyTypeValue;
    }

    public String getThresholdType() {
        return thresholdType;
    }

    public void setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
    }

    public Integer getThresholdValue() {
        return thresholdValue;
    }

    public void setThresholdValue(Integer thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    public Boolean getUseSms() {
        return useSms;
    }

    public void setUseSms(Boolean useSms) {
        this.useSms = useSms;
    }

    public Boolean getUsePush() {
        return usePush;
    }

    public void setUsePush(Boolean usePush) {
        this.usePush = usePush;
    }

    public Boolean getUseEmail() {
        return useEmail;
    }

    public void setUseEmail(Boolean useEmail) {
        this.useEmail = useEmail;
    }

    public Boolean getUseWhatsapp() {
        return useWhatsapp;
    }

    public void setUseWhatsapp(Boolean useWhatsapp) {
        this.useWhatsapp = useWhatsapp;
    }

    public Boolean getUseApp() {
        return useApp;
    }

    public void setUseApp(Boolean useApp) {
        this.useApp = useApp;
    }

    public String getSubscriptionGroupId() {
        return subscriptionGroupId;
    }

    public void setSubscriptionGroupId(String subscriptionGroupId) {
        this.subscriptionGroupId = subscriptionGroupId;
    }
}
