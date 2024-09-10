package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;PREPAID\&quot;&#x60;):    * &#x60;YANDEX&#x60; — банковской картой.    * &#x60;APPLE_PAY&#x60; — Apple Pay.    * &#x60;GOOGLE_PAY&#x60; — Google Pay.    * &#x60;CREDIT&#x60; — в кредит.    * &#x60;TINKOFF_CREDIT&#x60; — в кредит в Тинькофф Банке.    * &#x60;TINKOFF_INSTALLMENTS&#x60; — рассрочка в Тинькофф Банке.    * &#x60;EXTERNAL_CERTIFICATE&#x60; — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * &#x60;SBP&#x60; — через систему быстрых платежей.    * &#x60;B2B_ACCOUNT_PREPAYMENT&#x60; — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;POSTPAID\&quot;&#x60;):    * &#x60;CARD_ON_DELIVERY&#x60; — банковской картой.    * &#x60;BOUND_CARD_ON_DELIVERY&#x60; — привязанной картой при получении.    * &#x60;CASH_ON_DELIVERY&#x60; — наличными.    * &#x60;B2B_ACCOUNT_POSTPAYMENT&#x60; — заказ оплачивает организация после доставки.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Значение по умолчанию: &#x60;CASH_ON_DELIVERY&#x60;. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (`\"paymentType\": \"PREPAID\"`):    * `YANDEX` — банковской картой.    * `APPLE_PAY` — Apple Pay.    * `GOOGLE_PAY` — Google Pay.    * `CREDIT` — в кредит.    * `TINKOFF_CREDIT` — в кредит в Тинькофф Банке.    * `TINKOFF_INSTALLMENTS` — рассрочка в Тинькофф Банке.    * `EXTERNAL_CERTIFICATE` — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * `SBP` — через систему быстрых платежей.    * `B2B_ACCOUNT_PREPAYMENT` — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (`\"paymentType\": \"POSTPAID\"`):    * `CARD_ON_DELIVERY` — банковской картой.    * `BOUND_CARD_ON_DELIVERY` — привязанной картой при получении.    * `CASH_ON_DELIVERY` — наличными.    * `B2B_ACCOUNT_POSTPAYMENT` — заказ оплачивает организация после доставки.  * `UNKNOWN` — неизвестный тип.  Значение по умолчанию: `CASH_ON_DELIVERY`. 
 */
public enum OrderPaymentMethodType {
  
  CASH_ON_DELIVERY("CASH_ON_DELIVERY"),
  
  CARD_ON_DELIVERY("CARD_ON_DELIVERY"),
  
  BOUND_CARD_ON_DELIVERY("BOUND_CARD_ON_DELIVERY"),
  
  YANDEX("YANDEX"),
  
  APPLE_PAY("APPLE_PAY"),
  
  EXTERNAL_CERTIFICATE("EXTERNAL_CERTIFICATE"),
  
  CREDIT("CREDIT"),
  
  GOOGLE_PAY("GOOGLE_PAY"),
  
  TINKOFF_CREDIT("TINKOFF_CREDIT"),
  
  SBP("SBP"),
  
  TINKOFF_INSTALLMENTS("TINKOFF_INSTALLMENTS"),
  
  B2_B_ACCOUNT_PREPAYMENT("B2B_ACCOUNT_PREPAYMENT"),
  
  B2_B_ACCOUNT_POSTPAYMENT("B2B_ACCOUNT_POSTPAYMENT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OrderPaymentMethodType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderPaymentMethodType fromValue(String text) {
    for (OrderPaymentMethodType b : OrderPaymentMethodType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


