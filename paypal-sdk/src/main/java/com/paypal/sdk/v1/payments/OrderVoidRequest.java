// This class was generated on Mon, 09 Apr 2018 18:13:18 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// OrderVoidRequest.java
// @version 0.1.0-dev+291f3f
// @type request
// @data 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
// DO NOT EDIT
package com.paypal.sdk.v1.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Voids, or cancels, an order, by ID. You cannot void an order if the payment has already been partially or fully captured.
 */
public class OrderVoidRequest extends HttpRequest<Order> {

    public OrderVoidRequest(String orderId) {
        super("/v1/payments/orders/{order_id}/do-void?", "POST", Order.class);
        try {
            path(path().replace("{order_id}", URLEncoder.encode(String.valueOf(orderId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public OrderVoidRequest paypalRequestId(String paypalRequestId) {
        header("PayPal-Request-Id", String.valueOf(paypalRequestId));
        return this;
    }
    
    
}
