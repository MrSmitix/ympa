/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;PREPAID\&quot;&#x60;):    * &#x60;YANDEX&#x60; — банковской картой.    * &#x60;APPLE_PAY&#x60; — Apple Pay.    * &#x60;GOOGLE_PAY&#x60; — Google Pay.    * &#x60;CREDIT&#x60; — в кредит.    * &#x60;TINKOFF_CREDIT&#x60; — в кредит в Тинькофф Банке.    * &#x60;TINKOFF_INSTALLMENTS&#x60; — рассрочка в Тинькофф Банке.    * &#x60;EXTERNAL_CERTIFICATE&#x60; — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * &#x60;SBP&#x60; — через систему быстрых платежей.    * &#x60;B2B_ACCOUNT_PREPAYMENT&#x60; — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;POSTPAID\&quot;&#x60;):    * &#x60;CARD_ON_DELIVERY&#x60; — банковской картой.    * &#x60;BOUND_CARD_ON_DELIVERY&#x60; — привязанной картой при получении.    * &#x60;CASH_ON_DELIVERY&#x60; — наличными.    * &#x60;B2B_ACCOUNT_POSTPAYMENT&#x60; — заказ оплачивает организация после доставки.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Значение по умолчанию: &#x60;CASH_ON_DELIVERY&#x60;. 
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

