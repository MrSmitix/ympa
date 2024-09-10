package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (`\"paymentType\": \"PREPAID\"`):    * `YANDEX` — банковской картой.    * `APPLE_PAY` — Apple Pay.    * `GOOGLE_PAY` — Google Pay.    * `CREDIT` — в кредит.    * `TINKOFF_CREDIT` — в кредит в Тинькофф Банке.    * `TINKOFF_INSTALLMENTS` — рассрочка в Тинькофф Банке.    * `EXTERNAL_CERTIFICATE` — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * `SBP` — через систему быстрых платежей.    * `B2B_ACCOUNT_PREPAYMENT` — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (`\"paymentType\": \"POSTPAID\"`):    * `CARD_ON_DELIVERY` — банковской картой.    * `BOUND_CARD_ON_DELIVERY` — привязанной картой при получении.    * `CASH_ON_DELIVERY` — наличными.    * `B2B_ACCOUNT_POSTPAYMENT` — заказ оплачивает организация после доставки.  * `UNKNOWN` — неизвестный тип.  Значение по умолчанию: `CASH_ON_DELIVERY`. 
 */
case class OrderPaymentMethodType()

object OrderPaymentMethodType {
    /**
     * Creates the codec for converting OrderPaymentMethodType from and to JSON.
     */
    implicit val decoder: Decoder[OrderPaymentMethodType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderPaymentMethodType] = deriveEncoder
}