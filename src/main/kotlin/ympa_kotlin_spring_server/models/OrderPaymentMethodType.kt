package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (`\"paymentType\": \"PREPAID\"`):    * `YANDEX` — банковской картой.    * `APPLE_PAY` — Apple Pay.    * `GOOGLE_PAY` — Google Pay.    * `CREDIT` — в кредит.    * `TINKOFF_CREDIT` — в кредит в Тинькофф Банке.    * `TINKOFF_INSTALLMENTS` — рассрочка в Тинькофф Банке.    * `EXTERNAL_CERTIFICATE` — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * `SBP` — через систему быстрых платежей.    * `B2B_ACCOUNT_PREPAYMENT` — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (`\"paymentType\": \"POSTPAID\"`):    * `CARD_ON_DELIVERY` — банковской картой.    * `BOUND_CARD_ON_DELIVERY` — привязанной картой при получении.    * `CASH_ON_DELIVERY` — наличными.    * `B2B_ACCOUNT_POSTPAYMENT` — заказ оплачивает организация после доставки.  * `UNKNOWN` — неизвестный тип.  Значение по умолчанию: `CASH_ON_DELIVERY`. 
* Values: CASH_ON_DELIVERY,CARD_ON_DELIVERY,BOUND_CARD_ON_DELIVERY,YANDEX,APPLE_PAY,EXTERNAL_CERTIFICATE,CREDIT,GOOGLE_PAY,TINKOFF_CREDIT,SBP,TINKOFF_INSTALLMENTS,B2B_ACCOUNT_PREPAYMENT,B2B_ACCOUNT_POSTPAYMENT,UNKNOWN
*/
enum class OrderPaymentMethodType(@get:JsonValue val value: kotlin.String) {

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
    B2B_ACCOUNT_PREPAYMENT("B2B_ACCOUNT_PREPAYMENT"),
    B2B_ACCOUNT_POSTPAYMENT("B2B_ACCOUNT_POSTPAYMENT"),
    UNKNOWN("UNKNOWN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrderPaymentMethodType {
                return values().first{it -> it.value == value}
        }
    }
}

