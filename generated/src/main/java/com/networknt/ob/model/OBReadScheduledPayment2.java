package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBReadScheduledPayment2  {

    private Links Links;
    private Meta Meta;
    private Object Data;

    public OBReadScheduledPayment2 () {
    }

    @JsonProperty("Links")
    public Links getLinks() {
        return Links;
    }

    public void setLinks(Links Links) {
        this.Links = Links;
    }

    @JsonProperty("Meta")
    public Meta getMeta() {
        return Meta;
    }

    public void setMeta(Meta Meta) {
        this.Meta = Meta;
    }

    @JsonProperty("Data")
    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBReadScheduledPayment2 OBReadScheduledPayment2 = (OBReadScheduledPayment2) o;

        return Objects.equals(Links, OBReadScheduledPayment2.Links) &&
               Objects.equals(Meta, OBReadScheduledPayment2.Meta) &&
               Objects.equals(Data, OBReadScheduledPayment2.Data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Links, Meta, Data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadScheduledPayment2 {\n");
        sb.append("    Links: ").append(toIndentedString(Links)).append("\n");        sb.append("    Meta: ").append(toIndentedString(Meta)).append("\n");        sb.append("    Data: ").append(toIndentedString(Data)).append("\n");
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
