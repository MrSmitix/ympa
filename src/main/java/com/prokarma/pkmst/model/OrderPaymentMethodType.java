package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
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

