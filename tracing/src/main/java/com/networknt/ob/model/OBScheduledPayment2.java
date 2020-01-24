package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBScheduledPayment2  {

    private OBBranchAndFinancialInstitutionIdentification5 CreditorAgent;
    private String AccountId;
    private String Reference;
    private OBCashAccount5 CreditorAccount;
    private java.time.LocalDateTime ScheduledPaymentDateTime;
    private OBActiveOrHistoricCurrencyAndAmount InstructedAmount;
    private String ScheduledPaymentId;
    private OBExternalScheduleType1Code ScheduledType;

    public OBScheduledPayment2 () {
    }

    @JsonProperty("CreditorAgent")
    public OBBranchAndFinancialInstitutionIdentification5 getCreditorAgent() {
        return CreditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification5 CreditorAgent) {
        this.CreditorAgent = CreditorAgent;
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @JsonProperty("Reference")
    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    @JsonProperty("CreditorAccount")
    public OBCashAccount5 getCreditorAccount() {
        return CreditorAccount;
    }

    public void setCreditorAccount(OBCashAccount5 CreditorAccount) {
        this.CreditorAccount = CreditorAccount;
    }

    @JsonProperty("ScheduledPaymentDateTime")
    public java.time.LocalDateTime getScheduledPaymentDateTime() {
        return ScheduledPaymentDateTime;
    }

    public void setScheduledPaymentDateTime(java.time.LocalDateTime ScheduledPaymentDateTime) {
        this.ScheduledPaymentDateTime = ScheduledPaymentDateTime;
    }

    @JsonProperty("InstructedAmount")
    public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
        return InstructedAmount;
    }

    public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount InstructedAmount) {
        this.InstructedAmount = InstructedAmount;
    }

    @JsonProperty("ScheduledPaymentId")
    public String getScheduledPaymentId() {
        return ScheduledPaymentId;
    }

    public void setScheduledPaymentId(String ScheduledPaymentId) {
        this.ScheduledPaymentId = ScheduledPaymentId;
    }

    @JsonProperty("ScheduledType")
    public OBExternalScheduleType1Code getScheduledType() {
        return ScheduledType;
    }

    public void setScheduledType(OBExternalScheduleType1Code ScheduledType) {
        this.ScheduledType = ScheduledType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBScheduledPayment2 OBScheduledPayment2 = (OBScheduledPayment2) o;

        return Objects.equals(CreditorAgent, OBScheduledPayment2.CreditorAgent) &&
               Objects.equals(AccountId, OBScheduledPayment2.AccountId) &&
               Objects.equals(Reference, OBScheduledPayment2.Reference) &&
               Objects.equals(CreditorAccount, OBScheduledPayment2.CreditorAccount) &&
               Objects.equals(ScheduledPaymentDateTime, OBScheduledPayment2.ScheduledPaymentDateTime) &&
               Objects.equals(InstructedAmount, OBScheduledPayment2.InstructedAmount) &&
               Objects.equals(ScheduledPaymentId, OBScheduledPayment2.ScheduledPaymentId) &&
               Objects.equals(ScheduledType, OBScheduledPayment2.ScheduledType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CreditorAgent, AccountId, Reference, CreditorAccount, ScheduledPaymentDateTime, InstructedAmount, ScheduledPaymentId, ScheduledType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBScheduledPayment2 {\n");
        sb.append("    CreditorAgent: ").append(toIndentedString(CreditorAgent)).append("\n");        sb.append("    AccountId: ").append(toIndentedString(AccountId)).append("\n");        sb.append("    Reference: ").append(toIndentedString(Reference)).append("\n");        sb.append("    CreditorAccount: ").append(toIndentedString(CreditorAccount)).append("\n");        sb.append("    ScheduledPaymentDateTime: ").append(toIndentedString(ScheduledPaymentDateTime)).append("\n");        sb.append("    InstructedAmount: ").append(toIndentedString(InstructedAmount)).append("\n");        sb.append("    ScheduledPaymentId: ").append(toIndentedString(ScheduledPaymentId)).append("\n");        sb.append("    ScheduledType: ").append(toIndentedString(ScheduledType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
