package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBActiveOrHistoricCurrencyAndAmount  {

    private String Amount;
    private String Currency;

    public OBActiveOrHistoricCurrencyAndAmount () {
    }

    @JsonProperty("Amount")
    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBActiveOrHistoricCurrencyAndAmount OBActiveOrHistoricCurrencyAndAmount = (OBActiveOrHistoricCurrencyAndAmount) o;

        return Objects.equals(Amount, OBActiveOrHistoricCurrencyAndAmount.Amount) &&
               Objects.equals(Currency, OBActiveOrHistoricCurrencyAndAmount.Currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Amount, Currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBActiveOrHistoricCurrencyAndAmount {\n");
        sb.append("    Amount: ").append(toIndentedString(Amount)).append("\n");        sb.append("    Currency: ").append(toIndentedString(Currency)).append("\n");
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
