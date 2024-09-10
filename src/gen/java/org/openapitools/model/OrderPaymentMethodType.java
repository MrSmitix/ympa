package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;PREPAID\&quot;&#x60;):    * &#x60;YANDEX&#x60; — банковской картой.    * &#x60;APPLE_PAY&#x60; — Apple Pay.    * &#x60;GOOGLE_PAY&#x60; — Google Pay.    * &#x60;CREDIT&#x60; — в кредит.    * &#x60;TINKOFF_CREDIT&#x60; — в кредит в Тинькофф Банке.    * &#x60;TINKOFF_INSTALLMENTS&#x60; — рассрочка в Тинькофф Банке.    * &#x60;EXTERNAL_CERTIFICATE&#x60; — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * &#x60;SBP&#x60; — через систему быстрых платежей.    * &#x60;B2B_ACCOUNT_PREPAYMENT&#x60; — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;POSTPAID\&quot;&#x60;):    * &#x60;CARD_ON_DELIVERY&#x60; — банковской картой.    * &#x60;BOUND_CARD_ON_DELIVERY&#x60; — привязанной картой при получении.    * &#x60;CASH_ON_DELIVERY&#x60; — наличными.    * &#x60;B2B_ACCOUNT_POSTPAYMENT&#x60; — заказ оплачивает организация после доставки.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Значение по умолчанию: &#x60;CASH_ON_DELIVERY&#x60;. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderPaymentMethodType {

    @JsonProperty("CASH_ON_DELIVERY") CASH_ON_DELIVERY(String.valueOf("CASH_ON_DELIVERY")), @JsonProperty("CARD_ON_DELIVERY") CARD_ON_DELIVERY(String.valueOf("CARD_ON_DELIVERY")), @JsonProperty("BOUND_CARD_ON_DELIVERY") BOUND_CARD_ON_DELIVERY(String.valueOf("BOUND_CARD_ON_DELIVERY")), @JsonProperty("YANDEX") YANDEX(String.valueOf("YANDEX")), @JsonProperty("APPLE_PAY") APPLE_PAY(String.valueOf("APPLE_PAY")), @JsonProperty("EXTERNAL_CERTIFICATE") EXTERNAL_CERTIFICATE(String.valueOf("EXTERNAL_CERTIFICATE")), @JsonProperty("CREDIT") CREDIT(String.valueOf("CREDIT")), @JsonProperty("GOOGLE_PAY") GOOGLE_PAY(String.valueOf("GOOGLE_PAY")), @JsonProperty("TINKOFF_CREDIT") TINKOFF_CREDIT(String.valueOf("TINKOFF_CREDIT")), @JsonProperty("SBP") SBP(String.valueOf("SBP")), @JsonProperty("TINKOFF_INSTALLMENTS") TINKOFF_INSTALLMENTS(String.valueOf("TINKOFF_INSTALLMENTS")), @JsonProperty("B2B_ACCOUNT_PREPAYMENT") B2_B_ACCOUNT_PREPAYMENT(String.valueOf("B2B_ACCOUNT_PREPAYMENT")), @JsonProperty("B2B_ACCOUNT_POSTPAYMENT") B2_B_ACCOUNT_POSTPAYMENT(String.valueOf("B2B_ACCOUNT_POSTPAYMENT")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    OrderPaymentMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderPaymentMethodType fromValue(String value) {
        for (OrderPaymentMethodType b : OrderPaymentMethodType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



