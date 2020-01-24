package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.httpstring.AttachmentConstants;
import com.networknt.utility.Constants;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class ScheduledPaymentsAccountIdGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        Map<String, Object> auditInfo = exchange.getAttachment(AttachmentConstants.AUDIT_INFO);
        String userId = (String)auditInfo.get(Constants.USER_ID_STRING);
        logger.debug("userId = " + userId);
        String accountId = exchange.getQueryParameters().get("AccountId").getFirst();
        logger.debug("accountId = " + accountId);
        String responseBody = null;
        if("stevehu".equals(userId)) {
            switch(accountId) {
                case "22289":
                    responseBody = "{\"Data\":{\"ScheduledPayment\":[{\"AccountId\":\"22289\",\"ScheduledPaymentId\":\"SP03\",\"ScheduledPaymentDateTime\":\"2017-05-05T00:00:00+00:00\",\"ScheduledType\":\"Execution\",\"InstructedAmount\":{\"Amount\":\"10.00\",\"Currency\":\"GBP\"},\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"23605490179017\",\"Name\":\"Mr Tee\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/22289/scheduled-payments/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "31820":
                    responseBody = "{\"Data\":{\"ScheduledPayment\":[{\"AccountId\":\"31820\",\"ScheduledPaymentId\":\"SP03\",\"ScheduledPaymentDateTime\":\"2017-05-05T00:00:00+00:00\",\"ScheduledType\":\"Execution\",\"InstructedAmount\":{\"Amount\":\"10.00\",\"Currency\":\"GBP\"},\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"23605490179017\",\"Name\":\"Mr Tee\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/31820/scheduled-payments/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
        } else if("ericbroda".equals(userId)) {
            switch(accountId) {
                case "42281":
                    responseBody = "{\"Data\":{\"ScheduledPayment\":[{\"AccountId\":\"42281\",\"ScheduledPaymentId\":\"SP03\",\"ScheduledPaymentDateTime\":\"2017-05-05T00:00:00+00:00\",\"ScheduledType\":\"Execution\",\"InstructedAmount\":{\"Amount\":\"10.00\",\"Currency\":\"GBP\"},\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"23605490179017\",\"Name\":\"Mr Tee\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/42281/scheduled-payments/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "41221":
                    responseBody = "{\"Data\":{\"ScheduledPayment\":[{\"AccountId\":\"41221\",\"ScheduledPaymentId\":\"SP03\",\"ScheduledPaymentDateTime\":\"2017-05-05T00:00:00+00:00\",\"ScheduledType\":\"Execution\",\"InstructedAmount\":{\"Amount\":\"10.00\",\"Currency\":\"GBP\"},\"CreditorAccount\":{\"SchemeName\":\"UK.OBIE.SortCodeAccountNumber\",\"Identification\":\"23605490179017\",\"Name\":\"Mr Tee\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/41221/scheduled-payments/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
        }
        if(responseBody != null) {
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
            exchange.getResponseSender().send(responseBody);
        } else {
            exchange.setStatusCode(404);
            exchange.getResponseSender().send("");
        }
    }
}
